import java.util.*;
public class _1_Linear_Search {
    public static void function(int array[],int key)
    {
        boolean found = false;
        for(int i =0;i<array.length;i++)
        {
            if(array[i]==key)
            {
                System.out.println(i);
                found =true;
            }
            
            
        }
        if(found==false)
        {
            System.out.println("-1");
        }
    }
    public static void main(String[]args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int key = sc.nextInt();
        int array[] =  new int[n];
        for(int i =0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        function(array,key);

    }
}
