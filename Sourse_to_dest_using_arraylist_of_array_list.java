
import java.io.*;
import java.util.*;
import java.util.Vector;
class Graph{
    static int V;
    public static ArrayList<ArrayList<Integer>> adj;
    public Graph(int v){
        this.V=v;
        adj=new ArrayList<>();
        for(int i=0;i<v;i++){
            adj.add(i,new ArrayList<>());
        }
    }
    public void addEdge(int u,int v){
        adj.get(u).add(v);
    }
    public static void print_all_paths(int s,int d){
        boolean[] visited=new boolean[V];
        ArrayList<Integer> pathList = new ArrayList<>();
        pathList.add(s);
        print_all_paths_util(s,d,visited,pathList);
    }
    public static void print_all_paths_util(int s, int d, boolean[] visited, ArrayList<Integer> pathList) {
        visited[s]=true;
        if(s==d){
            System.out.println(pathList);
            visited[s]=false;
            return;
        }
        for(Integer i:adj.get(s)){
            if(!visited[i]){
                pathList.add(i);
                print_all_paths_util(i,d,visited,pathList);
                pathList.remove(i);
            }
            visited[s]=false;
        }
    }
}
public class Main{
    public static void main(String[] args){
        Graph g= new Graph(4);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(0,3);
        g.addEdge(2,0);
        g.addEdge(2,1);
        g.addEdge(1,3);
        int s = 2;
        int d = 3;

        System.out.println("Following are all different paths from "+s+" to "+d);
        g.print_all_paths(s,d);
    }
        }
