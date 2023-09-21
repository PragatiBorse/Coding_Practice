package com.strings;

public class LengthofLastWord {
    public int lengthOfLastWord(String s) {
        int count = 0;
        for(int i=s.length() - 1 ; i>=0 ; i--) {
            if(s.charAt(i) == ' ' && count == 0) {
                count = 0;
            }
            else if(s.charAt(i) == ' ' && count != 0) {
                break;
            }
            else {
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        LengthofLastWord lastWord = new LengthofLastWord();
        String s = "Hello World";
        int lastWordLength = lastWord.lengthOfLastWord(s);
        System.out.println("Length of Last Word: " + lastWordLength);
    }
}
