Let's analyze the time and space complexities of each approach:

1. **Brute Force Approach**:

   - Time Complexity: \(O(n^3)\) - The nested loops result in cubic time complexity, where \(n\) is the length of the array.
   - Space Complexity: \(O(1)\) - Constant space complexity as no additional data structures are used.

2. **Better Approach**:

   - Time Complexity: \(O(n^2)\) - Two nested loops iterate through the array, resulting in quadratic time complexity.
   - Space Complexity: \(O(1)\) - Constant space complexity as no additional data structures are used.

3. **Optimal Approach**:
   - Time Complexity: \(O(n)\) - The algorithm iterates through the array once, resulting in linear time complexity.
   - Space Complexity: \(O(n)\) - The HashMap stores prefix sums and their frequencies, resulting in linear space complexity relative to the size of the input array.

Comparing these complexities, the **Optimal Approach** performs better in terms of time complexity, as it has a linear time complexity compared to the other two approaches with higher complexities. However, it has a higher space complexity due to the HashMap. Depending on the input size and available memory, the optimal approach might still be the best choice due to its significantly improved time complexity.

In terms of both time and space efficiency, the **Optimal Approach** outperforms the other two.
