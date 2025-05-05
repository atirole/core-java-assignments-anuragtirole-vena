Description
This Java program demonstrates thread coordination using wait() and notify() 
to alternately print odd and even numbers from 1 to 100 in sequence. It simulates 
a coordinated printing system where two threads work together without overlapping or printing out of order.

Features
Thread A (Odd Printer): Prints all odd numbers (1, 3, 5, ..., 99).

Thread B (Even Printer): Prints all even numbers (2, 4, 6, ..., 100).

Synchronized Execution: Ensures the output strictly alternates between odd and even numbers using a shared lock and the wait()/notify() mechanism.

Correct Output Order: The output is guaranteed to follow the pattern: 1 2 3 4 5 ... 100, without race conditions or duplicate numbers.

Program Structure
NumberPrinter: Shared class containing the synchronized printOdd() and printEven() methods, 
as well as a shared counter.

Main: Creates and starts the two threads (one for odd numbers and one for even numbers) 
and coordinates their execution.

Output
Example:

1
2
3
4
5
...
100
The program prints the numbers line by line in the correct sequence using thread synchronization.