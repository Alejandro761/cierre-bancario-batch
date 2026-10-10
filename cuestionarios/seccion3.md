# 03 · Strings y clases envoltorio

1. La opción b es correcta porque se crea una instancia de StringBuilder y con la funció append se concatena un string al final.

2. La función replace es la encargada de reeemplazar todas las apariciones de un carácter dentro de un string.

3. La función equals es la encargada de comparar contenido, regresa true si ambas variables tienen la misma cadena de texto. El operador == compara objetos, por lo tanto no es una opción.

4. Se lanza la excepción StringIndexOutOfBoundsException, el cual significa que no existe ese índice ya que se sobrepasa al último.

5. Un objeto String es inmutable, una vez creado su valor no puede cambiar. La función toUpperCase genera un nuevo objeto String, no modifica s. El nuevo String en mayúsculas no se está asignando a ninguna variable, por lo tanto, msg sigue apuntando al mismo String.

6. Las funciones concat y substring no modifican la variable a, retornan una nueva cadena. Por lo tanto, la opción correcta es a.

7. Los dos primeros prints muestran true, ya que equals compara los valores de los strings, los dos print restantes muestran false porque el operador == compara objetos y los tres son diferentes objetos.

8. Al usar el operador new, se crea un nuevo objeto String en la memoria Heap. Al declarar una cadena literal, Java crea el String en el String Pool. El método intern bysca la cadena en el Strign Pool y como existe deuvelve la referencia que tiene str2, por lo tanto, str2 y str3 apuntan al mismo objeto en el String Pool.

9. La primera operación es verdadera porque s1 y s3 son literales de cadena ("text") y el compilador de Java utiliza el String Pool para reutilizar la misma referencia de objeto. La segunda operación es falsa porque s2 se creo usando new, el cual crea el objeto en la memoria Heap. La tercera operación es verdadera porque intern devuelve la referencia de la cadena "text" en el String Pool, coincidiendo la referencia de s1 con s4.

10. La función split separa el string en un arreglo, tomando como separador cualquier carácter que no sea dígito ("\\D"). El foreach itera el arreglo e imprime cada elemento, los cuales son números.

11. Al declarar un Integer sin inicializarlo toma null, por lo tanto, dará error en la ejecución, lanzando la excepción A NullPointerException occurs at runtime cuando en la línea 5 se trate de suma un entero con un null.

12. Un String es inmutable, por lo que la función modify no modifica su valor. StringBuffer es mutable por lo que modify sí le concatena World al final, pero se reemplaza gran parte de la cadena con o, dejandolo como "Heo". StringBuilder también es mutable, así que modify le concatena World y la función reverse invierte la posición de sus carácteres.