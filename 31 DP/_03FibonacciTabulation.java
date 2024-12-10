// package 31 DP;

public class _03FibonacciTabulation {

    public static int function(int n ){

        int dp[]= new int[n+1];

        // WE INITIALIZE INSTEAD OF HAVING A BASE CASE

        dp[0]=0;
        dp[1]=1;
        for(int i =2; i<n+1;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];

    }


    public static void main(String[] args) {
        int n = 7;
        System.out.println(function(n));
    }
    
}
