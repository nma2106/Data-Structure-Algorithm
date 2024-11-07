import java.util.*;
public class _01DecreasingOrder{

    public static void  function(int n){

        //BAE CASE  
        if(n ==1){
            System.out.println(n);
            return;
        }

        System.out.println(n);
        function(n-1);

    }
    public static  void main(String[]args){

        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        function(n);
    }
}