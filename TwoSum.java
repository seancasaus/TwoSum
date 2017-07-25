package TWO_SUM;

/**
 * Author Sean Casaus
 * Created by sean on 7/25/2017.
 * Question:
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one TWO_SUM.solution, and you may not use the same element twice.
 * Source: leetcode.com
 * Answer Description:
 * A simple O(n^2) solution to the question that I completed off the top of my head.
 * After further research the better solution to the problem would have been to implement a binary search tree
 * which would have given a O(nlogn) solution to the problem
 */
import java.lang.*;

public class TwoSum {
    public static void main(String [] args) {
        int array[] = {5, 0, 2, -2};
        int target = 3;
        int newArray[];
        newArray = solution.twoSum(array, target);
        System.out.printf("[%d, %d]", newArray[0], newArray[1]);
    }
}
