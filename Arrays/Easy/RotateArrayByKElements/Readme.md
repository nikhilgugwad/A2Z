The time and space complexities for both approaches.

### First Approach (Using a temp array)

#### Time Complexity:

- The time complexity of each rotation operation is O(n), where n is the length of the array.
- There are three rotation operations (right, left, and printing).
- Therefore, the overall time complexity is O(3n), which simplifies to O(n).

#### Space Complexity:

- The space complexity is O(k), where k is the number of elements to be rotated.
- A temporary array of size k is used for storing elements during rotation.

### Second Approach (Using Reversal Algorithm)

#### Time Complexity:

- The time complexity of the `reverse` function is O(n/2), which simplifies to O(n) since we consider the dominant term.
- Each rotation operation involves three calls to the `reverse` function.
- Therefore, the overall time complexity is O(3n), which simplifies to O(n).

#### Space Complexity:

- The space complexity is O(1) as no extra space is used except for a constant amount in the `reverse` function.

### Comparison:

Both approaches have the same time complexity of O(n). However, the second approach (using the Reversal Algorithm) has a better space complexity of O(1) compared to the first approach, which uses a temporary array of size k.

In terms of space complexity, the second approach is more efficient as it uses constant space. In terms of time complexity, they are similar, but the actual performance may depend on various factors, including the specific operations performed by the machine.

In conclusion, if minimizing space usage is a priority, the second approach (Reversal Algorithm) is preferable.
