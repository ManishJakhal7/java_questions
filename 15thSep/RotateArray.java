import java.util.*;

public class RotateArray {

    // Complete this method
    public static void rotate(int[] arr) {
        // Write your code here
    }

    // Do not modify this method
    public static void runTest(int testCase, int[] arr, int[] expected) {

        rotate(arr);

        boolean passed = Arrays.equals(arr, expected);

        System.out.println("Test Case " + testCase);
        System.out.println("Input:    " + Arrays.toString(
                testCase == 1 ? new int[]{1, 2, 3, 4, 5} :
                testCase == 2 ? new int[]{1, 2, 3} :
                testCase == 3 ? new int[]{7} :
                testCase == 4 ? new int[]{10, 20} :
                testCase == 5 ? new int[]{5, 5, 2, 2, 1} :
                testCase == 6 ? new int[]{-1, -2, -3, -4} :
                new int[]{9, 8, 7, 6}
        ));
        System.out.println("Expected: " + Arrays.toString(expected));
        System.out.println("Your Output: " + Arrays.toString(arr));
        System.out.println("Result: " + (passed ? "PASS" : "FAIL"));
        System.out.println();
    }

    public static void main(String[] args) {

        runTest(
            1,
            new int[]{1, 2, 3, 4, 5},
            new int[]{5, 1, 2, 3, 4}
        );

        runTest(
            2,
            new int[]{1, 2, 3},
            new int[]{3, 1, 2}
        );

        runTest(
            3,
            new int[]{7},
            new int[]{7}
        );

        runTest(
            4,
            new int[]{10, 20},
            new int[]{20, 10}
        );

        runTest(
            5,
            new int[]{5, 5, 2, 2, 1},
            new int[]{1, 5, 5, 2, 2}
        );

        runTest(
            6,
            new int[]{-1, -2, -3, -4},
            new int[]{-4, -1, -2, -3}
        );

        runTest(
            7,
            new int[]{9, 8, 7, 6},
            new int[]{6, 9, 8, 7}
        );
    }
}
