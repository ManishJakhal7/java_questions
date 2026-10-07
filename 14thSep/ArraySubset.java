import java.util.*;

public class ArraySubset {

    /*
     * Complete this method.
     *
     * Return true if b is a subset of a.
     * Otherwise, return false.
     */
    public static boolean isSubset(int[] a, int[] b) {
        // Write your code here

        return false;
    }

    public static void main(String[] args) {

        // Test Case 1
        int[] a1 = {11, 7, 1, 13, 21, 3, 7, 3};
        int[] b1 = {11, 3, 7, 1, 7};
        boolean expected1 = true;

        boolean result1 = isSubset(a1, b1);

        System.out.println("Test Case 1");
        System.out.println("Input: a = " + Arrays.toString(a1)
                + ", b = " + Arrays.toString(b1));
        System.out.println("Expected: " + expected1);
        System.out.println("Your Output: " + result1);
        System.out.println("Result: " + (result1 == expected1 ? "PASS" : "FAIL"));
        System.out.println();


        // Test Case 2
        int[] a2 = {1, 2, 3, 4, 4, 5, 6};
        int[] b2 = {1, 2, 4};
        boolean expected2 = true;

        boolean result2 = isSubset(a2, b2);

        System.out.println("Test Case 2");
        System.out.println("Input: a = " + Arrays.toString(a2)
                + ", b = " + Arrays.toString(b2));
        System.out.println("Expected: " + expected2);
        System.out.println("Your Output: " + result2);
        System.out.println("Result: " + (result2 == expected2 ? "PASS" : "FAIL"));
        System.out.println();


        // Test Case 3
        int[] a3 = {10, 5, 2, 23, 19};
        int[] b3 = {19, 5, 3};
        boolean expected3 = false;

        boolean result3 = isSubset(a3, b3);

        System.out.println("Test Case 3");
        System.out.println("Input: a = " + Arrays.toString(a3)
                + ", b = " + Arrays.toString(b3));
        System.out.println("Expected: " + expected3);
        System.out.println("Your Output: " + result3);
        System.out.println("Result: " + (result3 == expected3 ? "PASS" : "FAIL"));
        System.out.println();


        // Test Case 4 - Duplicate frequency matters
        int[] a4 = {1, 2, 2, 3, 4};
        int[] b4 = {2, 2, 4};
        boolean expected4 = true;

        boolean result4 = isSubset(a4, b4);

        System.out.println("Test Case 4");
        System.out.println("Input: a = " + Arrays.toString(a4)
                + ", b = " + Arrays.toString(b4));
        System.out.println("Expected: " + expected4);
        System.out.println("Your Output: " + result4);
        System.out.println("Result: " + (result4 == expected4 ? "PASS" : "FAIL"));
        System.out.println();


        // Test Case 5 - Not enough occurrences
        int[] a5 = {1, 2, 3, 4};
        int[] b5 = {2, 2};
        boolean expected5 = false;

        boolean result5 = isSubset(a5, b5);

        System.out.println("Test Case 5");
        System.out.println("Input: a = " + Arrays.toString(a5)
                + ", b = " + Arrays.toString(b5));
        System.out.println("Expected: " + expected5);
        System.out.println("Your Output: " + result5);
        System.out.println("Result: " + (result5 == expected5 ? "PASS" : "FAIL"));
        System.out.println();


        // Test Case 6 - Same arrays
        int[] a6 = {1, 2, 3, 4, 5};
        int[] b6 = {1, 2, 3, 4, 5};
        boolean expected6 = true;

        boolean result6 = isSubset(a6, b6);

        System.out.println("Test Case 6");
        System.out.println("Input: a = " + Arrays.toString(a6)
                + ", b = " + Arrays.toString(b6));
        System.out.println("Expected: " + expected6);
        System.out.println("Your Output: " + result6);
        System.out.println("Result: " + (result6 == expected6 ? "PASS" : "FAIL"));
        System.out.println();


        // Test Case 7 - Repeated elements
        int[] a7 = {5, 5, 5, 5, 2, 3};
        int[] b7 = {5, 5, 5};
        boolean expected7 = true;

        boolean result7 = isSubset(a7, b7);

        System.out.println("Test Case 7");
        System.out.println("Input: a = " + Arrays.toString(a7)
                + ", b = " + Arrays.toString(b7));
        System.out.println("Expected: " + expected7);
        System.out.println("Your Output: " + result7);
        System.out.println("Result: " + (result7 == expected7 ? "PASS" : "FAIL"));
        System.out.println();


        // Test Case 8 - Element completely missing
        int[] a8 = {10, 20, 30, 40};
        int[] b8 = {20, 50};
        boolean expected8 = false;

        boolean result8 = isSubset(a8, b8);

        System.out.println("Test Case 8");
        System.out.println("Input: a = " + Arrays.toString(a8)
                + ", b = " + Arrays.toString(b8));
        System.out.println("Expected: " + expected8);
        System.out.println("Your Output: " + result8);
        System.out.println("Result: " + (result8 == expected8 ? "PASS" : "FAIL"));
        System.out.println();
    }
}
