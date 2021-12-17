package com.rajni.courses.commonproblems;

public class LCM {

    public static void main(String[] args) {
        System.out.println(lcm(761457L, 614573L));
        System.out.println(lcm(761457433, 614579998));
    }

    static long lcm(long a, long b) {
        return (a * b)/euclidGCD(a, b);
    }

    static long euclidGCD(long a, long b) {
        if(b == 0) {
            return a;
        } else {
            long remainder = a%b;
            return euclidGCD(b, remainder);
        }
    }
}
