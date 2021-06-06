/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jacob DeBerry
 */
package oop.exercises;
import java.util.Scanner;

public class PasswordValidation
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        final String secret = "abc$123";

        System.out.print("What is the password? ");
        String password = in.nextLine();

        if(password.equals(secret))
        {
            System.out.println("Welcome!");
        }
        else
        {
            System.out.println("I don't know you.");
        }
    }
}
