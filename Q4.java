package com.practice;

public class Q4 {
    public static String swapCharacters(String input) {

        if (input.length() < 2)
        {
            return "Incompatible.";
        }
        else if (input.charAt(0) == input.charAt(input.length() - 1))
        {
            return "Two's a pair.";
        }
        else {
            char[] chars = input.toCharArray();
            char temp = chars[0];
            chars[0] = chars[input.length() - 1];
            chars[input.length() - 1] = temp;
            return new String(chars);
        }
    }

    public static void main(String[] args) {
        String testString1 = "hello";
        String testString2 = "world";
        String testString3 = "a";
        String testString4 = "aa";

        System.out.println(swapCharacters(testString1));
        System.out.println(swapCharacters(testString2));
        System.out.println(swapCharacters(testString3));
        System.out.println(swapCharacters(testString4));
    }
}
