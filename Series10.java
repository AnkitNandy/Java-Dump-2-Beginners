//Sum = 2-4+6-8+10-......-20
class Series10
{
    static void main()
    {
        int x=-1;
        int sum=0;
        for (int i=2;i<=20;i=i+2)
        {
            x=x*-1;
            sum=sum+i*x;
        }
        System.out.println("Sum = "+sum);
    }
}
        