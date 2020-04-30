package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class MySequence {
    //This method takes a string, then returns the longest series of unique letters in that string.
    //Method takes a String
    //Returns the LONGEST series of unique letters in that string
    //using while loops to find the length

    public int getSequence(String s) {

       String word = "";
        int length = word.length();

       for (int i = 0; i < s.length(); i++){

           if (!word.contains(String.valueOf(s.charAt(i)))){
               word += s.charAt(i);
           }
       }

        return length;
    }




}


