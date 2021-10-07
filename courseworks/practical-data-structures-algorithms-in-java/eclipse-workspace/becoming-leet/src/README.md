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
- ## Big O notation - Extended
  - As we've seen in the Binary Search, it has `logarithm of n` time complexity.
  - Consider a cubic growth rate algorithm.
  - 37(n^3) + 18(n^2) + 180 is the mathematical representation of the algorithm.
  - Now, for input of size 1, we have 235 instructions executed.
  - Now, for input of size 5, we have 5225 instructions executed.
  - Now, for the size 10, we have iterations of number 38980.
  - The dominating term is that accounts the most is n^3.
  - Thus, this algorithm is going to scale cubic and this is how instructions are approximately calculated.
  - 
#### Logarithmic algorithms
- Take a look at the below numbers
- For binary search,

| Input size(n) | Steps to reach solution(log n) |
| ----------- | ----------- |
| 10     | 4      |
| 100   | 7        |
| 1000   | 10        |
| 10000   | 14        |
| 100000  | 17        |
| 1000000   | 20        |
| 10000000   | 24        |
| 100000000   | 27        |
| 1000000000   | 30        |

When using logarithmic algorithms, the steps are calculated by adding the number of times you divide the input size by 2, to get closer to 1.

**For eg:**  
For input size of 100,  
100/2=50=> 50/2=25=> 25/2=12.5=> 12.5/2=6.25=> 6.25/2=3.125=> 3.125/2=1.5625=> 1.5625/2=0.78125   ======>  7 steps

This is how, steps or instructions for the given input size is calculated for logarithmic algorithms.
NOTE: It's log base 2, and not log base 10. We divide the input size by 2, so its log base 2.
Also, Binary search is the best algorithm to search for an element in the sorted array.
