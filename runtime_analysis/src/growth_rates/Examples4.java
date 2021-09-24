package growth_rates;

public class Examples4
{
    public static int factorial(int n)
    {
        if (n == 0 || n == 1)
        {
            return n;
        }
        return factorial(n - 1) * n;
    }

    public static void printPowers(int n)
    {
        if (n == 0)
        {
            System.out.println("1");
        }
        else if (n % 2 != 0)
        {
            //if not a power of 2, move to the next number
            printPowers(n - 1);
        }
        else
        {
            System.out.println(n);
            printPowers(n / 2);
        }
    }
}
