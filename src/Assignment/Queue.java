package Assignment;

import java.util.LinkedList;

// implement a queue by a LinkedList
public class Queue {
    private LinkedList<Integer> que;

    public Queue(){
        this.que = new LinkedList<Integer>();
    }

    public void push(int n){
        que.addLast(n);
    }

    public int pop(){
        if (que.isEmpty()){
            System.out.println("The queue is empty");
            return -1;
        }
        int res = que.getFirst();
        que.removeFirst();
        return  res;
    }
}
