package Streaming_algorithm;

/**
 * Created by asoni on 2/10/2017.
 */
public class BoyerMooreMajorityVoteAlgorithm {

    /* Function to print Majority Element */
    void printMajority(int a[], int size)
    {
        /* Find the candidate for Majority*/
        int cand = findCandidate(a, size);

        /* Print the candidate if it is Majority*/
        if (isMajority(a, size, cand))
            System.out.println(" " + cand + " ");
        else
            System.out.println("No Majority Element");
    }

    /* Function to find the candidate for Majority */

    /**
     *  The Idea is to cancel counts of a number by other eg
     *  1 2 1 4 1 6 1 8 1 10 1 (11 nos)
     *  each 1 is canceled by next no even then by last element we will get Majority element as 1
     */
    int findCandidate(int a[], int size)
    {
        int maj_index = 0, count = 1;
        int i;
        for (i = 1; i < size; i++)
        {
            if (a[maj_index] == a[i])
                count++;
            else
                count--;
            if (count == 0)
            {
                maj_index = i;
                count = 1;
            }
        }
        return a[maj_index];
    }

    /* Function to check if the candidate occurs more
       than n/2 times */
    boolean isMajority(int a[], int size, int cand)
    {
        int i, count = 0;
        for (i = 0; i < size; i++)
        {
            if (a[i] == cand)
                count++;
        }
        if (count > size / 2)
            return true;
        else
            return false;
    }

    /* Driver program to test the above functions */
    public static void main(String[] args)
    {
        BoyerMooreMajorityVoteAlgorithm majorelement = new BoyerMooreMajorityVoteAlgorithm();
        int a[] = new int[]{1,2,3,2,2,1,2,3,3,2,2};
        int size = a.length;
        majorelement.printMajority(a, size);
    }
}
