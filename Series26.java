//2,5,10,17,.....upto 10 terms
class Series26
{
    public static void main()
    {
        int a=2,b=3;
        for (int i=1;i<=10;i++)
        {
            if (i==10)
            System.out.print(a+".");
            else
            System.out.print(a+", ");
            a+=b;
            b+=2;
        }
    }
}