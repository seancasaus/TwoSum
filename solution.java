package TWO_SUM;

/**
 * Author Sean Casaus
 * Created by sean on 7/25/2017.
 * Question:
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one TWO_SUM.solution, and you may not use the same element twice.
 * Source: leetcode.com
 */


public class solution {
    public static int[] twoSum(int[] nums, int target) {
        int returnArray[] = new int[2];
        int temp[] = nums;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < temp.length; j++) {
                if (nums[i] + temp[j] == target && i != j) {
                    returnArray[0] = i;
                    returnArray[1] = j;
                }
            }
        }
        return returnArray;
    }
}
