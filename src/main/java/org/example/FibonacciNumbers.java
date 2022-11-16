package org.example;

import java.util.Scanner;

/**
 * <pre>
 *     {@code
 *     The Fibonacci numbers are like
 *   the third number is the sum of the previous two numbers
 *   F_0 + F_1 = F_2
 *   starts from 0 and 1, goes like 0,1,1,2,3,5,8,...
 *  }
 * </pre>
 *
 * @author - Stu.ID: 20085058
 */
public class FibonacciNumbers {

    public FibonacciNumbers() {
    }

    /**
     * take in an integer from user
     * check if it is a Fibonacci number
     *
     * @param number integer to check
     * @return turn if the number is Fibonacci number.
     */
    public static boolean isFibonacci(int number) {


        if (number == 0 || number == 1)
            return true;
        if (number < 0)
            return false;

        else {
            int fibonacciN_1 = 0;
            int fibonacciN_2 = 1;
            int fibonacciN_3 = 0;
            while (fibonacciN_3 < number + 1) {
                fibonacciN_3 = fibonacciN_2 + fibonacciN_1;
                if (fibonacciN_3 == number)
                    return true;
                if (fibonacciN_3 > number)
                    return false;
                fibonacciN_1 = fibonacciN_2;
                fibonacciN_2 = fibonacciN_3;
            }

            return (fibonacciN_2 == number);
        }
    }

    /**
     * get the nth number in a Fibonacci sequence
     *
     * @param n the position in the Fibonacci sequence
     * @return the value of the nth Fibonacci number
     */
    public static int getFibonacciNumber(int n) {
        int counter = 0;
        int fibonacciN_1 = 0;
        int fibonacciN_2 = 1;
        int fibonacciN_3 = 0;

        if (n > 0) {
            if (n == 1)
                System.out.println("The 1st Fibonacci number is 0");
            else if (n == 2)
                System.out.println("The 2nd Fibonacci number is 1");
            else if (n > 2) {
                while (counter < n - 2) {

                    fibonacciN_3 = fibonacciN_2 + fibonacciN_1;
                    fibonacciN_1 = fibonacciN_2;
                    fibonacciN_2 = fibonacciN_3;

                    counter++;

                }
                System.out.printf("\nThe %dth Fibonacci number is: %d ", n, fibonacciN_3);
            }
        } else {
            System.out.println("Please try again and enter a positive integer.");
        }

        return fibonacciN_3;
    }
}



