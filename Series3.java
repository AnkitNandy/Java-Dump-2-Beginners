//To print the series:- 2, 3, 6, 18, 108,...........  .
class Series3
{
    public static void main(int n)//number of terms
    {
        int a=2;
        int b=3;
        int prod=1;
        System.out.print(a+", "+b+", ");
        int i=3;
        while (i<=n)
        {
            prod=a*b;
            a=b;
            b=prod;
            if (i==n)
            System.out.print(prod+".");
            else
            System.out.print(prod+", ");
            i++;
        }
    }
}