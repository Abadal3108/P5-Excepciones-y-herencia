## EX_02
La clase RuntimeException representa las excepciones que ocurren dentro de la máquina virtual Java (durante el tiempo de ejecución). Un ejemplo de estas excepciones es NullPointerException, que ocurre cuando un método intenta acceder a un miembro de un objeto a través de una referencia nula.

Generalmente RuntimeExceptions son excepciones que se puede evitar mediante la programación. Por ejemplo NullPointerException , ArrayIndexOutOfBoundException . Si se comprueba la existencia de null antes de llamar a cualquier método, NullPointerException nunca ocurriría. Del mismo modo, ArrayIndexOutOfBoundException nunca se produciría si se comprueba primero el índice. RuntimeException no son comprobados por el compilador, por lo que es un código limpio.

