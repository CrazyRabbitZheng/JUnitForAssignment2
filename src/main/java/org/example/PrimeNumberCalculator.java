package org.example;

import java.util.Scanner;

/**
 * a class to check if a number is prime
 * and to factor the number to its unique prime factor string
 *
 * @author - Stu.ID: 20085058
 */
public class PrimeNumberCalculator {
    /**
     * a user input a positive number
     * check if that number is prime
     *
     * @param number the number input to check if it is prime
     * @return turn if the number is prime
     */
    public static boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }
        if (number == 2 || number == 3) {
            return true;
        }
        if (number > 2) {
            for (int i = 2; i <= Math.pow(number, 0.5); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * if a number is NOT prime
     * get its unique prime factors as a string
     * in the form number1*number2*number3...
     *
     * @param number
     * @return a string of prime factors
     */
    public static String getUniquePrimeFactorization(int number) {
        String uniquePrimeFactorization = "";
        if (number == 1 || number < 0) {
            return "The number you entered does not have unique prime factor.";
        }
        if (isPrime(number)) {
            return "" + number;
        } else {
            int i = 2;
            while (i < number) {
                if (number % i == 0) {
                    uniquePrimeFactorization += i;
                    uniquePrimeFactorization += ",";
                    number = number / i;
                    if (isPrime(number)) {
                        uniquePrimeFactorization += number;
                        uniquePrimeFactorization += ",";
                        return uniquePrimeFactorization;
                    }
                } else {
                    i = i + 1;
                }
            }
        }

        return uniquePrimeFactorization;
    }
}
