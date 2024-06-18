class RecursiveFunction
{
    int fact(int n)
    {
        if (n==0)
        {
            return(1);
        }
        else
        {
            return (n*fact(n-1));
        }
    }
    public static void main()
    {
        int k=5;
        RecursiveFunction obj=new RecursiveFunction();
        System.out.println("Factorial of "+k+" = "+obj.fact(k));
    }
}