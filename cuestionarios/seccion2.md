# 01 · Fundamentos: tipos, operadores y casting 

1. El ciclo for mejorado, o foreach, funciona con arreglos y colecciones que implementan la interfaz Iterable.

2. La variable a no es igual ni mayor que b, por lo tanto, z queda en 0 y la multiplicación igual.

3. Mientras que el residuo de i dividido entre 2 sea 0, count incrementará su valor, dando como resultado final 5.

4. Son dos for anidados, el externo itera 3 veces (del 1 al 3) y el segundo 2 veces (del 1 al 2), dando como resultado final 6 iteraciones (3 × 2).

5. El número de ejecuciones se puede cálcular multiplicando el número de iteraciones de cada for anidado, ya que hay un solo print dentro del for mas interno. La multiplicación estaría compuesta de la siguiente forma: 4 × 3 × 2, dando como resultado un total de 24 prints.

6. La variable ii nunca cambia y la condición del while se cumple, por lo tanto el programa entra en un bucle infinito en la ejecución.

7. El código no compila al momento de validar la condición del while porque el valor no retorna un booleano.

8. Con kk = 11, el for itera cinco veces haciendo cumplir la condición ii >> 6 cinco veces y a su vez incrementando esa misma cantidad de veces el valor de jj.

9. Cuando i es par se suma num con el elemento iterado de arr, y cuando i es impar se resta num con el elemento de arr.

10. La primera condición se cumple, value es mayor que cero, la próxima condición a cumplirse es la de value es diferente que cero, después se cumple que value es mayor que 30 y finalmente se cumple la condición de que value es mayor que 10.

11. El primer caso se cumple ("Red"), sin embargo, este no contiene un break despues del print, por lo que ejecuta los siguientes casos, sin validar la condición, hasta que encuentre un break, haciendo la ejecución de todos los casos menos el default porque el último (White) contiene break.

12. El primer caso se cumple e incrementa a y, pero como no tiene break ejecuta los demás casos sin validar la condición, realizando las sumas correspondientes a y.

13. El segundo caso se cumple para grade, pero como no tiene break ejecuta los demás casos sin validar la condición, imprimiendo BCF.

14. El segundo caso se cumple para grade, pero como no tiene break ejecuta el siguiente caso sin validar la condición imprimiendo BC. Como el case 'C' si contó con break, ya no se ejecutan los demás casos.

15. En la condición del while x cuenta con un postincremento, llegando al valor 6 ya que el while valida la condición hasta que esta sea falsa y al llegar a 5 < 5 se realiza un último incremento a x. El operador ternario es verdadero (6 > 5) y retorna "greater than".

16. 2 solo se imprime en la tercera iteración del for, ya que ii se inicia en 0 y se incrementa por cada elemento existente en table, un array de string de tamaño 3.

17. Para un if la asignación de un booleano a false en los parentesís resulta en un falso, es como si se hiciera if (false), por lo tanto no se cumple ninguna condición, entrando al bloque del else.

18. La función equals devuelve un booleano y se usa para comparar el contenido de dos strings. Asignar un valor a un entero no devuelve un booleano. Los tipos primitivos no tienen funciones como compareTo.

19. Cada vez que se ejecuta test se incrementa el valor de co. En total se ejecuta ocho veces, dejando a co en esa misma cantidad. El for se itera dos veces porque depende de i, el cual vale 1 y verifica que i es igual o menor a 2 (test siempre regresa true). test se ejecuta una vez en la incialización del for, 3 veces en la condición, 2 veces en el cuerpo y 2 veces en la actualización.

20. El bucle más interno es el while, el cuál reliza la impresión de los números con la variable k. La variable z es parte de la condición para romper el while, esta debe iniciar con 4 para que se cumpla 4 veces la condición y se impriman los números 1 2 3 4. El do while compara j con z para imprimir un salto de línea, al z iniciarse con 3, se asegura que el do se ejecute tres veces hasta que no se cumpla el while. En la segunda iteración de i, se ejcuta una vez más el do y se imprime la fila de los números, pero la validar la condición de while se retorna un falso, tomando en cuenta eso, es necesaio que x se inicialice con 2.