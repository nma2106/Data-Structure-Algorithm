public class Practice{

    
    public static void main(String[] args){

        int sum = 67;
        int count =0;
        for(int i = 1;i<30;i++)
        {
            sum = sum+(2);
            count = count+sum;
            System.out.println(i+ " "+sum+" "+count);
            //System.out.println(count);

        }
        //System.out.println(sum);
        System.out.println(count);
        // System.out.println(Math.pow(sum, count));

    }
}