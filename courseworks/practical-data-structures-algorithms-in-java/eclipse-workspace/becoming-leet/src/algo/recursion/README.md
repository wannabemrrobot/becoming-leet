## RECURSION METHODS

#### Refer [recursion.java](./recursion.java), and when you run it, something interest happens.

- I've guessed the output and to my surprise it was an exact opposite.
- That's how recursion and methods in stack works.
- As we've learnt in the previous section of this course, method invocations are maintained in the Stack.
- Thus, when the first `main()` method is invoked, it is pushed to the memory Stack, and the subsequent methods it's called are pushed on top of the main method.
- As we all know, that Stack is a `FILO` Data Structure, the methods are resolved/popped out on the basis of, the latest invoked method gets resolved or gets executed first. Only then, the method which invoked the previous method will gets resolved.
- Thus, the last invoked method is executed first, followed by other methods(latest first).