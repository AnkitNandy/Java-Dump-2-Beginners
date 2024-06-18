class Recursive_Function
{
    int fact(int n)
    {
        if (n==0)
        return (1);
        else
        return (n*fact(n-1));
    }
    public static void main()
    {
        Recursive_Function obj = new Recursive_Function();
        int a=5;
        int f = obj.fact(a);
        System.out.println("Factorial of "+a+" is "+f);
    }
}