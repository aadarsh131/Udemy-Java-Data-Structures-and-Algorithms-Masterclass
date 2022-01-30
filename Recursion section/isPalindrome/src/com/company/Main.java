package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome("nitin")); //case-sensitive
//        String a = "nn";
//        System.out.println(a.substring(1,a.length()));
    }
    static boolean isPalindrome(String str) {
        if(str.length()==1 || str.isEmpty()){
            return true;
        }
        if(str.charAt(0) == str.charAt(str.length()-1)){
             return isPalindrome(str.substring(1,str.length()-1));
        }
        else {
            return false;
        }
    }
}
