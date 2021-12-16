package com.rajni.courses.commonproblems;

public class FibonacciSequence {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        long fibonacciResultRecursive = fibonacciRecursive(50);
        long endTime = System.currentTimeMillis();
        long fibonacciResultList = fibonacciList(50);
        long endTime2 = System.currentTimeMillis();
        System.out.println("Program has finished executing..");
        System.out.println("Time taken by first approach : "+(endTime - startTime) +" MS");
        System.out.println("Time taken by second approach : "+(endTime2 - endTime) +" MS");

        System.out.println(fibonacciResultList);
        System.out.println(fibonacciResultRecursive);
    }

    public static long fibonacciList(int n) {
        long[] array = new long[n + 1];
        array[0] = 0L;
        array[1] = 1L;

        for (int i = 2; i <= n; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }

        return array[n];
    }

    public static long fibonacciRecursive(long n) {
        if(n <= 1) {
            return n;
        } else {
            return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
        }
    }
}
