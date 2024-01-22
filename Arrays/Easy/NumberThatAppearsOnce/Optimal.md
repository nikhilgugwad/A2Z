The XOR operation has two key properties that make it useful for finding the single element in an array where all other elements appear twice:

1. **XOR of two same numbers is always 0:** This property is expressed as \( a \oplus a = 0 \). It means that when you XOR a number with itself, the result is always 0.

2. **XOR of a number with 0 is the number itself:** This property is expressed as \( 0 \oplus a = a \). It means that when you XOR a number with 0, the result is the number itself.

Dry run:

\[ \text{XOR of all elements} = 4 \oplus 1 \oplus 2 \oplus 1 \oplus 2 \]
\[ = 4 \oplus (1 \oplus 1) \oplus (2 \oplus 2) \]
\[ = 4 \oplus 0 \oplus 0 \]
\[ = 4 \]

So, in this case, the final result is 4, which is the single element in the array. The XOR operation efficiently handles the cancellation of paired elements, leaving only the single element in the result.

In the `Optimal` class you provided, the for loop iterates through the elements of the array and uses the XOR operation to find the number that appears only once in the array. Let's break down the loop and explain what values get stored in the `xor` variable at each iteration:

```java
static int single_occurrence(int[] arr, int n) {
    int xor = 0;  // Initialize xor to 0

    for (int i = 0; i < n; i++) {
        xor = xor ^ arr[i];  // XOR operation on current array element and the current value of xor
    }

    return xor;  // Final xor value, which represents the number that appears only once
}
```

Let's go through the loop step by step:

1. **Initialization:** `xor` is initialized to 0.

2. **First Iteration (i=0):** `xor = 0 ^ 4` => `xor` becomes 4.

3. **Second Iteration (i=1):** `xor = 4 ^ 1` => `xor` becomes 5.

4. **Third Iteration (i=2):** `xor = 5 ^ 2` => `xor` becomes 7.

5. **Fourth Iteration (i=3):** `xor = 7 ^ 1` => `xor` becomes 6.

6. **Fifth Iteration (i=4):** `xor = 6 ^ 2` => `xor` becomes 4.

After the loop, the value stored in `xor` is the result of XORing all the elements in the array. The unique property of XOR is that when you XOR a number with itself, the result is 0. Therefore, all elements that appear twice in the array will contribute 0 to the final XOR result, and only the element that appears once will contribute its value to the final result.

In the given example with the array `{4, 1, 2, 1, 2}`, the final value of `xor` is 4, which represents the number that appears only once in the array.
