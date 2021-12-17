package com.rajni.courses.commonproblems;

public class FibonacciSequence {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        long fibonacciResultRecursive = fibonacciRecursive(7);
        long endTime = System.currentTimeMillis();
        long fibonacciResultList = fibonacciList(7);
        long endTime2 = System.currentTimeMillis();
        System.out.println("Program has finished executing..");
        System.out.println("Time taken by first approach : "+(endTime - startTime) +" MS");
        System.out.println("Time taken by second approach : "+(endTime2 - endTime) +" MS");

        System.out.println(fibonacciResultList);
        System.out.println(fibonacciResultRecursive);

        System.out.println("last Digit : "+findLastDigitOfFibonacci(3));
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

    public static int findLastDigitOfFibonacci(int n) {
        int[] array = new int[n + 1];

        array[0] = 0;
        array[1] = 1;

        for (int i = 2; i <=n ;i++) {
            array[i] = array[i-1] % 10 + array[i-2] % 10;
        }

        return array[n] % 10;
    }
}
