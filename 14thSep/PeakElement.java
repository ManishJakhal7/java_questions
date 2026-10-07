import java.util.*;

public class PeakElement {

    /*
     * Complete this method.
     *
     * Return the index of any peak element.
     */
    public static int findPeakElement(int[] arr) {
        // Write your code here

        return -1;
    }

    /*
     * Checks whether the returned index is actually a peak.
     *
     * The student does NOT need to modify this method.
     */
    public static boolean isValidPeak(int[] arr, int index) {

        if (index < 0 || index >= arr.length) {
            return false;
        }

        long left = (index == 0) ? Long.MIN_VALUE : arr[index - 1];
        long right = (index == arr.length - 1)
                ? Long.MIN_VALUE
                : arr[index + 1];

        return arr[index] > left && arr[index] > right;
    }

    public static void runTest(int testCase, int[] arr) {

        int result = findPeakElement(arr);
        boolean passed = isValidPeak(arr, result);

        System.out.println("Test Case " + testCase);
        System.out.println("Input: " + Arrays.toString(arr));
        System.out.println("Returned Index: " + result);
        System.out.println("Returned Value: "
                + (result >= 0 && result < arr.length ? arr[result] : "Invalid"));
        System.out.println("Expected: true");
        System.out.println("Your Output: " + passed);
        System.out.println("Result: " + (passed ? "PASS" : "FAIL"));
        System.out.println();
    }

    public static void main(String[] args) {

        // Test Case 1 - Peak in the middle
        runTest(1, new int[]{1, 2, 4, 5, 7, 8, 3});

        // Test Case 2 - Multiple peaks
        runTest(2, new int[]{10, 20, 15, 2, 23, 90, 80});

        // Test Case 3 - Single element
        runTest(3, new int[]{5});

        // Test Case 4 - Peak at the beginning
        runTest(4, new int[]{10, 5, 3, 2, 1});

        // Test Case 5 - Peak at the end
        runTest(5, new int[]{1, 2, 3, 5, 10});

        // Test Case 6 - Strictly increasing
        runTest(6, new int[]{1, 2, 3, 4, 5, 6});

        // Test Case 7 - Strictly decreasing
        runTest(7, new int[]{6, 5, 4, 3, 2, 1});

        // Test Case 8 - Alternating peaks
        runTest(8, new int[]{1, 5, 2, 6, 3, 7, 4});

        // Test Case 9 - Negative values
        runTest(9, new int[]{-10, -5, -8, -2, -7});

        // Test Case 10 - Two elements
        runTest(10, new int[]{4, 2});

        // Test Case 11 - Two elements
        runTest(11, new int[]{2, 4});

        // Test Case 12 - Peak with Integer.MIN_VALUE nearby
        runTest(12, new int[]{
                Integer.MIN_VALUE,
                -100,
                -200,
                -50,
                -300
        });
    }
}
