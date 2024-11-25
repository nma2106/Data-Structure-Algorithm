import java.util.*;
public class _01CreateGraph{

     static class edge{
        int src;
        int dest;
        int weight;

        //CONSTRUCTOR
        public edge(int src,int dest,int weight){
            this.src=src;
            this.dest=dest;
            this.weight=weight;
        }
     }


    public static void main(String[] args) {

        //NUMBER OF VERTECES
        int v = 5;

        //SIZE OF THE ARRAY of the class EDGE  that we created SHOULD BE EQUAL TO MMY ARRAY
        ArrayList<edge>[] graph = new ArrayList[v];
        //WHEN WE CREATE THIS , IT WILL HAVE A NULL LIST 

        for(int i =0; i<v;i++)
        {
            graph[i]=new ArrayList<>();
        }
        //this is to store the edgea and its properties in the array list 

        // 0 vertex

        graph[0].add(new edge(0, 1, 5));

        //1 vertex

        graph[1].add(new edge(1, 0, 5));
        graph[1].add(new edge(1, 2, 1));

        graph[1].add(new edge(1, 3, 3));

        //2 vertex

        graph[2].add(new edge(2, 1, 1));
        graph[2].add(new edge(2, 3, 1));
        graph[2].add(new edge(2, 4, 2));

        // 3 vertex 

        graph[3].add(new edge(3, 2, 1));
        graph[3].add(new edge(3, 1, 3));

        //4 vertex
        graph[4].add(new edge(4, 2, 2));

        //PRINT NEIGHBOUR NODE OF 2

        for(int i = 0 ;i<graph[2].size();i++){
            edge e = graph[2].get(i);
            System.out.println(e.dest);

        }






        
        
    }
}