// package 31 DP;

public class _04ClimbingStairsRec {

    public static int function(int n ){
        if(n ==1||n==2){
            return n ;
        }

        int ways = function(n-1)+function(n-2);
        return ways;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(function(n));
    }
    
}
