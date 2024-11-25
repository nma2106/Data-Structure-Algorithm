import java.util.*;

public class _01TillingProblem {

    public static int function(int n ){

        if(n ==0 || n==1){
            return 1;
        }

        int h = function(n-1);

        int v = function(n-2);

        int totalWays = h+v;
        return totalWays;


    }

    public static void main(String[] args) {
        
        int n = 3;
        System.out.println(function(n));
    }
    
}
