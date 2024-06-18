import java.util.*;
class ReverseTitleCase
{
    void Change(String str)
    {
        str=str.trim();
        str=" "+str;
        System.out.println("\nFirst character of each word with reversed case:");
        for (int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if (ch==' ')
            {
                if (Character.isLowerCase(str.charAt(i+1)))
                System.out.println(Character.toUpperCase(str.charAt(i+1)));
                else
                System.out.println(Character.toLowerCase(str.charAt(i+1)));
            }
        }
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        ReverseTitleCase obj = new ReverseTitleCase();
        obj.Change(s);
    }
}