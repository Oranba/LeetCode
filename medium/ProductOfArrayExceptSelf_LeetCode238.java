package oran.practice.medium;

/*
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.



Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]


Constraints:

2 <= nums.length <= 105
-30 <= nums[i] <= 30
The input is generated such that answer[i] is guaranteed to fit in a 32-bit integer.
 */
public class ProductOfArrayExceptSelf_LeetCode238 {

    // Solution guarantee Time Complexity of O(n)
    public int[] Solution(int[] input){
        int length = input.length;
        int[] left = new int[length];
        int[] right = new int[length];
        int[] result = new int[length];

        left[0] = 1;
        right[length-1] = 1;

        //left
        for(int i=1;i<length;i++){
            left[i] = input[i-1]*left[i-1];
        }
        //right
        for(int i=length-2;i>=0;i--){
            right[i] = input[i+1]*right[i+1];
        }
        for(int i=0;i<length;i++){
            result[i] = left[i]*right[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] input = new int[]{2,3,4,5,1};
        ProductOfArrayExceptSelf_LeetCode238 productOfArrayExceptSelfLeetCode238 = new ProductOfArrayExceptSelf_LeetCode238();
        int[] result = productOfArrayExceptSelfLeetCode238.Solution(input);
        for(int i:result){
            System.out.println(i); //expected: {60,40,30,24,120}
        }
    }
}
