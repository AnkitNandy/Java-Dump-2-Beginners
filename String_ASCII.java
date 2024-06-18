/**Accept a word and display the 
 * ascii value of each character.
 */
import java.util.*;
class String_ASCII
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word :-");
        String s=sc.nextLine();
        s=s.trim();
        System.out.println();
        char c;
        for (int i=0;i<s.length();i++)
        {
            c=s.charAt(i);
            if (c==' ')
            {
                System.out.println("You must enter only one word !!\nTry Again....");
                System.exit(0);
            }
        }
        for (int i=0;i<s.length();i++)
        {
            c=s.charAt(i);
            System.out.println("ASCII of '"+c+"' = "+(int)(c));
        }
    }
}