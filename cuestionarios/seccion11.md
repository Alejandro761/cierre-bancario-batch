# 11 · Lambdas y Streams 

1. Se crea una lista de Strings. La función items.stream() la convierte en un flujo de datos. Posteriorme filter solo toma los elementos String que empiecen con a y retorna el resultado en una nueva lista con collect(Collectors.toList()).

2. La función .sorted() ordena alfabéticamente los Strings de la lista y collect(Collectors.toList()) regresa la lista con ese ordenamiento.

3. La función .sorted(Collections.reverseOrder()) ordena de forma descendente la lista de número y la regresa con esa operación. Se imprime 9, 8, 3, 1.

4. La función Arrays.sort ordena el arreglo fruit de forma alfabética por la lambda (a, b) -> a.compareTo(b). Se imprime apple banana grapes pears.

5. Se crea una lista de los números 1 al 5. La función map(n -> n * 2) transforma cada elemento multiplicándolo por 2, despúes la regla del filter solo toma los resultados mayores a 5, tomando el 6, 8 y 10. Por lo tanto el tamaño del arreglo después del procesamiento es 3.

6. 