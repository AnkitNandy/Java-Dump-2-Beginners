import java.util.*;
class Repetition_Remover
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word:");
        String s=sc.nextLine();
        s=s.trim();
        s=s+" ";
        String str="";
        for (int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if (ch == s.charAt(i+1))
            {
                str = str+"";
            }
            else
            {
                str=str+ch;
            }
        }
        System.out.println("New Word after removing all the repetitions:");
        System.out.println(str);
    }
}