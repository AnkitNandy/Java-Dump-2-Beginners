//s=a/2 + a/3 + a/4 +...........+a/n
class Series12
{
    static void main(int a,int n)
    {
        double i=2;
        double s=0.0;
        while (i<=n)
        {
            s=s+a/i;
            i++;
        }
        System.out.println("Sum = "+s);
    }
}