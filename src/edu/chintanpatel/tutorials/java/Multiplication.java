package edu.chintanpatel.tutorials.java;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int firstNumber = input.nextInt();

        System.out.print("Enter second number : ");
        int secondNumber = input.nextInt();

        int multiply = firstNumber * secondNumber;
        System.out.println("Multiplication of  " + firstNumber + " and " + secondNumber + " are " + multiply);
    }
}
