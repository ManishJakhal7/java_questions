import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
}

public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        Solution solution = new Solution();
        int[] answer = solution.twoSum(nums, target);

        for (int index : answer) {
            System.out.print(index + " ");
        }
    }
}