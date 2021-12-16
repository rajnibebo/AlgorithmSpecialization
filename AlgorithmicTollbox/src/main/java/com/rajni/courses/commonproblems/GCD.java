package com.rajni.courses.commonproblems;

public class GCD {
    public static void main(String[] args) {
        System.out.println(euclidGCD(357, 234));
        System.out.println(euclidGCD(234, 357));
    }
    static long euclidGCD(long a, long b) {
        if(b == 0) {
            return a;
        } else {
            long remainder = a%b;
            System.out.println("Remainder: "+remainder);
            return euclidGCD(b, remainder);
        }
    }
}
