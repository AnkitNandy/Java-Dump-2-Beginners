class StringPattern3
{
    static void main(int n)
    {
        for (int i=n;i>=1;i--)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print((char)(j+64));
            }
            System.out.println();
        }
    }
}