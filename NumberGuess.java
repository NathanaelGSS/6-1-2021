package com.mycompany.smoothstack_week_one;

import java.util.*;

/**
 *
 * @author Nathanael
 */
public class NumberGuess {

    static Random r = new Random();//Using a Random() for our generator
    static Scanner s = new Scanner(System.in);//Using a scanner fo basic input
    static int num, guess, diff, tries;//Just need the variabes to exist, thy will be given values later

    public static void main(String args[]) {
        num = r.nextInt(100) + 1;//Just needs to be 1 to 100
        System.out.println("Guess the randomly generated number from 1 - 100. Guesses within 10 digits are correct!");
        userInput();
    }

    public static void userInput() {//Simple name that explains exactly what it's for.
        System.out.print("Enter your guess: ");
        tries++;
        while (!s.hasNextInt()) {//Ensures we can't take invalid input (such as letters and special characters).
            s.next();
            System.out.println("Error! You didn't enter a real number!!");//Tell the user what they did wrong.
            System.out.println("Answers must be real ints, no decimals or letters are acceptable.");
            System.out.print("Enter your guess: ");//Repeat the command here so the user knows the system is ready.
        }
        guess = s.nextInt();
        if (numCheck() <= 10 && tries < 5) {//Success state
            System.out.println("Correct! You guessed " + guess + ", the target number was " + num);
        } 
        else if (numCheck() > 10 && tries < 5) {//Failure state
            System.out.println("Incorrect! you have used " + tries + "/5 tries.");//Tell the user how many 'lives' are left.
            userInput();
        }
        if (tries >= 5) {//Total failure
            System.out.println("Sorry! You have exceeded yur guess limit! The target number was " + num);
            System.exit(0);//Close program.
        }
    }

    public static int numCheck() {
        diff = Math.abs(num - guess);//Absolute value checks both greater and less than, for an easy and accurate check.
        return diff;
    }
}
