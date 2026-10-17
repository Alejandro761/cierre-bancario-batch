# 10 · Colecciones y genéricos

1. Set es una colección que no puede contener valores duplicados.

2. Un ArrayList es una lista de objetos que permite elementos duplicados y mantiene el orden de insercción. No almacena tipos primitivos directamente, Java aplica autoboxing en ellos.

3. Tanto Array como ArrayList permiten valores duplicados, pero un array de tipos primitivos no pueden almacenar nulos.

4. Dictionary es una clase abstracta antigua. Fue reemplazada completamente por la interfaz Map.

5. Si dos objetos son iguales según el método equals(), ambos deben producir el mismo código hash numérico al invocar el método hashCode().

6. Después de añadir los Strings a la lista, se invoca printList(list), por lo que imprime los elementos de la lista en orden. Después se imprime el tamaño de la lista , posteriormente un mensaje con la función list.contains("Banana"), la cual regresa true. Finalmente se imprime el elento en el índice 1, el cual es Banana.

7. La función Collections.sort(numeros) ordena de menor a mayor la lista de los números, por lo tanto, se imprime [3, 5, 6, 8].

8. La opción c aplica de forma correcta una clase genérica, permitiendo instanciar Box con cualquier tipo de objeto. La clase d tambien es correcta, ya que restringe los tipos permitidos a Number o cualquier subclase de este.

9. La clase LinkedHashSet no permite valores duplicados, mantiene el orden de inserción, además de que provee iteración rápida y busqueda aleatoria eficiente.

10. La clase Item implementa correctamente la interfaz Comparable< Item > y sobrescribe el método compareTo(Item other). Al invocar Collections.sort(items), los elementos de la lista se ordenan según el criterio implementado en compareTo (por nombre). Por lo tanto, la salida muestra los artículos ordenados por nombre.

11. La clase Item implementa bien la interfaz Comparable, además sobreescribe el método compareTo para ordenar por la propiedad name. Se imprime "Apple: 3 Banana: 2 Cherry: 1".

12. La clase MySort implementa Comparator< Integer > y redefine el método compare(Integer x, Integer y) invirtiendo el orden de comparación. Al invocar Arrays.sort(primes, ms) los elementos se ordenan de forma descendente, imrpimiendo 7 5 3 2.

13. Se implementa Comparator< Long > en la clase SorLong, sobreescribiendo el método compare para invertir el orden de comparación. Al llamar Arrays.sort(values, sort) se imprime [70, 50, 30, 20].

14. Collections.reverseOrder() retorna un Comparator que invierte el orden natural de los objetos que implementan Comparable, en este caso de tipo Integer. Por lo tanto se imprime 8, 6, 4, 1.

15. Al definir Comparable<String> listNames, la inferencia de tipos genéricos en Java infiere automáticamente que Collections.reverseOrder() produce un Comparator<String>. Al invocar Collections.sort(names, listNames) se ordenan de forma alfabético inverso. Se imprime "Nadia, Mariel, Elo, Alejandro".

16. La opción a es correcta, si la operación retorna un número negativo, entonces p1 va antes que p2. La opción c implementa de la forma recomendada la función compare.

17. Se crea un ArrayList sin especificar genéricos y se agregan elementos de tipo int. después se elimina con remove el índice 1. Al final se imprime [7, 5, 1].

18. Se retorna true y no se cumple el contrato, ya que equals originalmente verifica que ambos objetos sean semejantes y esta implementación solo verifica que la propiedad name del objeto como parámetro no sea nulo.

19. Un HashMap no puede tener claves repetidas, para verificarlo primero calcula el hashCode() de la clave insertada, si ya existe una clave con ese hash entonces invoca a equals. Como las instancias de MyKeys son distintas, cada uno tiene un hash diferente y nunca llega a equals. Al final se invoca el size() el cual retorna 4.