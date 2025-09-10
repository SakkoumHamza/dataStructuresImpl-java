package com.hamza;

import java.util.HashMap;

public class FindFirstNonRepeatedChar {
    public static void findFirstNonRepeatedCharacter(String str) {
        var chars =  str.toLowerCase().toCharArray();
        char space = ' ';
        HashMap<Character, Integer> map = new HashMap<>();
//        Populating the hashtable

        for (char c : chars) {
            var count = map.getOrDefault(c,0) ;
            map.put(c, ++count);
        }
        System.out.println(map);

//        Finding the first non repeated
        for (char c  : chars) {
            if (map.get(c) == 1 && c!=space) {
                System.out.println(c);
                break;
            }
        }
    }



    public static void main(String[] args) {
        findFirstNonRepeatedCharacter("hello world");

    }
}