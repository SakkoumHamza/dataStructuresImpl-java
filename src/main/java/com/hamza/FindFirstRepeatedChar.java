package com.hamza;

import java.util.HashMap;

public  class FindFirstRepeatedChar {
    public static void find(String sentence){
        char[] chars = sentence.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
//        Populating the map with chars
        for (char c :chars){
            var count = map.getOrDefault(c,0);
             map.put(c,++count);
        }

//        Finding the first repeated char

        for (char c : chars){
            if(map.get(c) > 1) {
                System.out.println("The first repeated char is : " + c);
                break;
            }
        }

    }



    public static void main(String[] args) {
        find("Hello world");
    }
}
