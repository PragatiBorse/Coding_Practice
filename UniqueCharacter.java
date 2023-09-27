package com.demo;

import java.util.*;

public class UniqueCharacter {
    public static boolean unique_char(String str) {
        char[] characters = str.toCharArray();
        Arrays.sort(characters);
        for (int i = 1; i < characters.length; ++i) {
            if (characters[i] == characters[i-1]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        //String str = "xyz";
        String str = "abcd";
        System.out.println("Original String : "+str);
        System.out.println("String has all unique characters: "+unique_char(str));
    }
}
