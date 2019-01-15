/*
* Write a program that sets up a String variable containing a paragraph of text of your choice.
a. Extract the words from the text and sort them into alphabetical order.
b. Display the sorted list of words.

* */
package com.stackroute.pe4;

public class SortWords {
    public  String[] sortWords(String paragraph){
        paragraph=paragraph.toLowerCase();
        String temp;
        String []words = paragraph.split(" ");
        int n = words.length;
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (words[i].compareTo(words[j])>0)
                {
                    temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        return words;
    }
}
