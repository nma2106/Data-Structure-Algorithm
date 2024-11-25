import java.util.*;

public class _03Friends {

    public static int function(int n){
            
        if(n ==1||n==2){
            return n;
        }

        int single = function(n-1);
        int pair = (n-1)*function(n-2);
        int ways = single+pair;
        return ways;
    }
    


    public static void main(String[] args) {
        System.err.println(function(3));
    }
}
