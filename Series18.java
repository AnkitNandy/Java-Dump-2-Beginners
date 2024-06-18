// S = 1*2 + 3*4 + 5*6 +.............+ 9*10.
public class Series18
{
    public static void main()
    {
        int i=1;
        int j=2;
        int s=0;
        while (i<=9)
        {
            while (j<=10)
            {
                s=s+i*j;
                i+=2;
                j+=2;
            }
        }
        System.out.println("Sum of the series (1*2 + 3*4 + 5*6 +........+ 9*10) is =");
        System.out.println(s);
    }
}