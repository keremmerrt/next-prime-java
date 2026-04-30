# Next Prime Number (Java)

This is a simple Java program that finds the smallest prime number greater than or equal to a given number.

For example, if the input is 10, the next prime number is 11.

## How it works

- The program takes one integer as input
- The input must be between 1 and 1,000,000,000
- It starts checking numbers from the given input
- If the number is not prime, it checks the next number
- This continues until a prime number is found

## Prime checking logic

To check if a number is prime, the program tests possible divisors starting from 2.

It is not necessary to check all numbers up to the number itself.
It is enough to check divisors up to the square root of the number.

That is why the loop uses:
i * i <= p

If a number has a divisor greater than its square root, it must also have another divisor smaller than its square root.

## Example

Input:
10

Output:
11

Another example:

Input:
17

Output:
17

Because 17 is already a prime number.

## Edge case

If the input is:
1

The output is:
2

Because 1 is not a prime number and 2 is the smallest prime number.

## How to run

Compile and run the program:

javac NextPrime.java

java NextPrime

## What I practiced

- basic Java syntax
- loops and conditions
- prime number checking
- mathematical reasoning
- algorithmic thinking
- handling edge cases

## Note

This project was written as part of my Java practice while learning basic algorithms.