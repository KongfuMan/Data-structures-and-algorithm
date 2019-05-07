package Alogrithm.Sorting;

public class MergeSort {

    public int[] mergeSort(int[] arr, int s, int e){
        if (s >= e){
            return new int[]{arr[s]};
        }
        int mid = s + (e - s) / 2;
        int[] left = mergeSort(arr, s, mid);
        int[] right = mergeSort(arr, mid + 1, e);
        return merge(left, right);
    }

    private int[] merge(int[] arrA, int[] arrB){
        int[] tempArr = new int[arrA.length + arrB.length];
        int i = 0, j = 0, idx = 0;
        while(i < arrA.length || j < arrB.length){
            int left = i < arrA.length ? arrA[i] : Integer.MAX_VALUE;
            int right = j < arrB.length ? arrB[j] : Integer.MAX_VALUE;
            if (left <= right){
                tempArr[idx++] = left;
                i++;
            }else{
                tempArr[idx++] = right;
                j++;
            }
        }

        return tempArr;
    }
}
