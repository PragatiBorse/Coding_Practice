package com.strings;

/* Given an integer array nums, find the subarray with the largest sum, and return its sum.*/

public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        return maxSum;
    }
    public static void main(String[] args) {

        MaxSubArray obj = new MaxSubArray();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int max = obj.maxSubArray(nums);
        System.out.println("Smallest Missing Positive: " + max);
    }
}
