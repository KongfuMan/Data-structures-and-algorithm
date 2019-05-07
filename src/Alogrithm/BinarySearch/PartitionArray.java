package Alogrithm.BinarySearch;

public class PartitionArray {
    public static int partitionArrayIntoTwo(int[] A, int k){
        int lo = 0, hi = A.length - 1;
        while(lo < hi){
            if (A[lo] <= k){
                lo++;
            }else if (A[hi] > k){
                hi--;
            }else{
                swap(A, lo, hi);
                lo++;
                hi--;
            }
        }
        return lo;
    }

    private static void swap(int[] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public static int partitionArrayIntoThree(int[] A, int lo, int hi){
        int left = 0, right = A.length - 1;
        int i = left;
        while (i < right){
            if (A[i] < lo){
                swap(A, i, left);
                left++;
                i++;
                //这里不需要i--, 因为i是从left开始判断的，说明
            }else if (A[i] > hi){
                swap(A,i,right);
                right--;
//                i--;    // 需要再次判断刚才的A[hi], 不然这个值会被漏掉
            }else{
                i++;
            }
        }
        return right;
    }

    public static void main(String[] args) {
        int[] A = {9,8,7,6,6,5,67,7,8,8,7,8,9,1,2,3,4,5,3,45,5,6,7,7};
        int lo = partitionArrayIntoTwo(A, 5);
        System.out.println(lo);
        System.out.println(A);
        lo = partitionArrayIntoThree(A,3,7);
        System.out.println(lo);

    }
}
