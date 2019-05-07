package Assignment;

import java.util.LinkedList;

// implement a stack by a Linkedlist
public class Stack {
    private LinkedList<Integer> stack;

    public Stack(){
        this.stack = new LinkedList<Integer>();
    }

    public int pop() {
        if (stack.isEmpty()){
            System.out.println("The Stack is empty");
            return -1;
        }
        int res = stack.getLast();
        stack.removeLast();
        return res;
    }

    public void push(int val) {
        stack.addLast(val);
    }


}
