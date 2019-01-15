/*
* Write a program to transpose the given string.
 Input String : a quick brown fox jumps over the lazy dog
 Output String: a  kciuq  nworb  xof  spmuj  revo  eht  yzal  god
* */
package com.stackroute.pe4;

public class TransposeString {
    public  String[] transposeString(String input){
        String []words = input.split(" ");
        for(int j=0;j<words.length;j++){
            String temp = words[j];
            String reverse = "";
            for(int i = temp.length() - 1; i >= 0; i--) {
                reverse = reverse + temp.charAt(i);
            }
            words[j]=reverse;
        }
    return words;
    }
}