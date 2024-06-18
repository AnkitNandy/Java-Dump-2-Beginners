//Program to find the sum of any 10 integers entered by the user
import java.util.*;
public class Sum_Of_10_Integers
{
    public static void  main()
    {
        Scanner scan=new Scanner(System.in);
        int num,sum=0;
        System.out.println("Enter any ten integers of your choice to find their sum :-");
        for (int i=1;i<=10;i++)
        {
            num=scan.nextInt();
            sum=sum+num;
        }
        System.out.println("Sum of these ten integers =");
        System.out.println(sum);
    }
}
            