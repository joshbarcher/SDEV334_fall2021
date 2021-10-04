package growth_rates;

import java.io.File;
import java.io.FileInputStream;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Examples3
{
    public static void readFile(File file)
    {
        try (Scanner reader = new Scanner(new FileInputStream(file)))
        {
            int lineCount = 0;
            int total = 0;

            while (reader.hasNextLine())
            {
                lineCount++;
                total += Integer.parseInt(reader.nextLine());
            }

            double avg = (total * 1.0) / lineCount;
            System.out.println("Average is: " + avg);
        }
        catch (Exception ex)
        {
            System.out.println("Something went wrong: " + ex.getMessage());
        }
    }

    public static void printMultiplicationTable(int n, int m)
    {
        int rows = n;
        int cols = m;

        System.out.println("Multiplication table");
        System.out.println("********************");
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j < cols; j++)
            {
                System.out.print(i * j);
            }
            System.out.println();
        }
        System.out.println("********************");
    }

    public static void printMultTable()
    {
        Scanner user = new Scanner(System.in);

        //user inputs
        System.out.println("Enter rows: ");
        int rows = user.nextInt();
        System.out.println("Enter cols: ");
        int cols = user.nextInt();

        System.out.println("Multiplication table");
        System.out.println("********************");
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j < cols; j++)
            {
                System.out.print(i * j);
            }
            System.out.println();
        }
        System.out.println("********************");
    }

    public static void printTable()
    {
        int rows = 10;
        int cols = 10;

        System.out.println("Multiplication table");
        System.out.println("********************");
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j < cols; j++)
            {
                System.out.print(i * j);
            }
            System.out.println();
        }
        System.out.println("********************");
    }

    /*
        Runtime is nlogn, but this is an overestimate. t(n) = 1    + log1 + log2 + log3 + ... + logn
                                                       t(n) = logn + logn + logn + logn + ... + logn
     */
    public static Map<String, String> getDictionary(String file)
    {
        final int WORD = 0;
        final int DEFINITION = 1;

        Map<String, String> dict = new TreeMap<>();
        try (Scanner reader = new Scanner(new FileInputStream(file)))
        {
            while (reader.hasNextLine()) //costs n
            {
                String line = reader.nextLine();
                String[] parts = line.split(" - ");

                if (!dict.containsKey(parts[WORD]))
                {
                    dict.put(parts[WORD], parts[DEFINITION]); //cost logn
                }
            }
        }
        catch (Exception ex)
        {
            System.out.println("Something went wrong: " + ex.getMessage());
        }

        return dict;
    }
}
