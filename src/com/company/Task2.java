package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

    /* Write a program that reads the text entered by the user and then divides it into individual words.
    Then counts the number of occurrences of words regardless of case and writes them to the console in alphabetical order.
    For example, for the text "Ala likes cats, but she is not liked by the Cats.", the program should write in the console:
  •	ala - 1
•	but - 1
•	by - 1
•	cats - 2
•	is - 1
•	liked - 1
•	likes - 1
•	not - 1
•	she - 1
•	the - 1
Assume that any punctuation marks may appear in the text. Get the data from the user in the console using the Scanner class.
Allas is a young boy, a boy!
     */

    public void divide(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the text");
        String text = scanner.nextLine();


        String textLowerCase = text.toLowerCase();

        System.out.println(textLowerCase);

        String[] words = textLowerCase.split("[, .:;!?]+");
        Arrays.sort(words);

        System.out.println(Arrays.toString(words));

        for (int i = 0; i < words.length-1; i++) {
            int temp = 0;
            for (int j = i + 1; j < words.length; j++) {

                if (words[i].equals(words[j])){
                    temp++;
                } else {
                    if(j < words.length-1){
                        System.out.println(words[i] + " - " + (temp + 1));
                        i+= temp;
                        break;
                    } else {
                        System.out.println(words[j] + " - 1");
                    }
                } //end of if
            }  //2nd for
        } //1st for

    }
}
