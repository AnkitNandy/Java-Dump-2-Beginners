class Series1
{
    public static void main(int n)
    {
        int a=0,b=0,c=1,sum=0;
        int i=4;
        System.out.print(a+", "+b+", "+c+", ");
        while(i<=n)
        {
            sum=a+b+c;
            a=b;
            b=c;
            c=sum;
            if (i==n)
            System.out.print(sum+".");
            else
            System.out.print(sum+", ");
            i++;
        }
        
    }
}