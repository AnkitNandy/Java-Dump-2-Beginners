//s = (x/1) - (x/2) + (x/3) - (x/5) +...........upto 'n' terms.
class Series31
{
    public static void main(double x,int n)
    {
        double s = (x/1.0) - (x/2.0);
        double a=1.0,b=2.0,sum=0.0;
        for (int i=1;i<=(n-2);i++)
        {
            sum = a+b;
            if (i%2!=0)
            s = s+(x/sum);
            else
            s = s-(x/sum);
            a = b;
            b = sum;
        }
        System.out.println("Sum of the series : "+s);
    }
}