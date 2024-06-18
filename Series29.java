//(1/2) + (3/4) + (5/6) + (7/8) + .....+ (19/20).
class Series29
{
    public static void main()
    {
        double s=0.0;
        for (double i=1;i<=19;i+=2)
        {
            s = s + (double)(i/(i+1));
        }
        System.out.println("Sum of the series is "+s);
    }
}