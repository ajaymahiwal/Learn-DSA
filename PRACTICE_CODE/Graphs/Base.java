
import java.util.*;
class Base{

    static class Edge{
        int src,dest,wt;

        public Edge(int src,int dest,int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));

        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,3,1));

        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,4,1));

        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,4,1));
        graph[3].add(new Edge(3,5,1));

        graph[4].add(new Edge(4,2,1));
        graph[4].add(new Edge(4,3,1));
        graph[4].add(new Edge(4,5,1));

        graph[5].add(new Edge(5,3,1));
        graph[5].add(new Edge(5,4,1));
        graph[5].add(new Edge(5,6,1));

        graph[6].add(new Edge(6,5,1));
    }

    public static void bfs(ArrayList<Edge> graph[]){
        Queue<Integer> q = new LinkedList<>();
        boolean visit[] = new boolean[graph.length];

        // Starting vertex
        q.add(0);

        while(!q.isEmpty()){
            int curr = q.remove();
            // if(!visit[curr]){
                visit[curr] = true;
                System.out.print(curr+" ");
                
                for(int i=0;i<graph[curr].size();i++){
                    Edge e = graph[curr].get(i);
                    // q.add(e.dest); //old approach

                    //New code
                    if(!visit[e.dest]){
                        q.add(e.dest);
                    }
                }
            // }
        }
    }

    public static void dfs(ArrayList<Edge> graph[],boolean vis[],int curr){
       
       System.out.print(curr+" ");
       vis[curr] = true;

       for(Edge e : graph[curr]){
            if(!vis[e.dest]){
                dfs(graph,vis,e.dest);
            }
       }
    }
    public static void main(String args[]){

        int V = 7;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        //Neighbours of vertex 5
        for(int i=0;i<graph[5].size();i++){ 
            Edge e = graph[5].get(i);

            System.out.println(e.dest); 
        }

        System.out.println();

        bfs(graph);
        System.out.println();
        System.out.println();

        dfs(graph,new boolean[V],0);
    }
}