class StringPattern1
{
    static void main()
    {
        String s="BLUEJ";
        int j,i,k,a=0;
        for (i=s.length()-1;i>=0;i--)
        {
            for (k=1;k<=a;k++)
            {
                System.out.print(" ");
            }     
            a+=2;
            for (j=0;j<=i;j++)
            System.out.print(s.charAt(j)+" ");                   
            System.out.println();
        }
    }
}