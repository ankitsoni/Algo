package Searching;

/**
 * Created by asoni on 3/16/2017.
 */
public class Linear {

    static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 23, 36, 18, 14, 6, 7, 12, 9};
        int position = linearSearch(arr, 14);
        if (position == -1) {
            System.out.println("Not Found");
            System.exit(0);
        }
        System.out.println(position + 1);
    }
}
