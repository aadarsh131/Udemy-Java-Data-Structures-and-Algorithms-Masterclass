public class Main {
    //sub-sub-problem
    // print the sum of 2^0+2^1+2^2+ ---- +2^(n-1) using RECURSION ONLY

    public static void main(String[] args) {
        System.out.println(add(5));
    }
    static int add(int n){
        if(n==1){
            return 1;
        }
        return 1+2*(add(n-1));
    }
}
