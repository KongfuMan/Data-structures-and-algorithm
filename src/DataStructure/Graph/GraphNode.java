package DataStructure.Graph;

import java.util.List;


// LinkedList Representation
public class GraphNode {
    int label;  //the number or label of current node
    List<GraphNode> neighbors;

    public GraphNode(int label, List<GraphNode> neighbors){
        this.label = label;
        this.neighbors = neighbors;
    }
}
