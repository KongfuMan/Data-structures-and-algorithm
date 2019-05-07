package Alogrithm.BinarySearch;

// the given array must be already sorted
public class BinarySearch {
    public static void main(String[] argvs){
        int[] source = {1,2,3,4,5,6,7,8,9,10};
        int target = -1;
        System.out.print(binarySearchByRecursion(source,0,source.length - 1, target));
    }
    //assume that source is already sorted
    public static int binarySearch(int[] source, int target){
        int start = 0, end = source.length - 1;
        while (start + 1 < end){
            int mid = start + ( end - start ) / 2;  // don't use (end + start) / 2, avoid overflow
            if (target == source[mid]){
                return mid;
            }else if (target < source[mid]){
                end = mid;
            }else{
                start = mid;
            }
        }

        if (source[start] == target ){
            return start;
        }

        if (source[end] == target ){
            return end;
        }

        return -1;
    }

    public static int binarySearchByRecursion(int[] source, int start, int end, int target){
        if (start > end){
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (target == source[mid]){
            return mid;
        }else if (target < source[mid]){
            return binarySearchByRecursion(source, start, mid - 1, target);
        }
        return binarySearchByRecursion(source, mid + 1, end, target);
    }
}
/*
prove correctness：loop-invariant:
initialization: target in is source, and source[left] <= target <= source[right]
Maintenance:If it is true before an iteration of the loop, it remains true before the
next iteration.
Termination: the target must be in source[left,right]. So we check left and right to see if it equals target
 */

//How about find the first and last element whose value equals target?
