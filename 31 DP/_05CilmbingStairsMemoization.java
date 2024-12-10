// package 31 DP;

public class _05CilmbingStairsMemoization {

    public static int function(int dp[],int n ){

        if(n ==1||n==2){
            return n ;
        }

        if(dp[n]!=0){
            return dp[n];
        }

        dp[n]= function(dp, n-1)+function(dp, n-2);
        return dp[n];
    }


    public static void main(String[] args) {
        int n = 5;
        int dp[] = new int[n+1];
        System.out.println(function(dp,n));
    }
    
}
