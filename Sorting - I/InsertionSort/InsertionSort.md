The Insertion Sort algorithm implemented in the provided Java code with comments for better understanding:

**Comments Explaining Each Part:**

1. **Outer Loop (i):**

   - Iterates through each element in the array (`i` represents the current element).

2. **Set Current Index (j):**

   - Initializes a variable `j` to the current index (`i`), representing the element to be compared and moved to its correct position.

3. **Inner Loop (while):**

   - Continues until the correct position for the current element is found (compares with previous elements).
   - Swaps elements if the previous element is greater than the current element.
   - Moves backward through the array until the correct position is found.

4. **Swap Operation:**

   - Temporarily stores the previous element (`arr[j - 1]`) in a variable (`temp`).
   - Swaps the previous and current elements.

5. **Output Sorted Array:**
   - After the outer loop completes, output the sorted array.

**The while loop inside the `insertion_sort` method in-depth:**

**Explanation:**

1. **Loop Condition (`while`):**

   - The loop continues as long as two conditions are met:
     - `j > 0`: Ensures that the index `j` is not at the beginning of the array (avoids an "ArrayIndexOutOfBoundsException").
     - `arr[j - 1] > arr[j]`: Checks whether the previous element (at index `j - 1`) is greater than the current element (at index `j`).

2. **Body of the Loop:**

   - The code inside the loop is executed if both conditions in the `while` statement are true.

3. **Swap Operation:**

   - `int temp = arr[j - 1];`: Temporarily stores the value of the previous element in a variable `temp`.
   - `arr[j - 1] = arr[j];`: Assigns the value of the current element to the position of the previous element.
   - `arr[j] = temp;`: Assigns the stored value (`temp`) to the position of the current element.
   - These three lines effectively swap the positions of the previous and current elements.

4. **Decrement `j`:**
   - `j--;`: Moves the index `j` to the previous position, preparing for the next iteration of the loop.
   - This step ensures that the algorithm keeps comparing and swapping elements until the correct position for the current element is found within the sorted portion of the array.

**Overall Purpose:**
The while loop is a crucial part of the Insertion Sort algorithm. It works to "bubble up" the current element (`arr[j]`) to its correct position within the sorted portion of the array, ensuring that the elements to the left of `j` are in sorted order. The loop continues until the correct position is found for the current element, and `j` is decremented to check and swap with the previous element. This process repeats until the entire array is sorted.

**The time complexity of the Insertion Sort algorithm implemented in the provided code is as follows:**

- **Worst Case:** O(n^2)
- **Best Case:** O(n)
- **Average Case:** O(n^2)

**Explanation:**

1. **Worst Case (O(n^2)):**

   - Occurs when the array is in reverse order.
   - In each iteration of the outer loop, the inner while loop may perform up to `i` comparisons and swaps (where `i` is the current index).
   - The worst-case total comparisons and swaps are approximately (n \* (n-1)) / 2, leading to a quadratic time complexity.

2. **Best Case (O(n)):**

   - Occurs when the array is already sorted.
   - In the best case, the while loop may terminate quickly as soon as it finds the correct position for the current element, resulting in a linear number of comparisons and swaps.
   - The outer loop, in this case, still performs `n - 1` iterations, but the inner loop may exit early.

3. **Average Case (O(n^2)):**
   - In the average case, Insertion Sort performs a quadratic number of comparisons and swaps because it doesn't take advantage of pre-existing order in the input data.
   - The average-case time complexity is still O(n^2).

**Adaptive Nature:**
Insertion Sort is considered an adaptive sorting algorithm because its performance is better when the input data is partially sorted. In the best-case scenario, the time complexity becomes linear.

**In-Place Sorting:**
Insertion Sort is an in-place sorting algorithm, meaning it doesn't require additional memory space proportional to the input size.

In summary, while Insertion Sort is simple and efficient for small datasets or partially sorted data, its quadratic time complexity makes it less suitable for large, unsorted datasets compared to more advanced algorithms like Merge Sort or Quick Sort.
