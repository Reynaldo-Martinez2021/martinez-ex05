import java.util.Scanner;

public class Solution05 {
    /*
     *  UCF COP3330 Fall 2021 Assignment 05 Solution
     *  Copyright 2021 Reynaldo Martinez
     */
    /*
     * Ask the user for two numbers
     * store input strings in 'tempInputOne' and 'tempInputTwo'
     * Convert the string inputs to int data type
     * Store the inputs are 'numberOne' and 'numberTwo'
     * Calculate sum, difference, product, and quotient and use appropriate variables
     * Use printf for output with \n
     *
     */
    public static void main(String[] args){
        Scanner inputNumber = new Scanner(System.in);
        System.out.print("What is the first number? ");
        String tempInputOne = inputNumber.nextLine();
        int numberOne = Integer.parseInt(tempInputOne);
        System.out.print("What is the second number? ");
        String tempInputTwo = inputNumber.nextLine();
        int numberTwo = Integer.parseInt(tempInputTwo);
        int numberSum = numberOne + numberTwo;
        int numberDifference = numberOne - numberTwo;
        int numberProduct = numberOne * numberTwo;
        int numberQuotient = numberOne / numberTwo;
        System.out.printf("%d + %d = %d\n%d - %d = %d\n%d * %d = %d\n%d / %d = %d",numberOne, numberTwo, numberSum, numberOne, numberTwo,
                numberDifference, numberOne, numberTwo, numberProduct, numberOne, numberTwo, numberQuotient);
    }
}
