//To print the series:- 2, 4, 6, 8, 10,.........till 30.
class Series5
{
    public static void main()
    {
        int i;//control variable
        int n=30;//end limit for number of terms
        i=2;
        while (i<=n)
        {
            if (i==n)
            System.out.print(i+".");
            else
            System.out.print(i+", ");
            i=i+2;
        }
    }
}