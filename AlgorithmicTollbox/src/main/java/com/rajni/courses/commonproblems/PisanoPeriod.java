package com.rajni.courses.commonproblems;

public class PisanoPeriod {

    public static void main(String[] args) {
        System.out.println(fibonacciMod(2816213588L, 239));
        System.out.println(fibonacciMod(28162138L, 1000));
    }

    static int calculatePisanoSequenceLength(int m) {
        int firstSeqNum = 0;
        int secondSeqNum = 1;

        int index = 0;
        while (true) {
            if(index != 0 && firstSeqNum == 0 && secondSeqNum == 1) {
                break;
            } else {
                int temp = firstSeqNum % m;
                firstSeqNum = secondSeqNum % m;
                secondSeqNum = temp + firstSeqNum;
                if(secondSeqNum >= m) {
                    secondSeqNum = secondSeqNum % m;
                }
                index++;
            }
        }
        return index;
    }

    static long fibonacciMod(long number, int mod) {
        int modulo = calculatePisanoSequenceLength(mod);

       long finalNumber = number % modulo;
       if(finalNumber <= 1) {
           return finalNumber;
       } else {
           long previousNumber = 0;
           long current = 1;
            for (int i = 0 ; i < finalNumber - 1 ; i++) {
                long temp = previousNumber % mod;
                previousNumber = current % mod;
                current = temp + current;
                if(current >= mod) {
                    current = current % mod;
                }
            }
            return current;
       }
    }

}
