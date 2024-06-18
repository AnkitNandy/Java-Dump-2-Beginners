/*Program that creates a Student class.
 * It has to store marks in three subjects,
 * total, average marks and
 * the marks percentage.
 */
import java.util.*;
public class Student
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int mark1,mark2,mark3,a,tmark;
        double avgmark,markper;
        System.out.println("TO STORE MARKS OF A STUDENT IN THREE SUBJECTS, CALCULATE TOTAL AND AVERAGE MARKS");
        System.out.println();
        System.out.println("Enter the total marks in each subject:-");
        a=sc.nextInt();
        System.out.println("Enter marks in three subjects line by line:-");
        mark1=sc.nextInt();
        mark2=sc.nextInt();
        mark3=sc.nextInt();
        if (mark1>a)
        System.out.println(mark1+" is wrong! It must be less than "+a+".");
        if (mark2>a)
        System.out.println(mark2+" is wrong! It must be less than "+a+".");
        if (mark3>a)
        System.out.println(mark3+" is wrong! It must be less than "+a+".");
        else
        {
        tmark=mark1+mark2+mark3;
        avgmark=tmark/3.0;
        markper=(tmark/(a*3.0))*100.0;
        System.out.println("Total Marks:-"+"\n"+tmark);
        System.out.println("Average Marks:-"+"\n"+avgmark);
        System.out.println("The total marks percentage:-"+"\n"+markper);
        }
    }
}