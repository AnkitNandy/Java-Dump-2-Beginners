/**Design a class Stringfun to overload a function
 * change() as follows.
 * (i) void change(String s) - with one string 
 *                             argument that
 *                             changes the string
 *                             to uppercase.
 *(ii) void change(String s,char c) - with two
 *                                    arguments
 *                                    that replaces 
 *                                    the vowels
 *                                    in the string s
 *                                    with the 
 *                                    character stored
 *                                    in c.
 *(iii)void change(String s1,String s2) - with two
 *                                        arguments
 *                                        that interchanges
 *                                        the values of both 
 *                                        strings.
 */
import java.util.*;
class Stringfun
{
    void change(String s)
    {
        s=s.toUpperCase();
        System.out.println("Given string in Uppercase :\n"+s);
    }
    void change(String s,char c)
    {
        String str="";
        for (int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if (ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u')
            str=str+c;
            else
            str=str+ch;
        }
        System.out.println("New String after replacing the vowels:\n"+str);
    }
    void change(String s1,String s2)
    {
        System.out.println("First string : \n"+s1);
        System.out.println("Second string :\n"+s2);
        String swap=s1;
        s1=s2;
        s2=swap;
        System.out.println("Replaced Strings:-");
        System.out.println("First String :\n"+s1);
        System.out.println("Second String :\n"+s2);
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        Stringfun obj=new Stringfun();
        System.out.print("Enter a string:");
        String a=sc.nextLine();
        obj.change(a);
        System.out.print("\nEnter a string:");
        String b=sc.nextLine();
        System.out.print("\nEnter a character:");
        char m=sc.next().charAt(0);
        obj.change(b,m);
        System.out.print("\nEnter first string argument:");
        String x=sc.nextLine();
        sc.nextLine();
        System.out.print("\nEnter second string argument:");
        String y=sc.nextLine();
        obj.change(x,y);
    }
}