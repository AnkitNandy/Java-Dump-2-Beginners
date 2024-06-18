/**A program to accept 'n' different numbers.
 * Find and display the smallest and greatest 
 * numbers from the given set of entered numbers.
 */
import java.util.*;
public class SmallestAndGreatest
{
    int num,n,rem;
    int max,min,i;
    Scanner scan=new Scanner(System.in);
    public void InputData()
    {
        System.out.println("TO FIND THE GREATEST AND SMALLEST NUMBER AMONG A SET OF NUMBERS ENTERED");
        System.out.println("Enter the number of values which you want to enter:-");
        n=scan.nextInt();
        System.out.println("Enter the first number from your set of "+n+" numbers :-");
        num=scan.nextInt();
        min=num;
        max=num;
    }
    public void calculation()
    {
        System.out.println("Enter your remaining set of "+(n-1)+" numbers :-");
        for (i=1;i<n;i++)
        {
            rem=scan.nextInt();
            if (rem<min)
            min=rem;
            if (rem>max)
            max=rem;
        }
    }
    public void OutputData()
    {
        System.out.println("The greatest number is "+max+".");
        System.out.println("The smallest number is "+min+".");
    }
    public static void main()
    {
        SmallestAndGreatest obj=new SmallestAndGreatest();
        obj.InputData();
        obj.calculation();
        obj.OutputData();
    }
}