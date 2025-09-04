package oran.practice.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a non-empty array of integers nums. every element appears twice except for one. Find that
 * single one. You must implement a solution with a linear runtime complexity TC: O(n) and use only
 * constant extra space SC: O(1)
 *
 * Examples:
 *
 * 1) Input: nums = [2,2,1] Output: 1 2) Input: nums = [4,1,2,1,2] Output: 4 3) Input: nums = [1]
 * Output: 1
 */
public class SingleNumber {
    public static int singleNumber (int[] nums) {
        // Brut force solution
        // TC: O(n) SC: O(n)
        // if(nums.length == 1){
        // return nums[0];
        // }
        // Set<Integer> set = new HashSet<>();
        // for (int num : nums) {
        // if (set.contains(num)) {
        // set.remove(num);
        // } else {
        // set.add(num);
        // }
        // }
        // return set.iterator().next();

        // improved solution to use TC: O(n) SC: O(1)
        int singleNum = 0;
        for (int num : nums) {
            singleNum = singleNum ^ num;
        }
        return singleNum;
    }

    public static void main (String[] args) {
        int[] nums = new int[] { 1, 2, 2, 1, 4,4,5};
        int singleNumber = singleNumber(nums);
        System.out.println(singleNumber);
    }
}
