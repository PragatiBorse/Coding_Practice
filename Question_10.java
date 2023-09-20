package com.arrays;
/* Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.*/

public class Question_10 {
    public static int singleNumber(int[] nums) {
        int result = 0;

        for (int num : nums) {
            result ^= num;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {4, 4, 1, 2, 1, 2, 6};
        int single = singleNumber(nums);
        System.out.println("The single element is: " + single);
    }
}
