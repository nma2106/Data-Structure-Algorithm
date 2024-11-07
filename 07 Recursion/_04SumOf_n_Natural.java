

public class _04SumOf_n_Natural {
    public static int function(int n){
        //BASE CASE
        if(n==1){
            return n;
        } 
        int count = n + function(n-1);
        return count;

    }
    public static void main(String[]args){
        System.out.println(function(4));

    }
    
}
