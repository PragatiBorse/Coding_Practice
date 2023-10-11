package com.strings;

/* You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of
the integer. The digits are ordered from most significant to least significant in left-to-right order. The large
integer does not contain any leading 0's. Increment the large integer by one and return the resulting array of digits.*/

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            digits[i]++;
            if (digits[i] < 10) {
                return digits;
            }
            digits[i] = 0;
        }

        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
    public static void main(String args[]){
        PlusOne obj = new PlusOne();
        int[] digits = {1, 2, 3, 5}; // Change this array as needed
        int[] result = obj.plusOne(digits);

        // Print the result
        System.out.print("Result: ");
        for (int num : result) {
            System.out.print(num + " ");

        }
    }
}
