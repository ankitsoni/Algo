import java.io.*;
import java.util.StringTokenizer;

/**
 * Created by asoni on 2/16/2017.
 */
public class Juggling {

    int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

    void leftRotate(int[] arr, int d) {
        int juggles = gcd(arr.length, d);
        for (int i = 0; i < juggles; i++) {
            int temp = arr[i];
            int j = i;
            int k = i+d;
            while (k != arr.length - d) {
                if (k >= arr.length) {
                    k = k - arr.length;
                }
                arr[j] = arr[k];
                j = k;
                k = k+d;
            }
            arr[k] = temp;
        }
    }

    void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }

    public static void main(String[] args) {
        Juggling rotate = new Juggling();
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        rotate.leftRotate(arr, 6);
        rotate.printArray(arr);
    }
}
