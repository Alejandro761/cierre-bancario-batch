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

23. 