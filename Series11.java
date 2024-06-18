// To generate :- 2-4+6-8+10-.....-20
class Series11
{
    static void main()
    {
        int i=2,a=1;
        int sum=0;
        while (i<=20)
        {
            if (a%2==0)
            sum=sum-i;
            else
            sum=sum+i;
            a++;
            i+=2;
        }
        System.out.println("Sum = "+sum);
    }
}