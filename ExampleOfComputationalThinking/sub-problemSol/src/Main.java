public class Main {
    //sub-problem
    //print the series:  2^0, 2^0+2^1, 2^0+2^1+2^2, ------, 2^0+2^1+---+2^(n-1) using RECURSION ONLY
    public static void main(String[] args) {
        reduceNvalue(5);
    }


    static void reduceNvalue(double n){
        if(n<=0){
            return;
        }
        reduceNvalue(n-1);
        System.out.print((int)add(n)+" ");
    }


    static double add(double n){
        if(n==1){
            return 1;
        }
        else{
            return 1+2*(add(n-1));
        }
    }
}
