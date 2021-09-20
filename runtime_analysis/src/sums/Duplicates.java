package sums;

import java.util.Random;

public class Duplicates
{
    public static void main(String[] args)
    {
        int[] check = genArray(500000); //= {1, 2, 3, 4, 1, 2, 3, 1, 1, 2, 3, 4};
        int duplicates = countDups(check);
        System.out.println("Duplicates: " + duplicates);
    }

    public static int[] genArray(int size)
    {
        int[] result = new int[size];

        Random random = new Random();
        for (int i = 0; i < result.length; i++)
        {
            result[i] = random.nextInt(size);
        }

        return result;
    }

    public static int countDups(int[] array)
    {
        int count = 0;

        for (int i = 0; i < array.length; i++)
        {
            for (int j = i + 1; j < array.length; j++)
            {
                if (array[i] == array[j] && i != j)
                {
                    //just count the first dup you found
                    count++;
                    break;
                }
            }
        }

        return count;
    }
}
