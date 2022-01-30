package com.company;

public class Main {

    public static void main(String[] args) {
//        using Euclidean Algorithm
//        i.e,
//                gcd(a,0) = a
//            and,gcd(a,b) = gcd(b, a mod b)

        System.out.println(gcd(8,4));
    }
    static int gcd(int a, int b){
        if(a<0 || b< 0){
            return -1;
        }
        if(b == 0){
            return a;
        }
        return gcd(b,a%b);
    }
}
