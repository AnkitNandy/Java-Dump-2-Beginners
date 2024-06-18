//S=(1*2)+(2*3)+(3*4)+(4*5)+............upto n terms
import java.util.*;
class Series_Function
{
    int s=0;
    int sum(int n)
    {
        for (int i=0;i<=n;i++)
        {
            s=s+(i*(i+1));
        }
        return s;
    }
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms in your series:");
        int num=sc.nextInt();
        Series_Function obj=new Series_Function();
        System.out.println("The result of the series is "+obj.sum(num));
    }
}