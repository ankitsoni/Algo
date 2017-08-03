package Searching;

import java.util.Arrays;

/**
 * Created by asoni on 3/16/2017.
 */
public class Binary {

    static int binarySearch(int[] arr, int key, int l, int r) {
        while (l < r) {
            int mid = (l + r) / 2;
            if (arr[mid] == key)
                return mid;
            else if (arr[mid] > key) {
                r = mid;
            } else
                l = mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 23, 36, 18, 14, 6, 7, 12, 9};
        Arrays.sort(arr);// Binary Search Applies to sorted arrays only
        int position = binarySearch(arr, 14, 0,arr.length);
        if (position == -1) {
            System.out.println("Not Found");
            System.exit(0);
        }
        System.out.println(position + 1);
    }
}
