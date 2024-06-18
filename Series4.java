//To print the series:- 1, 3, 5, 7, 9,.........till 29.
class Series4
{
    public static void main()
    {
        int i;//control variable
        int n=29;//end number of terms
        i=1;
        while(i<=n)
        {
            if (i==n)
            System.out.print(i+".");
            else
            System.out.print(i+", ");
            i=i+2;
        }
    }
}