

public class _03Factorial {
    public static int function(int n ){
        //BASE CASE
        if(n ==1){
            return n;
        } 
        int fact = n*function(n-1);
        return fact;

    }
    public static void main(String[]args){
        System.out.println(function(3));
    }
    
}
