

public class _05HeightOfTheTree {

    static class NODE{
        int data;
        NODE left;
        NODE right;

        NODE(int data){
            this.data = data;
            this.left=null;
            this.right=null;
        }
    }

    static class build{
        static int index = -1;

        public static NODE BuildTree(int nodes[]){
            index++;
            if(nodes[index]==-1){
                return null;
            }

            NODE NewNode = new NODE(nodes[index]);
            NewNode.left = BuildTree(nodes);
            NewNode.right = BuildTree(nodes);

            return NewNode;

        }

        public static void height(NODE root){
            
        }
    }


    public static void main(String[]args){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        build tree = new build();
        NODE root = tree.BuildTree(nodes);
        System.out.println(root.data);

        System.out.println("Height of the tree");
        tree.height(root);
    }
    
}
