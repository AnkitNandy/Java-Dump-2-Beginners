//To use the replace() function of the string
import java.io.*;
class Replace
{
    static void main()throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string :-");
        String s=buf.readLine();
        System.out.println();
        System.out.println("Enter the part of the string which you want to replace :-");
        String s1=buf.readLine();
        System.out.println("Enter the string or character which will replace "+s1+" :-");
        String s2=buf.readLine();
        System.out.println();
        System.out.println(s.replace(s1,s2));
    }
}