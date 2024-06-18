/*Accept a number from user
 * and print the reverse
 * of its digits.
 */
import java.util.*;
public class Reverse
{
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        long n;//number entered
        long d;
        long rev=0;//reverse
        long num;//=n
        System.out.println("TO PRINT THE REVERSE OF DIGITS OF A NUMBER");
        System.out.println();
        System.out.println("Enter a  number:-");
        n=sc.nextInt();
        num=n;
        while (n>0)
        {
            d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        System.out.println("Reverse of "+num+" is:-");
        System.out.println(+rev);
    }
}