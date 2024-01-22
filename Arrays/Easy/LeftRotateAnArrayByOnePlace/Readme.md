Let's compare the two methods:

### Brute Force Method (`BruteForce`):

- **Time Complexity:** O(n)
  - The time complexity is linear because it iterates through the array once for shifting and once for printing.
- **Space Complexity:** O(n)
  - The space complexity is linear due to the use of a temporary array of the same size as the input array.

### Optimal Methods (`Optimal`):

1. **Using While Loop (`left_rotate`):**

   - **Time Complexity:** O(n)
     - The time complexity is linear because the while loop covers each element exactly once.
   - **Space Complexity:** O(1)
     - The space complexity is constant as it uses only a constant amount of additional space.

2. **Using For Loop (`solve_left_rotate`):**
   - **Time Complexity:** O(n)
     - The time complexity is linear because the for loop iterates through the array once for shifting.
   - **Space Complexity:** O(1)
     - The space complexity is constant as it uses only a constant amount of additional space.

### Comparison:

1. Both the Brute Force and Optimal methods have the same time complexity of O(n).
2. The Brute Force method has a space complexity of O(n) due to the use of a temporary array, while the Optimal methods have a constant space complexity of O(1).
3. The Optimal methods are more space-efficient, as they do not require additional linear space.

In summary, the Optimal methods are preferred over the Brute Force method, especially in terms of space efficiency, as they achieve the same time complexity with constant space complexity. Among the Optimal methods, both the While Loop and For Loop implementations are similar in terms of time and space complexity.
