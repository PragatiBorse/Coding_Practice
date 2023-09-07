package com.arrays;
/* Given an integer array nums and an integer val, remove all occurrences
of val in nums in-place. The order of the elements may be changed.
Then return the number of elements in nums which are not equal to val.*/

import java.util.*;

public class Question_1 {
        public static void main(String []args){
            int[] nums = {3,2,2,3}; int val = 3; int count=0 ;
            for(int i=0;i<nums.length;i++){
                if(val != nums[i]){
                    count++;
                }

            }System.out.println(count);
        }
    }

