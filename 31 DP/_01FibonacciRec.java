// package 31 DP;

public class _01FibonacciRec {

    public static int function(int n){
        //BASE CASE
        if(n ==0|| n ==1){
            return n;
        }

        int fib = function(n-1)+function(n-2);
        return fib;
    }


    public static void main(String[] args) {
        int n =7;
        System.out.println(function(n));
    }
    
}
