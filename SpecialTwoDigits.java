/**In a special two-digit number,
 * sum of digits+product of digits.
 * =original two-digit number.
 * If not, then not special.
 */
import java.util.*;
public class SpecialTwoDigits
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int x,y,num,z;
        System.out.println("Enter the two-digit number:-");
        num=sc.nextInt();
        x=num/10;
        y=num%10;
        num=(10*x)+y;
        z=(x*y)+(x+y);
        if (num==z)
        System.out.println(num+" is a special two-digit number.");
        else
        System.out.println(num+" is not a special two-digit number.");
    }
}