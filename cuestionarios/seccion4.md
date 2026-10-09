# 04 · Arreglos

1. La primera opción es incorrecta, no de pueden usar () en cambio se usan {} y no es necesario específicar el tamaño ya que se infiere con los elementos dentro de las llaves.

2. array.length devuelve el tamaño de array, array contiene 3 arreglos más. El for itera 3 veces, tomando a i como 0 a 2, por lo tanto, se suman los números que se encuentran en la misma posición en x y y de la matriz.

3. Dentro de dos for anindados, se imprimen los elementos de la matriz donde i es igual a j, es decir, cuando ambos valores de las coordenadas son iguales.

4. El elemento en array[4][1] es 4, pero el array[1][4] no existe, array[1] solo tiene 2 elementos, por lo tanto se lanza un ArrayIndexOutOfBoundsException durante la ejecución.

5. Primero se imprime el tamaño de array2D[0].length, el cual es 3, despues se retorna un verdadero ya que array2D[1] representa otro arreglo. Finalmente se imprime el elemento en array2D[0][1], que corresponde a 1.

6. Despues de inicializarse el arreglo, se inserta en sort, el cual ordena el arreglo de forma alfabetica. La busqueda binaria retorna 1 porque es la posición donde se encuentra "Banana" después del ordenamiento.

7. La función sort ordena el arreglo del elemento 1 al 4 sin tomar el cuarto elemento. El 2 se queda al principio porque fue excluida del ordenamiento.

8. La función arraycopy copia un arreglo en otro. Primero toma el arreglo a partir del índice 2 (3), después se indica que el arreglo destino será el mismo y que su modificación empezará en el índice 1, finalmente, solo tomará 2 elementos del origen (a partir del índice 2), osea 3 y 4. El arreglo quedaría de la siguiente forma: 1, 3, 4, 4, 5; imprimiendo 35.

9. La opción a y b son correctas. Se puede inicializar un arreglo indicando su tamaño y despues asignarle valores. También se puede inicializar un arreglo sin indicar tamño utilizando {} para indicar los elementos del arreglo, de esta forma se intuye el tamaño. No se puede declarar un arreglo de una dimensión incongruente a la incialización, por ejemplo, que se incialice con una dimensión de 2 y solo se inicialice con una sola dimensión como int[][] array2D = {0, 1}.