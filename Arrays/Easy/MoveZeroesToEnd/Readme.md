Sure, let's analyze the time and space complexities:

### BruteForce Approach (`BruteForce` class):

1. **Time Complexity**:

   - Both methods (`move_zeroes_apr1` and `move_zeroes_apr2`) involve two loops.
   - The first loop iterates through the array (`n` iterations).
   - The second loop copies elements from the temporary array (`n` iterations).
   - Thus, the overall time complexity is O(n).

2. **Space Complexity**:
   - In the first method (`move_zeroes_apr1`), an additional temporary array of size `n` is used.
   - In the second method (`move_zeroes_apr2`), an ArrayList is used to store non-zero elements.
   - The space complexity is O(n) for both methods because of the additional space required.

### Optimal Approach (`Optimal` class):

1. **Time Complexity**:

   - The algorithm iterates through the array once (O(n)) to find the position of the first zero.
   - The second loop iterates through the array again (O(n)), swapping non-zero elements with the first zero.
   - The overall time complexity is O(n).

2. **Space Complexity**:
   - The space complexity is O(1) as no additional data structures are used, except for a constant number of variables (`j` and `temp`).

### Performance Comparison:

- Both approaches have the same time complexity, O(n), but the optimal approach (`Optimal` class) has a better space complexity of O(1) compared to the brute-force approach (`BruteForce` class), which has a space complexity of O(n).

In conclusion, the optimal approach is likely to perform better in terms of space efficiency, especially for large input arrays. However, it's important to note that the actual performance can also be influenced by factors such as the underlying hardware and the specific implementation details of the Java Virtual Machine.
