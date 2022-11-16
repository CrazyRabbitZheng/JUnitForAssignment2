package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberCalculatorTest {

    @Test
    @DisplayName("Test if the number is prime")
    void isPrime() {
        assertAll(
                ()->assertEquals(false,PrimeNumberCalculator.isPrime(-1)),
                ()->assertEquals(false,PrimeNumberCalculator.isPrime(0)),
                ()->assertEquals(false,PrimeNumberCalculator.isPrime(1)),
                ()->assertEquals(true,PrimeNumberCalculator.isPrime(2)),
                ()->assertEquals(true,PrimeNumberCalculator.isPrime(3)),
                ()->assertEquals(false,PrimeNumberCalculator.isPrime(4)),
                ()->assertEquals(true,PrimeNumberCalculator.isPrime(5)),
                ()->assertEquals(false,PrimeNumberCalculator.isPrime(6)),
                ()->assertEquals(true,PrimeNumberCalculator.isPrime(7))
        );
    }

    @Test
    @DisplayName("Get the unique prime factor")
    void getUniquePrimeFactorization() {
        assertAll(
                ()->assertEquals("2",PrimeNumberCalculator.getUniquePrimeFactorization(2)),
                ()->assertEquals("11",PrimeNumberCalculator.getUniquePrimeFactorization(11)),
                ()->assertEquals("2,2,2,11,",PrimeNumberCalculator.getUniquePrimeFactorization(88)),
                ()->assertEquals("2,2,2,17,",PrimeNumberCalculator.getUniquePrimeFactorization(136)),
                ()->assertEquals("2,2,89,",PrimeNumberCalculator.getUniquePrimeFactorization(356))
                );
    }
}