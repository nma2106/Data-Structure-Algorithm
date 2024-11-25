import java.util.*;
public class _02BestStockPrice {
    

    public static void function(int n[] ){

        int maxProfit =0;

        for(int i =0;i<n.length;i++){
            System.out.println(n[i]);
        }

        int bp= Integer.MAX_VALUE;
        for(int i =0;i<n.length;i++){
            if(bp<n[i]){
                int profit = n[i]-bp;
                maxProfit = Math.max(maxProfit, profit);


            }
            else{
                bp=n[i];
            }
        }
        System.out.println("//////////////////////");

        System.out.println(maxProfit);


    }

    public static void main(String[] args) {
        int n[]= {7,1,5,3,6,4};
        function(n);
    }
}
