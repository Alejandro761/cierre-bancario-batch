# 08 · Clases abstractas, interfaces, enums y anidadas

1. Una clase abstracta no se puede instanciar, solo se puede heredar. Una clase final no se puede heredar, solo instanciar. Por lo tanto, la opción inválida es d.

2. No se pueden crear objetos de clases abstractas. Las interfaces sí pueden heredar otras interfaces, incluso pueden heredar múltiples interfaces pero no pueden heredar de clases. Si una clase tiene métodos abstractos entonces la clase debe ser abstracta.

3. Una clase abstracta sirve para ser extendida por una clase concreta, pero no puede extender una interfaz, la puede implementar.

4. El código compila sin error, no hay restricciones sobre tener métodos abstractos en una clase abstracta de forma obligatoria.

5. El programa imprime "Drawing a circle" y después "This is a shape". Ambas funciones son herencia de la superclase, siendo draw un método abstracto el cual es implementado de forma correcta (respeta la visibilidad y firma) por Circle.

6. Se imprime "Car started Vehicle stopped Bike started Vehicle stopped". Es válido crear un objeto y asignarlo a una referencia de la superclase abstracta. Tanto Bike como Car implementan de forma diferente pero correcta el método start. 

7. Mediante un foreach, se itera el enum Day, imprimiendo todos los valores que tiene. Day.values() regresa un arreglo con todas las constantes de Day.

8. La opción b genera error de compilación porque al implementar stop se está reduciendo su visibilidad, ya que en la interfaz, al no declarar un modificador de acceso en los métodos, se intuye que son public.

9. En Java, el modificador abstract se aplica a clases, interfaces y métodos, no a variables.

10. Ninguna de las opciones es válida porque al implementar un método abstracto de una interfaz entonces la clase debe ser abtracta. Tampoco se puede reducir la visibilidad de los métodos implementados.

11. Se genera error de compilación porque la implementación de getGait() no puede ser más estricto que public. Además, la variable Weight no existe, deberia ser weight.

12. Se imprime "Amarillo Rosa Rojo", corresponde a las implementaciones de A3, ya que el objeto creado es una instancia de esa clase.

13. Equals compara el contenido, por lo tanto, se imprime "red" en la primera iteración (c toma el valor RED). El operador == compara las referencias de memoria, y como en la segunda iteración c apunta a GREEN, se retorna true y se imprime "green". La tercera condición falla porque una constante enum no es un string, no tienen el mismo contenido.

14. Todas las opciones son válidas. Una clase anidada puede tener cualquier modificador que cualquier clase en Java.