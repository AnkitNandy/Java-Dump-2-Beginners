/**Enter a string and then
 * frame a word by joining
 * all the first characters
 * of each word. Finally,
 * display the new word.
 */
import java.util.*;
class ShortForm
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string to print its short form :-");
        String s=sc.nextLine();
        System.out.println();
        s=s.trim();
        s=" "+s;
        String str="";
        for (int i=0;i<s.length();i++)
        {
            if (s.charAt(i)==' ')
            str=str+(Character.toUpperCase(s.charAt(i+1)));
        }
        System.out.println("Short Form =\n"+str);
    }
}