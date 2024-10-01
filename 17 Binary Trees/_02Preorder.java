

public class _02Preorder {

    static class NODE{
        int data;
        NODE left;
        NODE right;

        //CONSTRUCTOR
        NODE(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class build{
        static int index =-1;

        public static NODE BuildTree(int nodes[]){

            index++;
            if(nodes[index]==-1){
                return null;
            }

            //CREATE AN OBJECT OF NODE CLASS TO GET TO THE NODES AND TRAVERSE

            NODE Newnode = new NODE(nodes[index]);

            //RECURSIVELY CALLING THE FUNCTION TO GO TO THE LEFT AND IGHT SIDE OF THE ROOT NODE
            Newnode.left = BuildTree(nodes);
            Newnode.right = BuildTree(nodes);
            return Newnode;

        }


        //NOW TO CALL THE PREORDER TRAVERSAL WE NEED TO PRINT THE TREE
        public static void preorder(NODE root){
            //BASE CASE 
            if(root == null){
                System.out.print("-1, ");
                return;
            }

            System.out.print(root.data+", ");
            preorder(root.left);
            preorder(root.right);




        }
    }

    public static void main(String[]args)
    {
        int  nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        //MAKE AN OBJECT FOR THE build class to call the function

        build tree = new build();

        //CALLING THE BuildTree functio =n and noting that this function has a return tyoe of NODE
        NODE root = tree.BuildTree(nodes);
        System.out.println(root.data);

        System.out.println("PREORDER TRAVERSAL IS");

        tree.preorder(root);
    }
    
}
