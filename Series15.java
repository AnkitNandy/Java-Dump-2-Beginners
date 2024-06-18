//Sum(S)=1 + 2/2*3 + 2 + 3/3*4 + 3 + 4/4*5 + 4 + 5/5*6 +........, upto n terms
import java.util.*;
public class Series15
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms for the series :-");
        int n=sc.nextInt();
        double s=0.0;
        double a=2.0,b=3.0,c=1.0;
        for (int i=1;i<=n;i++)
        {
            if (i%2==0)
            {
                s=s+a/a*b;
                a++;
                b++;
            }
            else
            {
                s=s+c;
                c++;
            }
        }
        System.out.println("Sum ="+s);
    }
}