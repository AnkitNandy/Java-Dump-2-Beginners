//S = (a+1)/3 + (a+2)/5 + (a+3)/7 +........to 'n' .
class Series33
{
    static void main(int n,double a)
    {
        double s=0.0,d=2.0;
        for (int i=1;i<=n;i++)
        {
            s = s + ((a+i)/d);
            d+=2.0;
        }
        System.out.println("Sum of the Series : "+s);
    }
}