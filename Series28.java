import java.util.*;
class Series28
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Given, Series:");
        System.out.println("2-4+6-8+.... to 'n' terms");
        System.out.println("\nEnter the value of n:-");
        int n=sc.nextInt();
        int a=2,sum=0;
        for (int i=1;i<=n;i++)
        {
            if (i%2!=0)
            sum = sum+a;
            else
            sum = sum-a;
            a+=2;
        }
        System.out.println("\nSum of the given series : "+sum);
    }
}