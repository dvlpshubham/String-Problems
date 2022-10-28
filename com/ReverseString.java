package com;

import java.util.Scanner;

public class ReverseString {
    public void pringReverseString(String str) {
        String reversedstr = " ";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedstr = reversedstr + str.charAt(i);
        }
        System.out.println("Orignal String :" + str);
        System.out.println("Reversed String :" + reversedstr);
    }

    public static void main(String[] args) {
        System.out.println("Enter a String :");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        ReverseString reverseString = new ReverseString();
        reverseString.pringReverseString(str);
    }
}
