import java.util.*;
class ReverseSentence
{
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence to reverse it:");
        String s = sc.nextLine();
        s = s.trim();        
        System.out.print("\nNew Reversed Sring:  ");
        String st="";
        for (int i=0;i<s.length();i++)
        st = s.charAt(i) + st;
        st = st+" ";
        String str="",result="";
        for (int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            if (ch!=' ')
            str=ch+str;
            else
            {
                result = result+" "+str;
                str="";
            }
        }
        System.out.println(result);
    }
}