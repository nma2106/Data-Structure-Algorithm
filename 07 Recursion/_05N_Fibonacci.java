


public class _05N_Fibonacci {
    public static int function(int n){
        //BASE CASE
        if(n==1 || n ==0){
            return n;
        } 
        int count = function(n-1) + function(n-2);
        return count;

    }
    public static void main(String[]args){
        System.out.println(function(6));

    }
    
}

