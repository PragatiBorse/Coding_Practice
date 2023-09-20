package com.arrays;

/* Given an array of integers nums and an integer target, return indices of the two numbers
such that they add up to target. You may assume that each input would have exactly one solution,
and you may not use the same element twice. */

public class Question_6 {
    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target=9;
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("Output: [" + i + ", " + j + "]");
                    return;
                }
            }
        }
    }
}
