/*To first enter a string
 * and then check whether
 * it starts with or ends with
 * a charter or string Or Not.
 */
import java.util.*;
public class StartEnd_OrNot
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String str;
        char ch;
        System.out.println("Enter a string:-");
        str=sc.nextLine();
        System.out.println("Press 'a' to check whether the entered string starts with a particular string.");
        System.out.println("Press 'b' to check whether the entered string ends with a particular string.");
        System.out.println();
        System.out.println("Enter your choice:-");
        ch=sc.next().charAt(0);
        switch(ch)
        {
            case 'a':
            String start;
            System.out.println("Enter a string to check if it lies at the starting of the given entered string:-");
            start=sc.nextLine();
            if (str.startsWith(start))
            {
                System.out.println("' "+str+" '"+"\n"+" STARTS WITH "+start+".");
            }
            else
            {
                System.out.println("' "+str+" '"+"\n"+" DOES NOT START WITH "+start+".");
            }
            break;
            case 'b':
            String end;
            System.out.println("Enter a string to check if it lies at the ending of the given entered string:-");
            end=sc.nextLine();
            if (str.endsWith(end))
            {
                System.out.println("' "+str+" '"+"\n"+" ENDS WITH "+end+".");
            }
            else
            {
                System.out.println("' "+str+" '"+"\n"+" DOES NOT END WITH "+end+".");
            }
            break;
            default:
            System.out.println("Wrong Choice Made!!!"+"\n"+"Try Again.");
            System.exit(0);
        }
    }
}