package Assignment;

import java.util.ArrayList;
import java.util.List;

public class NQueens {
    public static void main(String[] args){
        List<List<Integer>> res1 = nqueen(3);
        drawChessboard(res1.get(0));
        drawChessboard(res1.get(1));

        List<List<Integer>> res2 = nqueen(7);
        drawChessboard(res2.get(0));
        drawChessboard(res2.get(1));
    }

    public static List<List<Integer>> nqueen(int n){
        List<List<Integer>> res = new ArrayList();
        if (n == 0){
            return res;
        }
        nqueenHelper(res, new ArrayList<Integer>(), n);
        return res;
    }


    private static void nqueenHelper(List<List<Integer>> res,
                              List<Integer> visted,
                              int n){
        if (visted.size() == n){
            res.add(new ArrayList<Integer>(visted));
            return;
        }

        for (int i = 0; i < n; i++){
//            if (!isValid(visted,i)){
//                continue;
//            }
            visted.add(i);
            nqueenHelper(res, visted, n);
            visted.remove(visted.size()-1);
        }
    }

    private static boolean isValid(List<Integer> visited, int pos){
        int row = visited.size();
        for (int i = 0; i < visited.size(); i++){
            if (pos == visited.get(i)){
                return  false;
            }

            if (i + visited.get(i) == row + pos){
                return  false;
            }

            if (i - visited.get(i) == row - pos){
                return  false;
            }
        }

        return true;
    }

    private static void drawChessboard(List<Integer> cols) {
        List<String> chessboard = new ArrayList();
        for (int i = 0; i < cols.size(); i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < cols.size(); j++) {
                sb.append(j == cols.get(i) ? 'Q' : '.');
            }
            System.out.println(sb.toString());
        }
        System.out.println(" ");
    }
}
