class SampleMethod
{
    static int a=4;
    public void calc()
    {
        a=a*a;
    }
    public void display()
    {
        System.out.println(a);
    }
    public static void main()
    {
        SampleMethod obj1=new SampleMethod();
        SampleMethod obj2=new SampleMethod();
        obj1.calc();
        obj1.display();
        obj2.calc();
        obj2.display();
    }
}