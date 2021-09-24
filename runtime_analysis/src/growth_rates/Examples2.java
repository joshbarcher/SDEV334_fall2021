package growth_rates;

public class Examples2
{
    public static void numbers1(int high)
    {
        for (int i = 1; i <= high; i++)
        {
            System.out.println(i);
        }
    }

    public static void numbers2()
    {
        for (int i = 1; i <= 100; i++)
        {
            System.out.println(i);
        }
    }

    public static void numbers3(int high)
    {
        for (int i = 1; i <= high; i++)
        {
            for (int j = 0; j <= high; j++)
            {
                System.out.println(i * j);
            }
        }
    }

    public static void numbers4(int high)
    {
        for (int i = 1; i <= high; i++)
        {
            for (int j = 0; j <= high; j++)
            {
                for (int k = 0; k <= high; k++)
                {
                    System.out.println(i * j * k);
                }
            }
        }
    }

    public static void numbers5(int high)
    {
        for (int i = 1; i <= 100; i++)
        {
            for (int j = 0; j <= high; j++)
            {
                for (int k = 0; k <= high; k++)
                {
                    System.out.println(i * j * k);
                }
            }
        }
    }

    public static void numbers6(int high)
    {
        for (int i = 1; i <= 100; i++)
        {
            for (int j = 0; j <= 100; j++)
            {
                for (int k = 0; k <= high; k++)
                {
                    System.out.println(i * j * k);
                }
            }
        }
    }

    public static void numbers7(int high)
    {
        for (int i = 1; i <= 100; i++)
        {
            for (int j = 0; j <= 100; j++)
            {
                for (int k = 0; k <= 100; k++)
                {
                    System.out.println(i * j * k);
                }
            }
        }
    }

    public static void numbers8(int high)
    {
        for (int i = 1; i <= high; i *= 2)
        {
            for (int j = 0; j <= high; j++)
            {
                System.out.println(i * j);
            }
        }
    }

    public static void numbers9(int high)
    {
        for (int i = 1; i <= high; i *= 2)
        {
            for (int j = 0; j <= 100; j++)
            {
                System.out.println(i * j);
            }
        }
    }
}
