// 1, 12, 123, 1234, ......... upto 10 terms
class Series27
{
    public static void main()
    {
        String s="";
        for (int i=1;i<=10;i++)
        {
            s = s+i;
            if (i!=10)
            System.out.print(s+", ");
            else
            System.out.print(s+".");
        }
    }
}