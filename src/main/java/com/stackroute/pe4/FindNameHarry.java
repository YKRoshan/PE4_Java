/*
* Write a program with the implementation of Regular Expression to find the presence of the name Harry in a string.
 Input: This is Harry.
 Output: Is Harry here ? true
 Input : This is Henry.
 Output: Is Harry here ? false
* */
package com.stackroute.pe4;

import java.util.regex.*;

public class FindNameHarry {
        public  boolean findNameHarry(String input, String regExp){

        Pattern pattern = Pattern.compile(regExp);

        Matcher matcher = pattern.matcher(input);
       while ( matcher.find() ){
            if (matcher.group().length() != 0){
                return true;
            }
        }
        return false;
    }
}
