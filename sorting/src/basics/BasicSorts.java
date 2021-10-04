package basics;

import utility.SortingUtilities;

import java.util.Arrays;

public class BasicSorts
{
    public static void main(String[] args)
    {
        int[] testMe = SortingUtilities.genArray(20); //SortingUtilities.genSortedArray(20);

        //array before
        System.out.println(Arrays.toString(testMe));
        System.out.println("Inversions: " +
                SortingUtilities.containsInversions(testMe));

        //sort it
        bubbleSort(testMe);

        //array after
        System.out.println(Arrays.toString(testMe));
        System.out.println("Inversions: " +
            SortingUtilities.containsInversions(testMe));
    }

    public static void bubbleSort(int[] array)
    {
        for (int i = 0; i < array.length; i++) //each "pass" over the array
        {
            //optimize in case the array is sorted early
            boolean swapped = false;
            for (int j = 0; j < array.length - i - 1; j++) //loop over elements for one "pass"
            {
                if (array[j] > array[j + 1]) //if we find an inversion, swap them
                {
                    SortingUtilities.swap(array, j, j + 1);
                    swapped = true;
                }
            }

            if (!swapped)
            {
                System.out.println("Stopped early!");
                return;
            }
        }
    }

    public static void selectionSort(int[] array)
    {
        //loops...
    }
}
