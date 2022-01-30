package com.company;

public class Main {


    public static void main(String[] args) {
        Recursion.recursion(5);
	firstMethod();
        System.out.println("I am the main method");
    }

    public static void firstMethod(){
        secondMethod();
        System.out.println("I am the the first method");
    }

    public static  void secondMethod(){
        thirdMethod();
        System.out.println("I am the second method");
    }

    public static void thirdMethod(){
        System.out.println("I am the third method");
    }
}

class Recursion{
    private static int i = 0;
        public static void recursion(int n){
            if(n<1){
                System.out.println("n is less than 1");
            }else{
                recursion(n-1);
                i++;
                System.out.println("calling same function: "+i+" time, "+"value of n is:"+n);
            }
        }
    }

