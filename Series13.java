//s = a + 1/2 + a + 3/4 + a + 5/6 + a + 7/8 +........ upto n terms
class Series13
{
    static void main(int a,int n)
    {
        int i;
        double x=1.0,y=2.0;
        double sum=0.0;
        for (i=1;i<=n;i++)
        {
            if (i%2==0)
            {
                sum=sum+x/y;
                x+=2;
                y+=2;
            }
            else
            {
                sum=sum+a;
            }
        }
        System.out.println("Sum = "+sum);
    }
}
                