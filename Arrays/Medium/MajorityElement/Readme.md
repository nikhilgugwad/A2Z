Let's analyze the time and space complexities of each algorithm:

1. **BruteForce Algorithm:**

   - Time Complexity: O(n^2) - due to the nested loop.
   - Space Complexity: O(1) - no additional space is used.

2. **Better Algorithm (HashMap):**

   - Time Complexity: O(n) - the first loop iterates through the array once.
   - Space Complexity: O(n) - a HashMap is used to store the count of occurrences.

3. **Optimal Algorithm (Boyer-Moore Voting Algorithm):**
   - Time Complexity: O(n) - the array is traversed twice, but each iteration is O(n).
   - Space Complexity: O(1) - constant space is used.

In terms of time complexity, the optimal algorithm performs the best, followed by the better algorithm, and the brute-force algorithm being the least efficient.

In terms of space complexity, the brute-force algorithm is the best as it uses constant space. The optimal algorithm uses constant space as well, but the better algorithm uses additional space proportional to the number of distinct elements in the array.

Therefore, in terms of both time and space complexity, the optimal algorithm (Boyer-Moore Voting Algorithm) is the most efficient among the provided algorithms for finding the majority element.
