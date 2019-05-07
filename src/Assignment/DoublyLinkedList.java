package Assignment;

public class DoublyLinkedList{
    private int n;
    private ListNode head;
    private ListNode tail;

    class ListNode {
        public int val;
        public ListNode prev;
        public ListNode next;

        public void ListNode(int val){
            this.val = val;
            this.prev = null;
            this.prev = null;
        }
    }


    public void insertHead(ListNode node){
        if (head != null){
            node.next = head;
            head.prev = node;

        }
        head = node;
        n++;
    }

    public void insertTail(ListNode node){
        if (tail == null){
            if (head == null){

            }

        }
    }
}
