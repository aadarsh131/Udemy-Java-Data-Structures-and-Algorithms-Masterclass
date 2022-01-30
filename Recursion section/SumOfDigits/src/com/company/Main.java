package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumOfdigits(3214));
    }
    static int sumOfdigits(int n){
        if(n<0){
            return -1;
        }
        if(n<=9){
            return n;
        }
        return sumOfdigits(n/10) + n%10;
    }
}
