// S = 1*3 + 2*4 + 3*5 + ...............+ 9*11.
public class Series19
{
    public static void main()
    {
        int i=1;
        int j=3;
        int s=0;
        while (i<=9)
        {
            while (j<=11)
            {
                s=s+i*j;
                i++;
                j++;
            }
        }
        System.out.println("Sum of the series (1*3 + 2*4 + 3*5 +.................+ 9*11) is =");
        System.out.println(s);
    }
}