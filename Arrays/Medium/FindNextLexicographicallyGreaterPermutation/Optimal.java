import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Optimal {

    // Function to generate the next lexicographically greater permutation of a list
    static List<Integer> next_permutation(List<Integer> arr, int n) {
        int index = -1;

        // Find the largest index i such that arr[i] < arr[i+1]
        for (int i = n - 2; i >= 0; i--) {
            if (arr.get(i) < arr.get(i + 1)) {
                index = i;
                break;
            }
        }

        // If no such index exists, reverse the entire list and return
        if (index == -1) {
            Collections.reverse(arr);
            return arr;
        }

        // Find the largest index i such that arr[i] > arr[index]
        for (int i = n - 1; index < i; i--) {
            if (arr.get(i) > arr.get(index)) {
                // Swap arr[index] and arr[i]
                int temp = arr.get(index);
                arr.set(index, arr.get(i));
                arr.set(i, temp);
                break;
            }
        }

        // Reverse the suffix starting from index+1
        List<Integer> sublist = arr.subList(index + 1, n);
        Collections.reverse(sublist);

        return arr;
    }

    // Main method to test the implementation
    public static void main(String[] args) {
        // Input list
        List<Integer> arr = Arrays.asList(new Integer[] { 2, 1, 5, 4, 3, 0, 0 });
        int n = arr.size(); // Size of the list
        // Generate the next lexicographically greater permutation
        List<Integer> ans = next_permutation(arr, n);
        // Print the result
        System.out.print("The next lexicographically greater permutation is : ");
        for (Integer it : ans) {
            System.out.print(it + " ");
        }
    }
}
