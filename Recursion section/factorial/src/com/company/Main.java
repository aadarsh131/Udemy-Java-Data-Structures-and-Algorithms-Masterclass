package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(factorial(3));
    }
    static int factorial(int n){
        if(n<1){
            return -1;
        }
        if(n==1){
            return 1;
        }
//        System.out.println("hi");
        int var = n * factorial(n-1);
        return var;
    }
}
