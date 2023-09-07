package com.arrays;

/* Given an integer array nums sorted in non-decreasing order, remove some duplicates
 in-place such that each unique element appears at most twice. The relative order of the
 elements should be kept the same.*/
public class Question_3 {
    public int removeDuplicates(int[] num){
        int j=2;
       for(int i=2;i<num.length;i++){
           if(num[i] != num[i-2]){
               num[j] = num[i];
               j++;
           }
       }
        return j;
    }
    public static void main(String[] args){

        Question_3 question3 = new Question_3();

        int[] num={4, 3, 3, 4, 2, 3, 7, 3, 4, 4, 1, 2, 5, 6};

        int n=question3.removeDuplicates(num);

        for(int i=0;i<n;i++){
            System.out.print(num[i]+ " ");
        }
        System.out.println();
        System.out.println("\nLength of Modified Array: " + n);
    }
}
