# 05 · Clases, métodos y constructores

1. La sintaxis para declarar un parámetro que acepte un número variable de argumentos es "...".

2. Con la función this(), ya que se hace referencia a un constructor de la misma clase en la que se encuentra.

3. El constructor por default es el que genera el compilador de Java cuando la clase no contiene uno. Solo X la tiene al no declarar ningún contructor.

4. Al faltar un argumento en una función se genera un error de compilación.

5. Un objeto inmutable es aquel que no puede ser modificado, solo puede tener funciones de retorno para sus atributos. Aunque la variable ya no haga referencia al objeto, este seguirá vivo y sin modificarse.

6. Al crear el objeto, el constructor toma el argumento y se lo asigna al atributo str, por lo tanto, se imprime "hello".

7. La variable i se queda en 12 porque la función m ejecuta la operación de suma pero no la retorna en i ni en ninguna otra variable.

8. La variable a se queda en 20 porque la función m no está retornando nada.

9. La opción d es correcta porque primero se llama display sin argumentos, después display recibiendo un entero y finalmente display que recibe un string.

10. Es necesario cambiar la línea 7 por price.price = 4, por price dentro del main es una instancia de Simple.

11. Se imprime "Bob's Name: Jian", ya que jian se iguala con bob, es decir, la variable jian ahora apunta al mismo objeto que apunta bob y al cambiar el atributo name de jian también se cambia en bob porque referencia al mismo objeto.

12. El código tiene error de compilación porque un parámetro varags debe ser el último parámetro en una función.

13. Se imprime Hello. Un objeto String es inmutable, por lo tanto, la variable msg creada en stringTest no cambia a pesar de la concatenación en op1, esa operación solo retorna un nuevo String pero no se está asignando a msg.

14. El constructor por defecto consiste únicamente en una llamada al constructor sin parámetros de la superclase. Si la superclase no cuenta con un constructor sin argumentos accesible, el código fallará al compilar. El compilador de Java solo proporciona el constructor por defecto si la clase no declara ningún constructor explícito.

15. Class2 tiene relación directa con v2 y c1, mientras que Class3 tiene relación trasitiva con v1 a través de Class2, y esta tiene un Class1 que tiene v1.

16. Se imprime 6564. Primero se crea la variable z en el main y se imprime (6). La función doStuff de la instancia declara un z que solo vive en el scope de esa función, a su vez llama doStuff2 que cambia la variable z de la instancia a 4, finalmente en doStuff se imprime z del scope actual (5). De vuelta en el main se imprime z, la variable declarada en el scope de main (6). Finalmente se imprime el z de myScope (4).

17. Da error de compilación en la función doStuff porque se trata de un método de instancias de la clase ScopeTest, por lo tanto, es erroneo llamar el atributo z mediante myScope.z porque como tal no existe myScope en este contexto y scope, se debe hacer referencia al objeto con this si es que se quiere llamar al atributo z y no a la variable z declarada en el scope de doStuff.

18. Al crear objeto 1 con el contructor vacío, este llama el contructor con argumentos pasandole "Default" y asignando ese valor en name. El objeto 2 es creado con el constructor con argumento, pasandole "John" por lo que el contructor asigna ese valor a name.

19. Al crear el objeto uno se llama el constructor sin argumentos y este llama a su vez el otro constructor con el argumento 10. Después el obj1 llama calculate sin argumentos y otra vez pero mandandole 5. El objeto 2 se instancia con el contructor con argumentos, mandandole 20, para despupes llamar la función calculate sin argumentos y finalmente calculate con 15.

20. El primer objeto llama el constructor sin argumentos, este a su vez llama al constructor que recibe name y age. El segundo objeto llama al constructor que recibe name, este a su vez llama al constructor que recibe name y age. Finalmente, el tercer objeto llama al constructor que recibe name y age.

21. Se lanza error de copilación porque el constructor sin argumento llama al constructor que recibe un entero, y este a su vez llama de nuevo al constructor vacío. Java detecta llamadas circulares entre constructores en tiempo de compilación.

22. La respueta correcta es "a. Compilation error due to recursive constructor calls" porque el constructor sin argumento llama al constructor que recibe un entero y este vuelve a llamar al constructor vacío, haciendo un ciclo de invocaciones entre ambos constructores.

23. Se imprime double, ya que la función doIt que recibe double tiene prioridad porque el compilador busca coincidencias exactas o conversiones primitivas de ampliación sin aplicar autoboxing (Float) ni varargs (float...). La siguiente prioridad la tiene doIt(Float f) debido a la conversión por autoboxing. Las funciones con argumentos varargs tiene la última priodidad.

24. Se puede declarar un argumento varags (String... a) con los puntos junto al nombre del argumento (String...a) e incluso recibiendo arreglos (String[]... a). 