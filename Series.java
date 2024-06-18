import java.util.*;
public class Series
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n;
        int i;
        int s=0;
        System.out.println("1+2+3+4+5+....n terms");
        System.out.println("Enter the number of terms(n):-");
        n=sc.nextInt();
        System.out.println("Sum =");
        for (i=1;i<=n;i++)
        {
            s=s+i;
        }
        System.out.println(+s);
    }
}
        