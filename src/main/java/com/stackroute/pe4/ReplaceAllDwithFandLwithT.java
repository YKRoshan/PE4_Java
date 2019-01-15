/*
* Write a program to replace all d with f and all l with t in the given String
Input: daily dry
Output: faity fry
Original string: daily dry
New String: faity fry
* */
package com.stackroute.pe4;

public class ReplaceAllDwithFandLwithT {
    public  String replaceAllDwithFandLwithT(String input){
        input = input.replaceAll("d","f");
        input = input.replaceAll("l","t");
        return input;
    }
}
