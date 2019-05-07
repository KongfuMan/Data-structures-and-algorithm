package DataStructure.UDFStack;


import java.util.LinkedList;
import java.util.Queue;

public class StackByTwoQueues {
    private Queue<Integer> first;
    private Queue<Integer> second;

    public StackByTwoQueues(){
        this.first = new LinkedList<Integer>();
        this.second = new LinkedList<Integer>();
    }

    public void push(int val){
        if(first.isEmpty()){
            second.add(val);
        }else {
            first.add(val);
        }
    }

    public int pop(){
        if (isEmpty()){
            throw new RuntimeException("The queue is empty");
        }
        Queue<Integer> notEmpty = first.isEmpty() ? second : first;
        Queue<Integer> empty = first.isEmpty() ? first:second;
        while(notEmpty.size() > 1){
            empty.add(notEmpty.poll());
        }

        return notEmpty.poll();
    }

    public boolean isEmpty(){
        return first.isEmpty() && second.isEmpty();
    }
}
