package com;

import java.util.Scanner;

public class StringOne {

    public void countCharacters(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                count++;
            }
        }
        System.out.println("No of character in the string is :" + count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter the string");
        str = sc.nextLine();
        StringOne stringOne = new StringOne();
        stringOne.countCharacters(str);

    }
}
