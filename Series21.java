// S = 1 + 1/2 + 1/3 + 1/4 + 1/5 +..............+ 1/10.
public class Series21
{
    public static void main()
    {
        int i;
        double s=0.0;
        for (i=1;i<=10;i++)
        {
            s=s+1.0/i;
        }
        System.out.println("Sum of the series (1 + 1/2 + 1/3 + 1/4 + 1/5 +...................+ 1/10) is =");
        System.out.println(s);
    }
}