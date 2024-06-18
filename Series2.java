//To print the given series:- 1, 1, 2, 3, 5, 8,.....  .
class Series2
{
    public static void main(int n)//number of terms
    {
        int a=1;
        int b=1;
        int sum=0;
        int i;
        System.out.print(a+", ");
        for (i=2;i<=n;i++)
        {
            sum=a+b;
            a=b;
            b=sum;
            if (i==n)
            System.out.print(a+".");
            else
            System.out.print(a+", ");
        }
    }
}