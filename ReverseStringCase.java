import java.util.*;
class ReverseStringCase
{
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        s=s.trim();
        String str="";
        for (int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if (Character.isUpperCase(c))
            str=str+(Character.toLowerCase(c));
            else
            str=str+(Character.toUpperCase(c));
        }
        System.out.println("\n"+str);
    }
}