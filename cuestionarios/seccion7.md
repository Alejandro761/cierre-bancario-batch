# 07 · Herencia y polimorfismo

1. Imprime "Clase Padre Clase Hija". Cuando el constructor de una subclase no contiene una llamada al constructor padre con super o a un constructor suyo con this, entonces java ejecuta por defecto super(), el cual llama al constructor sin argumentos de la clase padre.

2. Tanto Dog dog = new Dog() como Animal dog = new Dog() crean una instancia de Dog al contruir un objeto de esa clase con new Dog(). Es válida la opción b porque se permite crear un objeto tomando como tipo de referencia a una superclase.

3. Una variable de referencia de una clase padre puede apuntar a un objeto de una clase hijo. Por lo tanto la opción correcta es b.

4. Se imprime Child porque aunque el tipo de referencia sea Parent, el objeto es de tipo Child y este sobreescribe el método heredado por Parent.

5. Se imprime Bark porque la clase Dog está sobreescribiendo el método makeSound el cual fue heredado por Animal. 

6. Se imprime "Ladrido". Aunque el tipo de referencia sea Animal, los métodos de una instancia responden al tipo de Objeto, es decir, a Perro.

7. Se imprime Child porque auque el tipo de referencia de obj sea Parent, está apuntando a un Objeto Child.

8. La opción b es la correcta, la función getClass retorna la clase del objeto.

9. La opción correcta es d porque getClass retorna la clase real del objeto en tiempo de ejecución, no la la clase de referencia.

10. La opción c es correcta, cada subclase sobreescribe el método heredado de la superclase. Como getHash() es un método de la instancia, Java resuelve la llamada en tiempo de ejecución evaluando el objeto real en memoria, no el tipo de la variable de referencia.

11. El constructor de la clase C primero hace una llamada implícita al constructor sin argumentos de B ya que no cuenta con llamadas a super o this. Por lo tanto, se ejecuta el primero el constructor B que este a su vez llamada con super al constructo de A. La opción correcta es a.

12. Al crear un objeto Derived, su constructor hace un llamado al constructor de Base (su padre) con parámetro, el cual hace un llamado implícita a super(), haciendo referencia al constructor de Object. Por lo tanto, se imprime "Base constructor with message: Hello  Derived constructor".

13. Se genera error de compilación. No se puede asignar un objeto de una superclase a una referencia de una subclase. El tipo de referencia de las variables g1 y g2 es Gamma y se quiere apuntar a dos objetos de superclases, esto genera error de compilación.

14. Se genera error de compilación porque al sobreescribir show en Child, se está asignando el modificador de acceso por default, lo cual es inválido porque no se puede reducir su visibilidad (default es más estricto que protected).

15. Se crea un Objeto CA con el constructor con parámetro y este imprime el argumento dado ("message "). Después se crea un objeto CB, el cual de forma implícita llama al constructor sin argumentos de la superclase (CA), el cual imprime "middle". Finalmente se imprime " end".

16. No se puede cambiar el tipo de retorno al sobrecargar un método si el número y el órden de parámetros es el mismo. Se puede sobreescribir un método en una subclase con el mismo modificador de acceso o con uno menos estricto, si se pone un modificador más estricto entonces se genera un error de compilación.

17. No se puede sobreescribir un método haciendolo más estricto. Tampoco se puede sobreescribir un método de objeto haciendolo static porque los métodos estáticos no tienen contexto del objeto, se resuelven en tiempo de compilación y los métodos de instancia en tiempo de ejecución.

18. La opción d causa error de compilación porque se está sobreescribiendo un método pero se está cambiando el tipo de retorno. Si se quisiera sobrecargar entonces tiene que cambiar la firma (número y tipos de parámetros).

19. Se debe preferir la composición sobre la herencia porque asi se se reduce el acoplamiento. La herencia representa una relación "es-un" porque una clase deriva (o hereda) de otra. La composición representa una relación "tiene-un" porque una clase contiene una instancia de otra. La asociación representa una relación "usa.un" porque una clase utiliza métodos o instancias de otras clases. La herencia y la composición pueden usar junta para crear relaciones complejas.

20. Aunque Animal es una clase abstracta, el objeto se instancia con la subclase Dog asi que no se genera error de compilación. La sobreescritura de speak es válida porque se está haciendo menos estricto y es el mismo tipo de retorno. Por lo tanto se imprime "The Dog barks".

21. Se genera un error de compilación porque la subclase Dog intenta sobreescribir el método speak haciendolo más estricto (protected es más estricto que public).

22. Se imprime "Java Jeve va". Se crea una lista tipo Alpha, el cual inserta una instancia de esta y dos más instancias de subclases de Alpha. En un foreach se imprime la función mensaje, el cuál sobreescriben las subclases de Alpha. Cada instancia tiene su propia implementación de la función.

23. Se imprime Sound Roar Bark Growl. Se crean dos objetos Animal como referencia, pero uno apunta a un objeto Dog (subclase). El objeto animal ejecuta las funciones makeSound y makeSound con argumentos, después, el objeto dog ejecuta la sobreescritura de makeSound y después makeSound con argumentos (original de Animal).

24. Primero se crea el objeto Cougar, el cuál ejecuta el construtor del mismo y a su vez se llama al constructor de la superclase (Feline) imprimiendo "feline cougar". Después se ejecuta el método go de la subclase, el cuál edita el valor de type que fue heredado de la superclase, por lo tanto la llamada a super.type hace la misma referencia a type, imprimiendo "c c".

25. El atributo al que se accede depende del tipo de la referencia, como la referencia de myCar es ElectricCar se imprime "ElectricCar".

26. Se genera error de compilación en la línea 18 porque el constructor de la subclase hace un llamado implícito al constructor sin argumentos de la superclase, el cual no existe porque se creó un constructor con argumentos.

27. Al crearse un objeto Mountain, su constructor hace un llamado al constructor padre mandandole un string, este constructor hace un llamado al constructor de su padre, imprimiendo "atom granite". De regreso al contructor de Mountain, se crea un nuevo objeto Rock con el constructor con argumentos, imprimiendo nuevamente "atom granite".

28. Se crea un objeto Y, el constructor llama a otro constructor de Y, este ejecuta un constructor de la superclase (X) que a su vez ejecuta otro constructor en la misma clase. Siguiendo la pila de prints, se muestra "1234".

29. La opción d es la correcta, ya que primero creará el objeto Square, esto imprime "Shape: constructor". Después se ejecuta la función foo imprimiendo "Shape: foo". Finalmente, la función foo("bar") imprime "Square: foo".

30. La opción d es la que genera la excepción porque el objeto al que apunta ob es un A, una subclase de esta, como B, no puede castearlo.

31. Es válido apuntar una variable de referencia de una superclase a una subclase (upcast) sin necesidad de hacer un cast explícito. También se permite que una variable de referencia de una subclase apunte a una referencia de superclase mientras este apunte a un objeto real de la subclase (downcast), en este caso se debe hacer cast explícito obligatoriamente.

32. La línea 12 genera error de compilación porque no se pueden castear clases que no tengan relación de herencia.

33. Es válido que una referencia de Omega apunte a una referencia de Gamma si este apunta a un objeto Epsilon, ya que este hereda de Gamma e implementa Omega. Por lo mismo, también es válido que una referencia de Omega apunte a una referencia de Epsilon sin necesidad de casteo explícito.

34. Cualquier objeto es instancia de la clase Object ya que todas clases heredan de él. Por lo tanto, también un objeto MyList es instancia de ArrayList.

35. Se genera error de compilación porque el atributo a no existe en F. Los atributos se resuelven por el tipo de referencia, por eso f no reconoce a.

36. Hay error de compilación en la línea 13 porque Sub no puede acceder a la variable a porque es privado en la superclase, además de que no existe un contructor vacío en la misma. Haciendo la llamada a super(5) o this(5) ya se resuelven ambos problemas.

37. En la sobreescritura no se permite poner un modificador de acceso más estricto. En la sobrecarga se puede cambiar la firma (número de parámetros y tipos) de la función y el tipo de retorno. Una función con la misma firma y diferente tipo de retorno que la original genera error de compilación, no es ni sobrecarga ni sobreescritura.

38. Las líneas 19 y 22 hacen de forma correcta el casteo, ya que con los parentesís se resuelve primero el cast y después se ejecuta la función. Una referencia de Speak que apunte a un objeto Tell (subclase de Speak) no puede ejecutar la función porque solo existe en Tell por la implementación de Truth, es por eso que se castea a Truth.

39. Se ejecuta la función ejemplo para el objeto C, asi que se imprime "Valor de la clase C" y se suma la x de C. Sin embargo, como el tipo de referencia del objeto es A, no se realiza la suma porque los atributos se resuelven por el tipo de referencia, por lo que ac.x es el x de A, entonces no se resolvió la suma para A y se queda su valor en 8. Al final ac.x suma 20 y el resultado final es 28.

40. La función speak de Animal es privado, por lo tanto, solo existe en esa clase y la función speak de Dog no es una sobreescritura, es una función propia de Dog. A pesar de que animal apunta a un objeto Dog, su tipo de referencia es Animal, por lo tanto ejecuta el speak de Animal, imprimiendo "Animals make noise".