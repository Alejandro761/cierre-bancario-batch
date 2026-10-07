# 01 · Fundamentos: tipos, operadores y casting 

1. El JDK ofrece las herramientas necesarias para compilar, depurar y ejecutar programas java.

2. La herramienta jar crea los archivos JAR.

3. La herramienta jconsole es la encargada de monitorear y gestionar aplicaciones.

4. Una operación que retorne un booleano puede ser asignado a una variable de tipo boolean.

5. No se puede asignar un número ni un string a un booleano, solo valores u operaciones que retornen un boolean.

6. Sumar cualquier tipo númerico con un double da como resultado un double.

7. El postfijo ++ primero retorna el valor actual de la variable y después lo incrementa, por lo tanto, en un print primero muestra el valor actual de a y después lo incrementa, dando como resultado 1 2.

8. El prefijo -- realiza primero el decremento y después retorna el resultado, el postfijo hace lo contrario, primero retorna el resultado y después realiza el decremento.

9. La primera operación (&&) da false, asi que la operación OR entre un false y un true da como resultado true.

10. La primera operación da false, el operador ! invierte el valor de un booleano, convirtiendo la x en false, por lo que el resultado de la operación completa es false.

11. El primer print concatena el 3 y el 5 al "Result: " porque al evaluarse la operación de izquierda a derecha el operador + detecta primero un string y convierte los demás elementos a string, pero el segundo realiza la suma de los números al encontrarse la operación dentro de los parentesís (indica que resuelva esa operación primero).

12. En el primer print el operador + realiza la conversión de los números a string porque el primer elemento es un string. El segundo print concatena "Result: " con 2, pero el operador * realiza la multiplicación del 3 y 5 para poder concatenarlo al 2.

13. Compara los bits de ambos números en formato binario con el operador OR, dando como resultado 13 en decimal.

14. No se le puede asignar un número ni un string a un booleano.

15. Un booleano se puede operar con operadores lógicos AND, OR o igualdad.

16. No existe la clase Int. En una multi declaración solo debe haber un tipo de dato o clase sin repetirse. 

17. No se puede asignar un byte a un carácter, debe haber un cast explícito.

18. Imprime three, ya que para que java pueda encontrar el método main, este debe ser público.

19. El parámetro args[] hace referencia a los argumentos que se le pasan por medio del comando (se escriben en el comando después del nombre de la clase que contiene el main). Se le pasaron solo dos parámetros, por lo que el último índice es 1.

20. Una operación aritmética entre un short y un long es promovido automáticamente a un long.

23. El método main debe ser público para que java pueda acceder a él desde fuera de la clase. Debe ser static porque así no hace falta crear una instancia de la clase y obligatoriamente debe ser void porque no devuelve ningún valor. El nombre main es necesario porque así lo busca java.

24. Cuando se utiliza la opción -jar, el Classpath de Java se ignora por completo. Para que el comando sepa qué método main ejecutar, necesita leer el archivo de manifiesto. Si el archivo JAR no contiene el atributo Main-Class dentro de su manifiesto, la JVM arrojará un error indicando que no hay un manifiesto con la clase principal configurada.