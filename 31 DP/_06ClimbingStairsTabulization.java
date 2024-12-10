// package 31 DP;

public class _06ClimbingStairsTabulization {

    public static int function(int n ){
        // In tabulization we initalize the known values instead of a base case;

        int dp[] = new int[n+1];
        dp[1]=1;
        dp[2]=2;
        for(int i = 3;i<n+1;i++){
            dp[i]= dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n =5;
        System.out.println(function(n));
    }
    
}
