/**WAP in Java to accept a string as:
 * "IF IT RAINS, YOU WILL NOT GO TO PLAY"
 * Convert all characters of the words in lowercase
 * other than the first character so as to obtain
 * the following output.
 * Sample Output : If It Rains, You Will Not
 *                 Go To Play
 */
import java.util.*;
class StringFunction1
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        System.out.println("\nOutput :");
        s=s.trim();
        s=" "+s;
        String str="";
        for (int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if (ch==' ')
            {
                char ch1=s.charAt(i+1);
                str=str+" "+Character.toUpperCase(ch1);
                i++;
            }
            else
            str=str+Character.toLowerCase(ch);            
        }
        System.out.println(str);
    }
}