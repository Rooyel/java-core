package com.learning.core.day3;


import java.util.*;

class D03P11 {

    static String encodeString(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        String res = "";
        int i = 0;

        char ch;
        for (int j = 0; j < str.length(); j++) {
            ch = str.charAt(j);

            if (!map.containsKey(ch))
                map.put(ch, i++);

            res += map.get(ch);
        }

        return res;
    }

    static void findMatchedWords(
        String[] dict, String pattern) {
        int len = pattern.length();

        String hash = encodeString(pattern);

        for (String word : dict) {
            if (word.length() == len
                && encodeString(word).equals(hash))
                System.out.print(word + " ");
        }
    }

    public static void main(String args[]) {
        String[] dict = { "abb", "abc",
                          "xyz", "xyy" };
        String pattern = "foo";

        findMatchedWords(dict, pattern);
    }
} 
