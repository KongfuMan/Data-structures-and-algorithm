package DataStructure.Graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Search {
    public static List<Integer> DFS(GraphNode root){
        List<Integer> result = new ArrayList<Integer>();
        DFSImpl(root, new HashSet<Integer>(),result);
        return result;
    }


    private static void DFSImpl(GraphNode root,
                                HashSet<Integer> visited,
                                List<Integer> result){

        if (root == null){
            return;
        }

        result.add(root.label);
        visited.add(root.label);
        for (GraphNode neighbor: root.neighbors){
            if (visited.contains(neighbor.label)){
                continue;
            }

            DFSImpl(neighbor,visited,result);
        }

    }

    //    iteration
//    public static List<Integer> BFS(GraphNode root){
//        List<Integer>
//    }

}
