package Alogrithm.BinarySearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinarySearchTree {

    public List<TreeNode> bfs(TreeNode head){
        List<TreeNode> result = new ArrayList();
        if (head == null){
            return result;
        }

        Queue<TreeNode> que = new LinkedList();
        que.offer(head);
        while(!que.isEmpty()){
            int size = que.size();
            for (int i = 0; i < size; i++){
                TreeNode node = que.poll();
                result.add(node);
                if (node.left != null){
                    que.offer(node.left);
                }
                if (node.right != null){
                    que.offer(node.right);
                }
            }
        }

        return result;
    }

    public List<TreeNode> preOrderByRecurrsion(TreeNode head){
        return null;
    }

    public List<TreeNode> inOrderByRecurrsion(TreeNode head){
        return null;
    }

    public List<TreeNode> postOrderByRecurrsion(TreeNode head){
        return null;
    }

    public List<TreeNode> preOrderByIteration(TreeNode head){
        return null;
    }

    public List<TreeNode> inOrderByIteration(TreeNode head){
        return null;
    }

    public List<TreeNode> postOrderByIteration(TreeNode head){
        return null;
    }

    public void add(TreeNode head, TreeNode target){

    }

    public void find(TreeNode head, TreeNode target){

    }

    public void delete(TreeNode head, TreeNode target){

    }

}
