
public class _04POSTorder {

    static class NODE{
        int data;
        NODE left;
        NODE right;

        //CONSTRUCTOR
        NODE(int data){
            this.data = data;
            this.right = null;

        }
    }

    //CLASS FOR NODE TRAVERSAL
    static class build{

        //TAKEN STATIC INT TO MAKE IT 0 FOR THE FORST TIME AND THEN INCRESE EVERY TIME VALUE IS CALLED FOR THE NODE TRAVERSAL
        static int index = -1;

        public static NODE BuildTree(int nodes[]){
            index ++;

            //IF THE NODE IS -1 OR NULL
            if(nodes[index]==-1){
                return null;
            }

            //CREATE AN OBJECT OF THE NODE CLASS FOR THE TRAVERSAL
            NODE Newnode = new NODE(nodes[index]);
            // TRAVERSE THE LEFT AND RIGHT SIDE OF THE NODE RECURSIVELY 
            Newnode.left = BuildTree(nodes);
            Newnode.right = BuildTree(nodes);

            return Newnode;
        }

        //WRITE A FUNCTION FOR IN-ORDER TRAVERSAL
        public static void postorder(NODE root){
            //BASE CASE
            if(root== null){
               System.out.print("-1, ");
                return;
            }
            
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ,");
            
        }

    }


    public static void main(String[]args){

        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        //BUILD AN OBJECT FOR THE BUILD CLASS TO CALL THE FUNCTIONS
        build tree = new build();

        // CALL THE BUILDTREE FUNCTION
        //NOTE = IT HAS RETURN TYPE OF NODE
        NODE root = tree.BuildTree(nodes);
        System.out.println(root.data);

        System.out.println("TREE TRAVERSAL");

        //CALL THE INORDER FUNCTION
        tree.postorder(root);

    }
    
}
