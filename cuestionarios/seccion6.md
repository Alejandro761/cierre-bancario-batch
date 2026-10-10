# 06 · Modificadores, static e inicialización

1. Java importa java.lang por defecto.

2. No es necesario importar explícitamente el paquete java.lang, el compilador ya lo trae por defecto.

3. Se imprime "Resultado: 15", ya que Utilidades.sumar(5, 10) realiza la suma de los números y retorna el resultado para finalmente concatenarlo al String.

4. Un bloque estático se ejecuta una sola vez, en el momento exacto en que la clase es cargada e inicializada por la JVM.

5. La varibale v es protected, este modificador de acceso lo otorga en la misma clase, en el paquete y en las subclases (clases que hereden de C aunque estén en diferentes paquetes).

6. Las palabras reservadas static y public pueden preceder a class.

7. Una clase de nivel superior solo puede ser public o tener acceso por default. Puede ser abstract y final, asi no se puede instanciar y tampoco puede ser heredada. Puede ser strictfp para restringir los cáculos de coma flotante.

8. Es necesario cambiar el modificador de acceso de one a protected para que Y pueda acceder a él.

9. La salida es 420. EL constructo de ExtendedA es privado pero accesible en la misma clase. Este a su vez llama al constructor de su clase padre, el cual es accesible porque el protected.

10. Primero se ejecuta el bloque estático imprimiendo "static". Al crear un objeto se ejecuta el código en las llaves vacías imprimiendo "default" y después se ejecuta el códgio del constructo imprimiendo "Constructor". Finalmente la llamada al método getSaludo imprime "Variable".

11. Primero se ejecuta el código "static" imprimiendo "Static block". La llamada a la función estática staticMethod() imprime "Static method". La llamada al constructor ejecuta primero el bloque vacío, imprimiendo "Instance block" y después se ejecuta el constructor, el cual imprime "Constructor".

12. Primero se crea una instancia de Test asignada a la variable m, pero después, m apunta a un nuevo objeto creado. Por lo tanto, el valor de m.value se es "ABCX".

13. Primero se ejecutan los bloques estáticos. Posteriormente, por cada objeto creado se ejcutan primero los bloques vacíos y después el constructor.