## Application Runtime

- Objects aren't created when we write a program
- Objects are a runtime concept
- When we execute a code, the program instructions gets executed line by line, and by the time the line reaches the line corresponds to creation of new Object of an class, a variable is allocated a memory which points to a location in memory that contains the objects.
- Experienced developers often think concepts like object creation at application runtime as a top priority.

## Java Behind The Scenes

- There are two main types of memory specially associated with programs running, in Java.
- They are Heap and Stack
- In Java, instructions needs to be within the named blocks.
- These are called as Methods.
- Without methods, the interpreter wont interpret the instructions as there are no methods to wrap them in.
- Everything or in particular every line of instruction needs to be within the methods.
- The entry point of the program is the main() method.
- Every method call or execution takes place in Stack.
- When we run a program, the main() method will be placed inside the Stack along with the local variables of the main() method.
- The primitive data types like int, float datas when assigned to a variable, that variable holds the actual data in the stack frame.
- Eg: int a = 10, `a` is a variable which holds the data 10 in the stack.
- In short, Stack maintains all the method invocations in Java.
- When a program is started, there creates a reserved space for these upper mentioned tasks. Those are called as Stack and Heap.
- Consider the instruction, `Movie avengers = new Movie()`
- In this instruction, `avengers` is a referenced variable. 
- When the above instruction is executed, a Java object is created in the Heap.
- The variable `avengers` is created in the Stack, since it is a local variable, which inturn holds the address of the actual object created in the Heap.
- Unlike, primitive data type which holds the actual value in Stack, the Object is a complex data type/ Class data type resides in the Heap.
- `Movie avengers = new Movie()`, when this instruction is executed again, the reference(address) of the old object in the Heap gets deleted and new reference for the new Object that is created in the Heap is created.
- Thus, the old object remains useless and is thus collected by the Java for the `Garbage collection`.
- Objects are often interchangeably called as Instance.
- Consider, 

```
  Movie ironman = new Movie();
  Movie avengers = ironman;
```
Now, changes to the avengers instance actually makes changes to the ironman object too.
This is because, it does not create a copy of ironman and assigns it to the avengers variable. Instead, it assigns the reference(address) of the previously created ironman object to the avengers object. Thus, one object is reference by 2 variables.
