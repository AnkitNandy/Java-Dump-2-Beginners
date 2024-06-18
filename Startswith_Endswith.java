/*To check whether a given string
 * entered starts with or ends with
 * another entered string or not 
 * depending upon the user's choice.
 */
import java.util.*;
class Startswith_Endswith
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string :-");
        String s=sc.nextLine();
        String str;
        System.out.println();
        boolean c;
        char ch;
        do
        {
            System.out.println("Press 's' to check whether given string starts with your substring.");
            System.out.println("Press 'e' to check whether given string ends with your substring.");
            System.out.println("Enter your choice from 's' or 'e':-");
            ch=sc.next().charAt(0);
            System.out.println();
            switch (ch)
            {
            case 's':
            System.out.println("Enter the substring to see if it is present in the starting of the string you entered earlier :-");
            str=sc.next();
            System.out.println();
            c=s.startsWith(str);
            if (c==true)
            System.out.println(s+"\nStarts With\n"+str);
            else
            System.out.println(s+"\nDOES NOT Start With\n"+str);
            break;
            case 'e':
            System.out.println("Enter the substring to see if it is present in the ending of the string you entered earlier :-");
            str=sc.nextLine();
            System.out.println();
            c=s.endsWith(str);
            if (c==true)
            System.out.println(s+"\nEnds With\n"+str);
            else
            System.out.println(s+"\nDOES NOT End With\n"+str);
            break;
            default:
            System.out.println("Wrong Choice Entered!!\nTry Again.....");
            }
        }while (ch!='s' && ch!='e');
    }
}