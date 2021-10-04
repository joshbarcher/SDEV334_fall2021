package utility;

import java.util.Arrays;
import java.util.Random;

public class SortingUtilities
{
    private static Random random = new Random();

    public static int[] genArray(int size)
    {
        int[] results = new int[size];

        for (int i = 0; i < results.length; i++)
        {
            //a good heuristic!
            results[i] = random.nextInt(size / 2);
        }

        return results;
    }

    public static int[] genSortedArray(int size)
    {
        int[] toSort = genArray(size);
        Arrays.sort(toSort);
        return toSort;
    }

    public static boolean containsInversions(int[] toTest)
    {
        return false;
    }

    public static void swap(int[] array, int first, int second)
    {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
