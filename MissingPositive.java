package com.strings;
/* Given an unsorted integer array nums, return the smallest missing positive integer.*/

import java.util.HashSet;

class MissingPositive {
    public int firstMissingPositive(int[] nums) {
        int i;
        HashSet<Integer> set=new HashSet<>();
        for(i=0; i<nums.length; i++)
            set.add(nums[i]);
             i=1;
        while(i<=nums.length){
            if(set.contains(i))
                i++;
            else return i;
        }
        return i;
    }
    public static void main(String[] args) {
        MissingPositive obj = new MissingPositive();
        int[] nums = {1, 2, 0, 6, 3};
        int result = obj.firstMissingPositive(nums);
        System.out.println("Smallest Missing Positive: " + result);
    }
}