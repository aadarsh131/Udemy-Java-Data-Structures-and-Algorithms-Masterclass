package com.company;

public class Main {

    public static void main(String[] args) {
	//successive division algo
        dToB_divAlgo(13);
    }
    static void dToB_divAlgo(int n){
        if(n==0) {
            return;
        }
        else {
            dToB_divAlgo(n / 2);
            System.out.print(n % 2);
        }
    }
}
