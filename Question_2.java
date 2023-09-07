package com.arrays;

/* Given an integer array num sorted in non-decreasing order,remove the duplicates
 in-place such that each unique element appears only once. The relative order of the
  elements should be kept the same. Then return the number of unique elements in num.
 */
public class Question_2 {
    public int removeDuplicates(int[] num) {
        int j = 1;
        for (int i = 1; i < num.length; i++) {
            if (num[i] != num[i - 1]) {
                num[j] = num[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        // Create an instance of HelloWorld
        Question_2 q = new Question_2();

        // Example array
        int[] num = {1, 1, 2, 2, 2, 3, 4, 4, 5, 5};

        // Call the removeDuplicates method and pass the array as an argument
        int n = q.removeDuplicates(num);

        // Print the modified array and its length
        System.out.println("Modified Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println("\nLength of Modified Array: " + n);
    }
}

