/*To accept an integer and 
 * display the new number
 * by removing all zeros.
 */
import java.util.Scanner;
class Removing_Zeros
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer to remove all its zeros :-");
        int num=sc.nextInt();
        int n=num;
        int d;
        int i=0,s=0;
        while(n!=0)
        {
            d=n%10;
            if (d!=0)
            {
                s=s+(int)Math.pow(10,i)*d;
                i++;
            }
            n=n/10;
        }
        System.out.println("Removing all zeros from "+num+", we get:-");
        System.out.println(s);
    }
}