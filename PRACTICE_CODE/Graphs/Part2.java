

import java.util.*;
class Part2{
    static class Edge{
        int src,dest,wt;

        public Edge(int s,int d,int w){
            src = s;
            dest = d;
            wt = w;
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
        // graph[3].add(new Edge(3,4,1));
        // graph[3].add(new Edge(3,5,1));

        graph[4].add(new Edge(4,2,1));
        // graph[4].add(new Edge(4,3,1));
        // graph[4].add(new Edge(4,5,1));

        // graph[5].add(new Edge(5,3,1));
        // graph[5].add(new Edge(5,4,1));
        // graph[5].add(new Edge(5,6,1));

        // graph[6].add(new Edge(6,5,1));
    }

    public static boolean isCycleExitsInUndirectedG(ArrayList<Edge> graph[]){
        boolean vis[] = new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!vis[i] && isCycleExitsInUndirectedGraphUtil(graph,vis,i,-1)){
                return true;
            }
        }
        return false;
    }
    public static boolean isCycleExitsInUndirectedGraphUtil(ArrayList<Edge> graph[],boolean vis[], int curr,int par){

        vis[curr] = true;
        System.out.println(curr);

        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);

            if(vis[e.dest] && e.dest != par){
                return true;
            }
            else if(!vis[e.dest] && isCycleExitsInUndirectedGraphUtil(graph,vis,e.dest,e.src)){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        System.out.println(isCycleExitsInUndirectedG(graph));
    }
}