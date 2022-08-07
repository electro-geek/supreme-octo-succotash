import java.util.*;
public class Demo {
    static class edge{
        int src;
        int nbr;
        int wt;

        Edge(int src, int nbr, int wt){
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int vertices = scn.nextInt();
        ArrayList<Edge> graph = new ArrayList[vertices];
        for(int i = 0; i < graph.size(); i++){
            graph[i] = new ArrayList<>();
        }
        int edges = scn.nextInt();
        for(int i = 0; i < edges; i++){
            int src = scn.nextInt();
            int dest = scn.nextInt();
            int wt = scn.nextInt();
            graph[src].add(src, dest, wt);
            graph[dest].add(dest, src, wt);
        }
    }
}
