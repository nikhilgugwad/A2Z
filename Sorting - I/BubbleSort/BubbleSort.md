This Java code implements the Bubble Sort algorithm.

**Bubble Sort Algorithm:**

1. **Outer Loop (i):**

   - Iterates from the last element to the first element in reverse order (`n-1` iterations).
   - Represents the sorted portion of the array.

2. **Inner Loop (j):**

   - Iterates from the beginning of the array up to index `i`.
   - Compares adjacent elements and swaps them if they are in the wrong order.

3. **Swap Operation:**

   - If `arr[j] > arr[j + 1]`, swap the elements.

4. **Sorted Portion:**

   - After each iteration of the outer loop, the largest unsorted element is bubbled up to its correct position at the end of the array.

5. **Output Sorted Array:**
   - After the sorting process is complete, output the sorted array.

**Bubble Sort Time Complexity Analysis:**

Bubble Sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. The algorithm gets its name because smaller elements "bubble" to the top of the array.

The time complexity of Bubble Sort is O(n^2) in the worst and average cases, and O(n) in the best case. Let's break down these cases:

1. **Worst Case (O(n^2)):**

   - Occurs when the input array is in reverse order, so every element needs to be swapped in each pass.
   - The outer loop runs for (n-1) iterations, and the inner loop runs for (n-1), (n-2), ..., 1 iterations, resulting in a total of n \* (n-1) / 2 comparisons and swaps.
   - The time complexity is quadratic, proportional to the square of the number of elements.

2. **Average Case (O(n^2)):**

   - On average, Bubble Sort still requires O(n^2) comparisons and swaps because the algorithm doesn't take advantage of existing order and makes the same number of comparisons as in the worst case.

3. **Best Case (O(n)):**
   - The best case occurs when the input array is already sorted.
   - In this case, the algorithm still needs to perform the outer loop for (n-1) iterations, but the inner loop may break early if no swaps are made, resulting in a linear time complexity.
   - Despite the best-case linear time for comparisons, the overall time complexity remains O(n^2) because of the required swaps.

**Adaptive Nature:**
Bubble Sort is considered an adaptive sorting algorithm because it performs better when the input is partially sorted. However, its performance is still limited by its O(n^2) time complexity in the worst and average cases.

**Conclusion:**
While Bubble Sort is easy to understand and implement, it is not the most efficient sorting algorithm for large datasets. Other algorithms like Quick Sort or Merge Sort are often preferred due to their better average and worst-case time complexities.
