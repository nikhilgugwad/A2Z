Let's analyze the time and space complexities of the three implementations:

1. **Brute Force Approach**:

   - Time Complexity: \(O(n^2)\) due to the nested loops (one loop for iterating over each element and another loop for linear search).
   - Space Complexity: \(O(1)\) as there's no additional space used other than the input array.

2. **Better Approach (Sorting)**:

   - Time Complexity: \(O(n \log n)\) due to the sorting operation.
   - Space Complexity: \(O(1)\) if we consider that sorting is done in-place. Otherwise, it's \(O(n)\) due to the space used for sorting.

3. **Optimal Approach (HashSet)**:
   - Time Complexity: \(O(n)\) since it involves iterating over the array once and HashSet operations (add and contains) take \(O(1)\) time on average.
   - Space Complexity: \(O(n)\) due to the HashSet storing all the elements of the array.

Comparing these complexities, the **optimal approach** with HashSet performs better in terms of both time and space complexities. It has linear time complexity and linear space complexity, making it the most efficient solution among the three. The better approach with sorting has better time complexity than the brute force approach, but it may have worse space complexity depending on the sorting algorithm used. However, the optimal approach outperforms both the better and brute force approaches.
