package Alogrithm.DynamicProgramming;

public class Fibonacci {

    public static void main(String[] argvs){
        System.out.print(memoization(89));
    }

    public static int bruteForce(int n){
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        return bruteForce(n-1) + bruteForce(n-2);
    }

    // f[n] = f[n-1] + f[n-2]
    // f[0] = 0;
    // f[1] = 1;
    public static long memoization(int n){
        long[] mem = new long[2];
        mem[0] = 0;
        mem[1] = 1;

        for (int i = 2; i <= n; i++){
            mem[i % 2] = mem[0] + mem[1];
        }

        return mem[n % 2];
    }
}
