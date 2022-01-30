package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(power( 5,9));
        System.out.println(Math.pow(5,9));
    }
    static int power(int x, int n){
        if(n<0 || x<0){
            return -1;
        }
        if(n==1){
            return x;
        }
        return x * power(x, n-1);
    }
}
