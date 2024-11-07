import java.util.Arrays;

public class _06SortedArray {
    public static boolean function(int a[], int i) {
        // TO CHECK IF THE ARRAY IS SORTED
        if (i == a.length - 1) { // Check if we reached the last element
            return true;
        }
        if (a[i] > a[i + 1]) {
            return false;
        }
        return function(a, i + 1); // Recursive call without []
    }

    public static void main(String[] args) {
        int a[] = {2, 4, 3, 1};
        Arrays.sort(a); // Sorts the array

        // Print the sorted array
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        // Call function and store the result
        boolean isSorted = function(a, 0);
        System.out.println("Is array sorted? " + isSorted);
    }
}
