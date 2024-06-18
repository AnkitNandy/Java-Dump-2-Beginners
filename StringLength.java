//To find the length of a string entered by the user
import java.util.*;
public class StringLength
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String str;
        System.out.println("Enter a string of your choice to find its length:-");
        str=sc.nextLine();
        int length=str.length();
        System.out.println();
        System.out.println("Length of the given string:-");
        System.out.println(length+" characters.");
    }
}