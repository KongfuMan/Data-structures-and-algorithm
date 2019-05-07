package Alogrithm.Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int myArray[] = selectionSort(new int[]{9, 8, 99, 19, 8, 17, 636, 13, 12});

        for (int i : myArray) {
            System.out.println(i);
        }
    }

    public  static int[] selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++){
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[minIdx] > arr[j]){
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
