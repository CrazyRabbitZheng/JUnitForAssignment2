package org.example;

import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciNumbersTest {

    @org.junit.jupiter.api.Test
    @DisplayName("Test if this number is Fibonacci")
    void isFibonacci() {
        assertAll(
                () -> assertEquals(true,FibonacciNumbers.isFibonacci(0)),
                () -> assertEquals(false,FibonacciNumbers.isFibonacci(-3)),
                () -> assertEquals(true,FibonacciNumbers.isFibonacci(55)),
                () -> assertEquals(false,FibonacciNumbers.isFibonacci(145)),
                () -> assertEquals(false,FibonacciNumbers.isFibonacci(232)),
                () -> assertEquals(true,FibonacciNumbers.isFibonacci(233))
        );
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Get the Nth Fibonacci number")
    void getFibonacciNumber() {
        assertAll(
                () -> assertEquals(0,FibonacciNumbers.getFibonacciNumber(1)),
                () -> assertEquals(1,FibonacciNumbers.getFibonacciNumber(3)),
                () -> assertEquals(8,FibonacciNumbers.getFibonacciNumber(7)),
                () -> assertEquals(13,FibonacciNumbers.getFibonacciNumber(8)),
                () -> assertEquals(377,FibonacciNumbers.getFibonacciNumber(15))
        );
    }
}