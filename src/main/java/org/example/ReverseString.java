package org.example;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String input=sc.nextLine();
        String output="";
        for(int i=input.length()-1;i>=0;i--)
        {
            output=output + input.charAt(i);
        }
        System.out.println(output);


    }
}
