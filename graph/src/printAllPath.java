import java.util.*;
import java.io.*;

public class printAllPath {

   static class Edge{
       int src ;
       int nbr ;
       int wt;

       Edge(int src ,int nbr , int wt){
           this.src = src ;
           this.nbr = nbr;
           this.wt= wt;
       }
   }

    public static void main(String[] args) throws Exception {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


       int vtces =  Integer.parseInt(br.readLine());
       ArrayList<Edge>[] graph = new ArrayList[vtces];
       for(int i = 0 ; i < vtces ; i++){
           graph[i] = new ArrayList<>();
       }

       int edges = Integer.parseInt(br.readLine());
       for(int i =0 ; i < edges ;i++){
           String[] parts = br.readLine().split(" ");

           int v1 = Integer.parseInt(parts[0]);
           int v2 = Integer.parseInt(parts[1]);
           int wt = Integer.parseInt(parts[2]);
           graph[v1].add(new Edge(v1 , v2 , wt));
           graph[v2].add(new Edge(v2 , v1 , wt));
       }

       int src = Integer.parseInt(br.readLine());
       int dest = Integer.parseInt(br.readLine());

       boolean[]visited = new boolean[vtces];
       printAllPath1(graph , src , dest , visited ,src+"" );
    }

    public static void printAllPath1(ArrayList<Edge>[] graph , int src , int dest , boolean[]visited , String psf){


       if(src == dest){
           System.out.println(psf);
           return;
       }

       visited[src] = true;

       for(int i = 0 ; i < graph[src].size() ; i++){
           Edge edge = graph[src].get(i);
           int nbr = edge.nbr;

           if(visited[nbr] == false){
               printAllPath1(graph , nbr, dest ,visited , psf+ nbr +"");
           }

       }
       visited[src] = false;
    }

}
