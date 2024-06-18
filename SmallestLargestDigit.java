//To find the smallest and the largest digit present in a number entered by the user
import java.util.*;
class SmallestLargestDigit
{
    static int n,num,r,min,max;
    Scanner sc=new Scanner(System.in);
    public void InputData()
    {
        System.out.println("TO FIND THE SMALLEST AND LARGEST DIGIT PRESENT IN AN INTEGER");
        System.out.println();
        System.out.println("Enter an integral number :-");
        num=sc.nextInt();
        n=num;
    }
    public void Calculate()
    {
        min=num%10;
        max=num%10;
        while(num>0)
        {
            r=num%10;
            if (r<min)
            min=r;
            if (r>max)
            max=r;
            num=num/10;
        }
    }
    public void OutputData()
    {
        System.out.println();
        System.out.println("Smallest digit present in "+n+" = "+min+".");
        System.out.println("Largest digit present in "+n+" = "+max+".");
    }
    public static void main()
    {
        SmallestLargestDigit object=new SmallestLargestDigit();
        object.InputData();
        object.Calculate();
        object.OutputData();
    }
}