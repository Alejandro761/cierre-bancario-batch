# 09 · Clases abstractas, interfaces, enums y anidadas

1. Throwable es la superclase de las excepciones y errores. De ella derivan las clases Exception y Error.

2. Las excepciones checked son excepciones de las que la aplicación debería recuperarse, el compilador verifica obligatoriamente que sean capturadas mediante un bloque try-catch o declaradas en la firma del método mediante la cláusula throws. Las unchecked representan errores de lógica en el código y su manejo es opcional; el compilador no obliga a usar try-catch ni throws.

3. Las palabras reservadas try, catch, finally, throw y throws sirven para manejar excepciones.

4. La palabra throw lanza una instancia de excepción dentro del cuerpo de un método

5. throw se utiliza para lanzar una excepción de forma manual.

6. throws declara las excepciones que un método no maneja y que, por lo tanto, puede propagar, mientras que throw lanza explícitamente una instancia de excepción.

7. La opción b es correcta, el compilador exige obligatoriamente manejar las checked como IOException. Mientras que las unchecked representan errores de lógica del programa y no requieren manejo explícito obligatorio por el compilador como NullPointerException.

8. La función mf() no lanza una excepción, por lo tanto el flujo del programa sigue en el try e imprime A, después entra al finally (este bloque se ejecuta aunque se atrape el error en catch) y se imprime C y finalmente, afuera de la estructura try-catch, se imprime D. 

9. Al ejecutar la función vlaidaEdad(16) se verifica que 16 sea menor que 18, como es verdadero se lanza la excepción IllegalArgumentException pasandole el argumento "Edad no válida para votar". Se rompe el flujo de la función y de regreso al main, el catch atrapa la excepción e imprime un texto junto con el mensaje que se mando al lanzar la excepción: "Excepción capturada: Edad no válida para votar.".

10. Es mala práctica controlar el flujo de un ciclo para iterar un array mediante la excepción ArrayIndexOutOfBoundsException, es mejor utilizar la propiedad lenght. Intentar capturar los tipo Error indican fallos catastróficos a nivel JVM, no es recomendable intentar capturarlos y reiniciar el programa.

11. IOException e InterruptedException deben ser chequeadas obligatoriamente porque son checked.

12. ArrayIndexOutOfBoundsException, RuntimeException, NumberFormatException y IllegalArgumentException son excepciones unchecked, no es obligación del desarrollador tratarlas.

13. La divsión por 0 no existe, por lo que el primer catch toma la excepción (ArithmeticException) lanzada por la operación, imprimiendo "Error: División por cero." y después "Ejecución finalizada." por el bloque finally.

14. El try imprime "Running", después se lanza una Exception el cual es capturada por el catch, imprimiendo "Problem" y el finally imprime "Stopping".

15. El objeto resource se crea de forma correcta y se ejecuta use(). Inmediatamente al salir del bloque try, Java invoca automáticamente el método close(). La salida es Resource used Resource closed

16. Siempre se va a imprimir primero "Before if clause". Posteriormente si se cumple la condición, se lanza una Exception(), si no se cumple entonces se imprime "After if clause".

17. Se debe añadir throws IOException a doSomething() porque representa una excepción checked, además de añadir un catch que capture esa excepción. Si no se maneja en el catch entonces también se debe poner throws IOException en el método main.

18. Es una pesima práctica comprobar ArrayIndexOutOfBoundsException para determinar cuándo se han visitado todos los elementos de un arreglo en un bucle. Tampoco se deben verificar errores y reiniciar el programa para que los usuarios no se den cuenta. Lo correto no es intentar capturar ArrayIndexOutOfBoundsException, si no arreglar la lógica del código.

19. El método go es una función recursiva infinita porque no contiene ninguna instrucción condicional que detenga las llamadas a sí mismo, por lo tanto, se lanzará una excepción en pantalla: "A java.lang.StackOverflowError is thrown.".

20. Al implementar la interfaz, el método que sobrescribe puede declarar la misma excepción checked declarada en la interfaz o superclase, o una subclase directa o indirecta de la excepción. El método que sobrescribe puede omitir completamente la cláusula throws. 

21. Se genera error de compilación porque en la función a() se quiere capturar un Exc1 (excepción checked) y el bloque try no lo lanza en ningún momento.

22. El programa no compila porque la instrucción assert está utilizando el operador ternario (? :), lo cual es inválido. Solo se debe utilizar ":" después de la expresión booleana.