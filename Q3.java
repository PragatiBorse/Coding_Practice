package com.practice;

/*Create a function that takes voltage and current and returns the calculated power.*/

public class Q3 {
    public static int power(int voltage, int current){
        int pow=voltage*current;
        return pow;
    }
    public static void main(String[] args){
       int v1=230;
       int v2=10;
       int result= power(v1,v2);
       System.out.println(result);
    }
}
