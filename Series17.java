// S = 1*2 + 2*3 + 3*4 + ..............+ 9*10.
public class Series17
{
    public static void main()
    {
        int i=1,j=2;
        int s=0;
        while (i<=9)
        {
            while (j<=10)
            {
                s=s+i*j;
                i++;
                j++;
            }
        }
        System.out.println("Sum of the series (1*2 + 2*3 + 3*4 + ..........+ 9*10) is :-");
        System.out.println(s);
    }
}