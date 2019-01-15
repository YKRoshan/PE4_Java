/*
* Write a program to find out the multiple occurrences of the given word in a string using Matcher methods.
 Input : She sells seashells by the seashore
 Given word: se
 Output :
        Found at: 4 - 6
        Found at: 10 - 12
       Found at: 27 - 29

* */
package com.stackroute.pe4;

public class CountOccurrencesOfChar {
    public  int countOccurrencesOfChar(String input,String character){
        int count = input.length() - input.replaceAll(character, "").length();
        return count;
    }
}


