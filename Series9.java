//S=1+(1+2)+(1+2+3)+(1+2+3+4)+(1+2+3+4+5)+(1+2+3+4+.......+10)
class Series9
{
    public static void main()
    {
        int s=0;
        for (int i=1;i<=10;i++)
        {
            for (int j=1;j<=i;j++)
            {
                s=s+j;
            }
        }
        System.out.println(s);
    }
}