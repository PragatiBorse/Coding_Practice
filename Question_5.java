package com.arrays;

/* Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
Example: Input: nums = [1,2,3,4,5,6,7], k = 3  Output: [5,6,7,1,2,3,4] */

public class Question_5 {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n; // In case k is greater than the length of the array

        // Reverse the entire array
        reverse(nums, 0, n - 1);

        // Reverse the first k elements
        reverse(nums, 0, k - 1);

        // Reverse the remaining n - k elements
        reverse(nums, k, n - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        // Example input array
        int[] nums = {1, 2, 3, 4, 5, 6, 7};

        // Number of steps to rotate
        int k = 3;

        // Create an instance of your class (assuming the `rotate` method is in a class)
        Question_5 rotateArray = new Question_5();

        // Call the rotate method to perform the rotation
        rotateArray.rotate(nums, k);

        // Print the rotated array
        System.out.println("Rotated Array:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
