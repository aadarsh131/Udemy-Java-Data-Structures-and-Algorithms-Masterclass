public class Main{
    //HACKERRANK-Java-Introduction-java loops II problem
    //print the series :
    // (a+2^0*b), (a+2^0*b+2^1*b), ---------,(a+2^0*b+2^1*b+----+2^(n-1)*b)
    static int a=0,b=2,n=10;
    public static void main(String[] args) {
        reduceNvalue(n);
    }


    static void reduceNvalue(double n){
        if(n<=0){
            return;
        }
        reduceNvalue(n-1);
        System.out.print((int)add(n)+a+" ");
    }


    static double add(double n){
        if(n==1){
            return b;
        }
        else{
            return b+2*(add(n-1));
        }
    }
}
