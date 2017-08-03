/**
 * Created by asoni on 2/10/2017.
 */
public class Kadane {

    /**
     * Basic idea is to eliminate negative effect like 4 eliminates next -1 -2 effect and still +1 is left
     *       -2, -3, 4, -1, -2, 1, 5, -3
     * max_so_far  curr_max
     *    -2          -2
     *    -2          -3
     *     4           4
     *     4           3
     *     4           1
     *     4           2
     *     7           7
     *     7           4
     */
    static int maxSubArraySum(int a[])
    {
        int max_so_far = a[0];
        int curr_max = a[0];

        for (int i = 1; i < a.length; i++)
        {
            curr_max = Math.max(a[i], curr_max+a[i]);
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    /* Driver program to test maxSubArraySum */
    public static void main(String[] args)
    {
        int a[] =  {-2, -3, 4, -1, -2, 1, 5, -3};
        int max_sum = maxSubArraySum(a);
        System.out.println("Maximum contiguous sum is "+max_sum);
    }
}
