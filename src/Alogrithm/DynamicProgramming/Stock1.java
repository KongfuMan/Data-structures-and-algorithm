package Alogrithm.DynamicProgramming;

public class Stock1 {
    public static void main(String[] argvs){

    }

    public int maxProfit(int[] prices){
        if (prices == null || prices.length == 0){
            return 0;
        }
        int max = 0;
        for (int i = 0; i < prices.length - 1; i++){
            for( int j = i + 1; j < prices.length; j++){
                max = Math.max(max, prices[j] - prices[i]);
            }
        }

        return max;
    }
}
