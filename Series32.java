// 0,3,8,15,.....
class Series32
{
    static void main()
    {
        int a=3;
        int s=0;
        for (int i=1;i<=10;i++)
        {
            if (i==10)
            System.out.print(s+".");
            else
            System.out.print(s+", ");
            s+=a;
            a+=2;
        }
    }
}