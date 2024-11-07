import java.util.*;

public class _02IncresinngOrder {
    public static void function(int n){

        //BASE CASE
        if(n ==1){
            System.out.println(n);
            return;
        }
        function(n-1);
        System.out.println(n);

    }
    public static  void main(String[]args){

        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
        function(n);

    }
    
}
