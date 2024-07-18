package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SeparateCarLetterSpe {

    public static void main(String[] args) {
        String name = "aAvC123!&";
        char[] arr = new char[9];
        for (int i=0; i<name.length(); i++)
        {
            char ch = name.charAt(i);
            arr[i]=ch;
        }
        System.out.println(Arrays.toString(arr));
        List<Character> intlist = new ArrayList<>();
        List<Character> charlist = new ArrayList<>();
        List<Character> specialcharlist = new ArrayList<>();
        for(char ch: name.toCharArray()){
            if(Character.isDigit(ch))
            {
                intlist.add(ch);
            } else if (Character.isLetter(ch))
            {
                charlist.add(ch);
            }
            else
            {
                specialcharlist.add(ch);
            }
        }
        System.out.println("Characters are - "+charlist+"\nSpecial Characters are - "+specialcharlist+"\nIntegers are - "+intlist);
    }
}