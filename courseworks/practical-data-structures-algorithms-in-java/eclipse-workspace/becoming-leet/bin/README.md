## Abstract Data Types

- Consider Abstract data types as a black box for implementing certain function.
- Java has some builtin abstract data types.
- These abstract data types are often used to hide the implementation and is used as container for the data.
- All of the data structures are abstract data types, eg: linked list, trees and so on.

## Algorithm Analysis

- A computer program is a set of instructions on how a computer should solve a particular program
- This step-by-step instruction is called as algorithm
- Generally, if an algorithm is considered as efficient if it scales well relative to the input
- ## Algorithm containing one loop - O(n)
  - It is considered as an linear complexity algorithm, as it scales linearly on the inputs
  - For eg: Consider an algorithm that iterate an entire list of elements in the array is linear, as the time it takes to run this algorithm is linearly dependant on the size of the input.
  - It is considered as generally efficient.
- ## Constant time algorithms - O(1)
  - Algorithms such as finding a `given` element in the array, takes a constant time.
  - Regardless of the input array size, these algorithms have constant time complexities as it doesnot have to iterate the array, it just needs to return the element.
- Only things that affect the constant time operations are the recursions or looping.
- ## Quadratic algorithms
  - Algorithms that has to iterate over a loop, which is inside a loop is considered as Quadratic algorithms.
  - These algorithms are non-linear and the time complexities are O(n^2).
  - The more input values are given to the algorithms, the slower the process it gets.
- ## Growth Rates
  - Growth rates are referred to as the way an algorithms scales as you give it more inputs.
- ## Asymptotic notation
    - Asymptotic notations are notations that helps programmers to efficiently communicate about the efficiency of the computer programs interms of space and time complexities. Following are the different aymptotic notations, where `n` is the no.of inputs.
    - `Linear Growth Rate - O(n)`
    - `Quadratic Growth Rate - O(n^2)`
    - `Cubic Growth Rate - O(n^3)`
    - `Constant Growth Rate - O(1)`
    - `Exponential Growth Rate - O(n^n)`

