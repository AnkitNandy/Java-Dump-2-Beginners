// S = 1/2 + 2/3 + 3/4 + 4/5 +............+ 9/10.
public class Series22
{
    public static void main()
    {
        double i=1.0,j=2.0;
        double s=0.0;
        while (i<=9.0)
        {
            while (j<=10.0)
            {
                s=s+i/j;
                i++;
                j++;
            }
        }
        System.out.println("Sum of the series (1/2 + 2/3 + 3/4 + 4/5 +......................+ 9/10) is =");
        System.out.println(s);
    }
}