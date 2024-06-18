//Sum(S) = x/2 + x/5 + x/8 + x/11 +.....+ x/20, where x is to be taken as input
import java.util.*;
public class Series14
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        double x;
        System.out.println("Enter the value of x in the series :-");
        x=sc.nextDouble();
        double i=2.0;
        double s=0.0;
        while (i<=20.0)
        {
            s=s+x/i;
            i+=3;
        }
        System.out.println("Sum of the given series = "+s);
    }
}