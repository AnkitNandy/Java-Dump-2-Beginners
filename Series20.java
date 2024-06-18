// S = 1-2+3-4+5-6+............+19-20.
public class Series20
{
    public static void main()
    {
        int i=1;
        int j=2;
        int s=0;
        while (i<=19)
        {
            while (j<=20)
            {
                s=s+i-j;;
                i+=2;
                j+=2;
            }
        }
        System.out.println("Sum of the series (1-2+3-4+5-6+...........+19-20) is =");
        System.out.println(s);
    }
}