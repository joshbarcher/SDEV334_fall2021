package divide_and_conquer;

import utility.SortingUtilities;

import java.util.Arrays;

public class TestMergeSort
{
    public static void main(String[] args)
    {
        int[] arrayToTest = SortingUtilities.genArray(10);
        MergeSort sorter = new MergeSort(arrayToTest);

        //print before and after
        System.out.println(Arrays.toString(arrayToTest));
        sorter.mergeSort();
        System.out.println(Arrays.toString(arrayToTest));
    }
}
