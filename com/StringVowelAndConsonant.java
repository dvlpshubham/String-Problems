package com;

import java.util.Scanner;

public class StringVowelAndConsonant {
    public void countVowelAndConsonant(String str) {
        str = str.toLowerCase();
        int vow = 0;
        int con = 0;
        for (int i = 0; i < str.length(); i++)
        {
            char c = str.charAt(i);
            if (c != ' ')
            {
                if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
                {
                    vow++;
                }
                else
                    con++;
            }
        }
        System.out.println("No Of Vowels are : " + vow);
        System.out.println("No Of Consonent are :" + con);

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter the string");
        str = sc.nextLine();
        StringVowelAndConsonant stringVowelAndConsonant = new StringVowelAndConsonant();
        stringVowelAndConsonant.countVowelAndConsonant(str);
    }
}

