import java.util.*;


public class BuildTree {

    //BUILD A NODE CLASS
    static class NODE{
        int data;
        NODE left;
        NODE right;

        // BUILD CCONSTRUCTOR TO CALL THE NODE  
        NODE(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // BUILD A NODE CLASS BUILD WHICH WIL BE USED FOR FURTHER NODES TRAVERSAL
    static class Build{
        // take index which will be used for traversal
        static int index = -1;
        public static NODE BuildTree(int nodes[]){
            index++;

            if(nodes[index]==-1){
                return null;
            }

            NODE Newnode = new NODE(nodes[index]);
            //CALL THIS FUNCTION RECURSIVELY 
            Newnode.left = BuildTree(nodes);
            Newnode.right = BuildTree(nodes);

            return Newnode ;

        }
    } 
    public static void main(String[]args)
    {
        System.out.println("hello");

        int  nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        Build tree = new Build();
        
        NODE root = tree.BuildTree(nodes);

        System.out.println(root.data);
    }
    
}
