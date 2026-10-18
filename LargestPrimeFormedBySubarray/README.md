# Problem Statement: Largest Prime Number Formed by a Subarray

Given an array of digits, find the largest prime number that can be formed by concatenating the elements of any contiguous subarray.

A subarray is a sequence of consecutive elements from the original array.

## Input Format

- The first line contains an integer N, representing the size of the array.
- The second line contains N space-separated digits.

## Output Format

Print the largest prime number formed by any contiguous subarray. If no prime number can be formed, print -1.

## Constraints

- 1 ≤ N ≤ 10^3
- 0 ≤ A[i] ≤ 9
- Only contiguous subarrays are allowed.
- The digits must remain in their original order.
- A number formed by a subarray may contain multiple digits.

## Sample Input

5
1 3 7 2 5

## Sample Output

137

## Explanation

Some numbers formed by contiguous subarrays include:

- [1] → 1 (not prime)
- [3] → 3 (prime)
- [7] → 7 (prime)
- [3, 7] → 37 (prime)
- [1, 3, 7] → 137 (prime)
- [3, 7, 2, 5] → 3725 (not prime)

The largest prime number formed by any contiguous subarray is 137.

Therefore, the output is 137.

