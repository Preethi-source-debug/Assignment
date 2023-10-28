package com.assignment;

import java.util.Scanner;

public class Main2 {
    
    public static int romanToInt(char n) {
        switch (n) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        return -1; // return -1 for invalid roman numerals
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String romanNumeral = scan.nextLine();
        int result = 0;
        
        for (int i = 0; i < romanNumeral.length(); i++) {
            char currentChar = romanNumeral.charAt(i);
            
            // Calculate the value based on the rules of roman numerals
            int currentValue = romanToInt(currentChar);
            if (i + 1 < romanNumeral.length()) {
                int nextValue = romanToInt(romanNumeral.charAt(i + 1));
                if (currentValue < nextValue) {
                    result -= currentValue;
                } else {
                    result += currentValue;
                }
            } else {
                result += currentValue;
            }
        }
        
        System.out.println(result);
    }
}

