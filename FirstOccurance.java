package com.strings;

/* Given two strings needle and haystack, return the index of the first occurrence of needle in haystack,
 or -1 if needle is not part of haystack.*/

public class FirstOccurance {
    public static int strStr(String haystack, String needle) {
        if (needle == null || needle.length() == 0) {
            return 0;
        }

        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        int index = strStr(haystack, needle);
        System.out.println("Index of needle in haystack: " + index);
    }
}
