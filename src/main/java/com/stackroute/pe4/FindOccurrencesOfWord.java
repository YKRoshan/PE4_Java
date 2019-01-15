/*
Write a java program to count the total number of occurrences of a given character
in a string without using any loop?
 */
package com.stackroute.pe4;

import java.util.regex.*;

public class FindOccurrencesOfWord {
    public  String findOccurrencesOfWord(String theRegex, String str2Check){

            Pattern checkRegex = Pattern.compile(theRegex);

            Matcher regexMatcher = checkRegex.matcher( str2Check );
            String result = "";

            while ( regexMatcher.find() ){
                if (regexMatcher.group().length() != 0){
                    result+=( " Found at: " + regexMatcher.start()+"-"+ regexMatcher.end());
                }
            }

            return result;
        }
}
