package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String str = "BeginnersBook";
        int vcount = 0, ccount =0;
        // convering all the chars to lowercase
        str = str.toLowerCase();
        for(int i =0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch == 'a' ||  ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vcount ++;
            }
            else if ((ch >='a' && ch<= 'z')){
                ccount++;
            }
            System.out.println("Number of Vowels:" + vcount);
            System.out.println("Nuber of Consonants:" + ccount);
        }
    }
}
