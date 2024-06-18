class SmithNumber
{
    public static void main(int num)
    {
        int i,j;
        int r,s2=0,s1=0;
        int n=num;
        int number=num;
        int a,d;
        while (num>0)
        {
            r=num%10;
            s1=s1+r;
            num=num/10;
        }
        i=2;
        while (n!=1)
        {  
            a=i;
            if (n%i==0)
            {
                while (a!=0)
                {
                    d=a%10;
                    s2=s2+d;
                    a=a/10;
                }
                n=n/i;
            }
            else
            {
                i++;
            }
        }
        if (s1==s2)
        System.out.println(number+" is A SMITH NUMBER.");
        else
        System.out.println(number+" is NOT A SMITH NUMBER.");
    }
}