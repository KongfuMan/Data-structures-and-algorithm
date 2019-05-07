package Alogrithm.DynamicProgramming;

//brute-force O(2^(n-1)), becuase there are 2^(n-1) different ways to cut
//
public class RodCutting {
    int[][] pricemat;

    public RodCutting(int[][] pricemat){
        this.pricemat = pricemat;
    }

//  r[i] denotes the max profit from the first i inch rope
//  r[i] = max{r[j] + price[i-j]}
//  r[0] = 0
//  r[n]
    public int cut(int len){
        if(pricemat == null){
            return 0;
        }

        int[] r = new int[len];

        return 0;
    }
}
