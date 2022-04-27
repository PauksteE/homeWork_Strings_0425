package com.company;

import java.util.Scanner;

public class Task3 {
    /*
Write a program that receives text from the user and then creates a string that is the inverted text
and displays it in the console. Get the data from the user in the console using the Scanner class.
For example, for the text "Cat", the program should write the text "taC" in the console.
     */

    public void reverse(){

        Scanner scanner = new Scanner(System.in);

        //Insert a text.
        System.out.println("Please enter the text");
        String text = scanner.nextLine();

        //Create a String and reverse it.
        StringBuilder str1 = new StringBuilder(text);
        str1.reverse();
        System.out.println("str1 " + str1);

        //Print a character reverse.
        for (int i = text.length() - 1; i >= 0; i--){
            System.out.print(text.charAt(i));
        }




    }


}
