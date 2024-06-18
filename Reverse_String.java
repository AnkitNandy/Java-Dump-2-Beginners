/**To accept a string and
 * display it in reverse 
 * order.
 */
import java.util.*;
class Reverse_String
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string :-");
        String s=sc.nextLine();
        System.out.println();
        String str="";
        s=s.trim();
        s=" "+s;
        char c;
        System.out.println("New Reversed String =");
        for (int i=s.length()-1;i>=0;i--)
        {
            c=s.charAt(i);
            if (c!=' ')
            {
                str=c+str;
            }
            else
            {
                System.out.print(str+" ");
                str="";
            }
        }
    }
}
            