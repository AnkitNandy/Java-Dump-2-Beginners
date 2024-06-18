//To input 10 integers and print the sum of 2-digit as well as 3-digit numbers separately
import java.util.*;
public class Sum_Of_2digit_And_3digit_Integers
{
    public static void main()
    {
        Scanner scan=new Scanner(System.in);
        int num;
        int sum2=0,sum3=0;
        System.out.println("Enter 10 integers to find the sum of 2 and 3 digit numbers separately :-");
        for (int i=1;i<=10;i++)
        {
            num=scan.nextInt();
            if (num>=10 && num<=99)
            sum2=sum2+num;
            else if (num>=100 && num<=999)
            sum3=sum3+num;
        }
        System.out.println();
        System.out.println("Sum of two-digit numbers among these integers :- "+sum2+", and");
        System.out.println("Sum of three-digit numbers among these integers :- "+sum3+".");
    }
}