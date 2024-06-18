class StringPattern2
{
    static void main()
    {
        int a=9;
        for(int i=5;i>=1;i--)
        {
            for (int k=8;k>=a;k--)
            System.out.print(" ");
            a-=2;
            for (int j=1;j<=i;j++)
            System.out.print("* ");
            System.out.println();
        }
    }
}