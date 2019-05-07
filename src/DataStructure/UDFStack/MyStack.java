package DataStructure.UDFStack;

import DataStructure.ListNode;

//use singly linkedlist to implement stack
//
public class MyStack {
    private ListNode head = null;
    private int size = 0;

    public void push(ListNode node){
        if (node == null){
            throw new RuntimeException("Input Node should not be null");
        }
        node.next = head;
        head = node;
        size++;
    }

    public ListNode pop(){
        if (size == 0){
            return null;
        }
        ListNode node = head;
        head = head.next;
        node.next = null; //node的next必须置为空
        size--;
        return node;
    }
}
