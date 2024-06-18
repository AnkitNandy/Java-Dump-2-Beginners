import java.util.*;
class Series25
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Given, Series : ");
        System.out.println("1 + (a square/1!) + (a cube/2!) + (a power 4/3!) + .......upto 'n' terms");
        System.out.println("\nEnter the value of 'a' in the series:");
        int a=sc.nextInt();
        System.out.println("Enter the number 'n' or terms:");
        int n=sc.nextInt();
        double sum=1.0;
        double f=1.0;
        for (int i=1;i<n;i++)
        {
            for (int j=1;j<=i;j++)
            f = f*j;
            sum = sum + ((a*(i+1))/f);
        }
        System.out.println("\nSum of the given series : "+sum);
    }
}