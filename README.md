# Cierre bancario con Spring Batch

**Autor:** Alejandro Elías Castañeda Ibarra

## Cómo correrlo

    docker compose up -d --wait
    ./correr.sh 2026-09-30 prueba
    ./ver-batch.sh

## Día 1 · Mi primer Job

### Boleto de salida

1. ¿Qué diferencia hay entre un proceso batch y la API REST de la Semana 3? Da dos. 

    Un proceso batch termina, una API nunca, se queda escuchando. Por esa misma razón, hay alguien esperando la respuesta de una API, meintras que nadie espera respuesta del proceso batch mientras corre.

2. ¿Qué es un Job, qué es un Step y qué es un Tasklet?

    Job es un proceso completo en spring batch, este contiene steps. Un Step es una paso o fase del Job. Tasklet representa una tarea, una sola operación, que se ejecuta dentro de un Step.

3. Con tus tablas: ¿qué diferencia hay entre una **JobInstance** y una **JobExecution**?

    JobInstance representa una instancia de un Job, este Job puede tener una o más ejecuciones dependiendo de los Steps que corra. JobExecution es un intento de correr una instancia de Job, está relacionada a un Step y un Job. Una instancia puede tener varias ejecuciones.

4. ¿Por qué Spring Batch no deja correr dos veces el cierre del 28?

    Porque una instancia de un Job solo se puede correr con éxito una vez, se tendrían que cambiar los parámetros (como la fecha) para que se trate de una instancia diferente y ejecutarla.

5. (MP-4, paso 6) Si mañana llega el archivo del 25 y corres otra vez el cierre del 25, ¿será otra instancia u otra ejecución de la misma? ¿Por qué lo crees?

    Una ejecución de la misma, porque se están utilizando los mismos parámetros, por lo tanto Spring lo detecta y manda error. A menos que se utilce una fuente de datos distinta (o algun otro parámetro que sea diferente), entonces sí será una instancia diferente y se podrá ejecutar con éxito.

## Día 2 · El primer chunk

### Boleto de salida

1. ¿Qué diferencia hay entre un step de tipo Tasklet y uno de tipo chunk?

    Un Tasklet ejecuta una sola tarea, mientras que un chunk puede realizar varias tareas en un solo step.

2. ¿Qué hace cada una de las tres piezas de un chunk? ¿Cuál es opcional?

    El lector se encarga de leer los datos (puede ser un archivo csv) por bloque, el escritor se encarga de guardar en la base de datos un bloque completo, y el procesador, el cual es opcional, limpia cada bloque de datos antes de pasar al escritor.

3. Con 45 movimientos y chunks de 10, ¿cuántos commits habría? ¿Y con chunks de 50?

    Tanto con 45 como con 50 haría 5 commits, ya que en cada commit caben un máximo de 10 movimientos.

4. ¿Por qué el Escritor recibe el chunk completo y no un movimiento a la vez?

    Porque al momento de armar el step del chunk se específica su tamaño con la función chunk() antes de integrar el lector y el escritor. 

5. Mi predicción de la MP-3, paso 1: ¿qué habría pasado sin el Procesador?

    Habrían más tipos de movimientos ya que en el csv hay filas las cuales su tipo está en mayúscula o minúsculas y con espacios al principio. El procesador ayuda a evitar esto, realizando la limpieza necesaria antes de que el escritor los inserte a la base de datos.

## Día 3 · Parámetros, fallas y reinicio

### Boleto de salida

1. ¿Qué diferencia hay entre una JobInstance y una JobExecution? Usa como ejemplo el cierre del 25.

    Una JobInstance es una instancia del job definida por sus parámetros, mientras que JobExecution es un intento de ejecución de la instancia. En el caso del cierre del 25, como la primera ejecución de esa instancia falló, permitió hacer otra ejecución relacionada a la misma instancia que terminó correctamente.

2. ¿En qué caso Spring Batch se niega a correr un cierre, y en qué caso lo reinicia?

    Se niega cuando ya existe una ejecución que terminó bien con los mismos parámetros (misma instancia). Lo reinicia cuando la ejecución de una instancia falló.

3. En el reinicio del día 5, ¿por qué el step de carga leyó 10 movimientos y no 20?

    Porque en la primera ejecución, el primer chunk alcanzó a leer los primeros 10 movimientos, pero el segundo chunk falla al leer el movimiento 14 y se deshace. En el reinicio Spring ya sabe que el primer chunk  procesó y guardó correctamente los primeros 10 movimientos en la base de datos, por lo que reanuda el job en el segundo chunk con los 10 movimientos restantes.

4. ¿Qué diferencia hay entre un movimiento **filtrado** y uno **omitido**?

    Filtrado son los movimientos que pasaron por una condicional if en el procesador, los omitidos son los movimientos que escapan de los filtros del procesador y generan un error al venir en un formato incorrecto, los cuales se van a ignorar (se debe definir la cantidad de omitidos tolerados).

5. ¿Por qué importa el código de salida, si el estado ya queda en las tablas?

    Los código de sálida dan mucho información acerca del proceso del job, sobretodo cuando el job falla, ya que el código de salida indica el tipo de error.

## Día 4 · De MySQL a MongoDB

### Boleto de salida

1. ¿Qué hace cada uno de los tres steps de tu Job, y de qué tipo es cada uno?

    El verificarArchivoStep de tipo tasklet verifica que exista el archivo del día y cuenta el número de movimientos que contiene. El cargarMovimientosStep de tipo Chunk lee cada movimiento (lector), lo procesa (procesador) y lo escribe en la base de datos (escritor) de 10 en 10, es decir, en chunks de 10. El publicarSaldosStep, también de tipo Chunk, lee la base de datos de los movimientos y cálcula el saldo de cada cuenta y lo inserta en una base de datos de mongo.

2. ¿Por qué el cierre del 9 no duplicó los saldos, y el del 10 (sin `@Id`) sí?

    Porque en día 9, está específicado que el id sera el número de la cuenta, así que solo busca si existe la cuenta (el id) en la base de datos y reemplaza el registro. En cambio, en el día 10, al quitarle la anotacios @Id a la cuenta, mongo crea un Id único y como no existe vuelve a crear un registro para esa cuenta en la base de datos.

3. Al reiniciar el cierre del 11, ¿por qué no se cargó otra vez el archivo?

    Porque el Step que se encarga de cargar el archivo del día se completo con éxito, batch permite realizar una nueva ejecución de esa misma instancia a partir del Step que falló (publicarSaldos) en la ejecución anterior reanudando el Job en vez de sobreescribirlo y duplicar la carga del archivo.

4. ¿Qué diferencia hay entre `spring-boot-starter-data-mongodb` y «Spring Batch MongoDB» (`batch-data-mongodb`)?

    Spring Batch MongoDB es para que Batch guarde sus propias tablas, pero nosotros ya estamos utilizando MySQL. Con Spring Boot MongoDB nosotros podemos crear tablas y guardar registros, en este caso guardamos las cuentas y su saldo.

## Lo que aprendí esta semana

Aprendí que un proceso batch es un proceso por lotes, es decir, se dividen varias tareas en bloques y se ejecutan. Un job representa un procesamiento el cuál está definido por sus parámetros. El Job se compone de step que son los pasos que va a ejecutar, cada step puede tener un lector y un escritor para leer y escribir respectivamente en archivos o bases de datos. Cuando falla un Job Spring lo alamacená en la base de datos y además permite visualizar el log que contiene el error específico y que línea lo generó. Spring permite volver a ejecutar el Job y lo reanuda en el Step que generó el error, evitando hacer todo desde el principio o duplicar datos.
