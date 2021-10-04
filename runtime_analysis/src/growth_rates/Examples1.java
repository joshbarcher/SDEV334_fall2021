package growth_rates;

public class Examples1
{
    public static void countN(int n)
    {
        //print 1, 2, 3, ... , n-1, n
        for (int i = 1; i <= n; i++)
        {
            System.out.println(i);
        }
    }

    public static void count100()
    {
        //print 1, 2, 3, ... , 99, 100
        for (int i = 1; i <= 100; i++)
        {
            System.out.println(i);
        }
    }

    public static void count100AndN(int n)
    {
        //print 1, 2, 3, ... , 99, 100
        for (int i = 1; i <= 100; i++)
        {
            System.out.println(i);
        }

        //print 1, 2, 3, ... , n-1, n
        for (int i = 1; i <= n; i++)
        {
            System.out.println(i);
        }
    }

    public static void countTo100NTimes(int n)
    {
        /* print
             1, 2, 3, ... , 99, 100
             1, 2, 3, ... , 99, 100
             1, 2, 3, ... , 99, 100
             ...
         */
        for (int i = 1; i < n; i++)
        {
            for (int j = 1; j < 100; j++)
            {
                System.out.print(i + ", ");
            }
            System.out.println();
        }
    }

    public static void countToNNTimes(int n)
    {
        /* print
             1, 2, 3, ... , (n-1), n
             1, 2, 3, ... , (n-1), n
             1, 2, 3, ... , (n-1), n
             ...
         */
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                System.out.print(i + ", ");
            }
            System.out.println();
        }
    }

    public static void countingAlot(int n)
    {
        for (int i = 1; i <= n; i++)
        {
            System.out.println(i);
        }

        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                System.out.print(i + ", ");
            }
            System.out.println();
        }
    }

    public static void countingSomeMore(int n)
    {
        for (int i = 1; i < n; i++)
        {
            System.out.println(i);
        }

        for (int i = 1; i < n; i++)
        {
            for (int j = 1; j < 100; j++)
            {
                System.out.print(i + ", ");
            }
            System.out.println();
        }
    }
}
