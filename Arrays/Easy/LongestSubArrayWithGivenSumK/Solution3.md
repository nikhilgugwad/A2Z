**Here's a detailed explanation of each iteration of the for loop within the `getLongestSubarray` function:**

**1st Iteration (i = 0):**

- **Prefix Sum:** `sum` is initialized to 0 and added to the first element of the array (`a[0] = 2`), making `sum = 2`.
- **Check for sum == k:** `sum` is not equal to `k (10)`, so no update to `maxLen`.
- **Remaining Sum:** `rem = sum - k = -8`. Not found in `preSumMap`.
- **Update preSumMap:** `preSumMap` is updated with `(sum, i)` as `(2, 0)`.

**2nd Iteration (i = 1):**

- **Prefix Sum:** `sum` is updated to `sum + a[1] = 2 + 3 = 5`.
- **Check for sum == k:** `sum` is not equal to `k (10)`, so no update to `maxLen`.
- **Remaining Sum:** `rem = sum - k = -5`. Not found in `preSumMap`.
- **Update preSumMap:** `preSumMap` is updated with `(5, 1)`.

**3rd Iteration (i = 2):**

- **Prefix Sum:** `sum` is updated to `sum + a[2] = 5 + 5 = 10`.
- **Check for sum == k:** `sum` is now equal to `k (10)`, so `maxLen` is updated to `i + 1 = 3`.
- **Remaining Sum:** `rem = sum - k = 0`. Not found in `preSumMap` (this iteration).
- **Update preSumMap:** `preSumMap` is updated with `(10, 2)`.

**4th Iteration (i = 3):**

- **Prefix Sum:** `sum` is updated to `sum + a[3] = 10 + 1 = 11`.
- **Check for sum == k:** `sum` is not equal to `k (10)`.
- **Remaining Sum:** `rem = sum - k = 1`. Not found in `preSumMap`.
- **Update preSumMap:** `preSumMap` is updated with `(11, 3)`.

**5th Iteration (i = 4):**

- **Prefix Sum:** `sum` is updated to `sum + a[4] = 11 + 9 = 20`.
- **Check for sum == k:** `sum` is not equal to `k (10)`.
- **Remaining Sum:** `rem = sum - k = 10`. Found in `preSumMap` with index 2.
- **Calculate length:** `length = i - preSumMap.get(rem) = 4 - 2 = 2`.
- **Update maxLen:** `maxLen` remains 3 as `2 < 3`.
- **Update preSumMap:** `preSumMap` is updated with `(20, 4)`.

**Loop ends.** The function returns `maxLen = 3`, which is the length of the longest subarray with a sum of 10.

**Here are the key-value pairs in the `preSumMap` after the 5th iteration:**

| \*\*Keys | Values\*\* |
| -------- | ---------- |
| 2        | 0          |
| 5        | 1          |
| 10       | 2          |
| 11       | 3          |
| 20       | 4          |

**Explanation:**

- **2:** The prefix sum 2 was first encountered at index 0.
- **5:** The prefix sum 5 was first encountered at index 1.
- **10:** The prefix sum 10 was first encountered at index 2.
- **11:** The prefix sum 11 was first encountered at index 3.
- **20:** The prefix sum 20 was first encountered at index 4.

The map stores these pairs to efficiently check for potential subarrays with a sum of `k` in subsequent iterations.
