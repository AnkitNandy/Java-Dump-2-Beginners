//To find the smallest digit of an integer that is input
import java.util.*;
public class Smallest_Digit
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n;
        int a;
        System.out.println("Enter an integral number to find its smallest digit:-");
        n=sc.nextInt();
        int min=n%10;
        while(n>0)
        {
            a=n%10;
            if (a<min)
            a=min;
            n=n/10;
        }
        System.out.println("The smallest digit in "+n+" is "+"\n"+min);
    }
}