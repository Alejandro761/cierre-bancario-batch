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