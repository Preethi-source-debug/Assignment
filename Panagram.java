package com.javaassignment.in;

import java.util.*;

public class Panagram {

    public static void isPangram(String s) {
        String t = "abcdefghijklmnopqrstuvwxyz";
        int count = 0;

        s = s.toLowerCase();

        for (int i = 0; i < t.length(); i++) {
            if (s.indexOf(t.charAt(i)) >= 0) {
                count++;
            } else {
                break;
            }
        }
        if (count == 26) {
            System.out.println("Pangram");
        } else {
            System.out.println("Not Pangram");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        isPangram(s);

    }

}

