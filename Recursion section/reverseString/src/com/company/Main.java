package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(reverse("Aadarsh"));
    }
    static String reverse(String a){
        if(a.isEmpty()){
            return "";
        }
      return reverse(a.substring(1))+a.charAt(0);
    }
}
