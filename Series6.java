//To print the series:- 100, 90, 80, 70, 60,........ till 0.
class Series6
{
    public static void main()
    {
        int i;
        int n=0;
        i=100;
        while(i>=n)
        {
            if (i==n)
            System.out.print(i+".");
            else
            System.out.print(i+", ");
            i=i-10;
        }
    }
}