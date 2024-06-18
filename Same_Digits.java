/**To input an integer and check whether
 * all digits in it are same or not.
 */
import java.util.*;
public class Same_Digits
{
    public static void main()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter an integer to check if all digits in it are same or not :-");
        int num=scan.nextInt();
        System.out.println();
        int digit=0;
        int a=0,b=0;
        int d=num%10;
        while (num!=0)
        {
            digit=num%10;
            a++;
            num=num/10;
            if (d==digit)
            b++;
        }
        if (a==b)
        System.out.println("All the digits are SAME.");
        else
        System.out.println("All the digits are NOT SAME.");
    }
}