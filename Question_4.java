package com.arrays;

/* Given an array nums of size n, return the majority element. The majority element is the
 element that appears more than ⌊n / 2⌋ times. You may assume that the majority element
 always exists in the array. Example 1: Input: nums = [3,2,3] Output: 3 */

class Question_4 {
    public int majorityElement(int[] nums) {
        int count = 0;
        int majority = 0;

        for (int i = 0; i < nums.length; i++) {

            if (count == 0 && majority != nums[i]) {
                majority = nums[i];
                count = 1;
            } else if (majority == nums[i]) {
                count++;
            } else {
                count--;
            }
        }
        return majority;
    }
    public static void main(String[] args) {
        int[] nums = {3, 3, 4, 2, 4, 4, 2, 4, 4};

        Question_4 question = new Question_4();

        int majorityElement = question.majorityElement(nums);

        System.out.println("The majority element is: " + majorityElement);
    }
}