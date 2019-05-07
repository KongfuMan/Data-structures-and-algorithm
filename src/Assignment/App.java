package Assignment;

import java.util.List;

public class App {
    public static void main(String[] args){
//        Stack stack = new Stack();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        stack.push(5);
//
//        for (int i = 0; i < 5; i++){
//            System.out.println(stack.pop());
//        }
//
//        Queue que = new Queue();
//        que.push(1);
//        que.push(2);
//        que.push(3);
//        que.push(4);
//        que.push(5);
//
//        for (int i = 0; i < 5; i++){
//            System.out.println(que.pop());
//        }

        NQueens nq = new NQueens();
        List<List<Integer>> res = nq.nqueen(4);
        int i = 0;
    }
}
