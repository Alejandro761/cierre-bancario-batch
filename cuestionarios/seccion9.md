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

10. 