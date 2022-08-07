import java.util.*;
public class EvaluationDivision {
    static class Equation{
        String a;
        String b;
        int ratio;
        Equation(String a, String b, int ratio){
            this.a = a;
            this.b = b;
            this.ratio = ratio;
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int vertices = scn.nextInt();
        ArrayList<Equation> graph = new ArrayList[vertices];
        for(int i = 0; i < vertices; i++){
            graph[i] = new ArrayList<>();
        }
        int edges = scn.nextInt();
        for(int i = 0; i < edges; i++){
            String src = scn.next();
            String dest = scn.next();
            int ratio = scn.nextInt();
            graph[src].add(src, dest, ratio);
            graph[dest].add(dest, src, (1/ratio));
        }
        System.out.println(graph);
    }
}
