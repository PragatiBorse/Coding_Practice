package com.practice;

/*Create a function that takes an array of numbers and return "Boom!" if the digit 7 appears in the array.
Otherwise, return "there is no 7 in the array".*/

public class Q5 {

    public static String sevenBoom(int[] arr) {

        for (int i=0; i<arr.length; i++){
           if(String.valueOf(arr[i]).contains("7")) {
               return "Boom!";
           }
        }
        return "there is no 7 in the array";

    }
    public static void main(String[] args){
      int[] arr = {8, 6, 33, 100};
      System.out.println(sevenBoom(arr));
    }
}
