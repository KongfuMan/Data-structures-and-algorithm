package Alogrithm.Sorting;

public class InsertionSort {
    public static void main(String[] args){
        int myArray[] = insertionSort(new int[]{9,8,99,19,8,17,636,13,12});

        for (int i : myArray){
            System.out.println(i);
        }
    }

    public  static int[] insertionSort(int[] arr){
        for (int i = 0; i < arr.length; i++){
            int j = i;
            while (j > 0 && arr[j] > arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }

        return arr;
    }
}
