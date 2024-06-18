import java.util.*;
class SelectionSorted_Marks
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int N=sc.nextInt();
        String name[] = new String[N];
        int m[] = new int[N];
        System.out.println("\nEnter the name of "+N+" students and");
        System.out.println("their marks line by line :-");
        for (int i=0;i<N;i++)
        {
            name[i] = sc.next();
            m[i] = sc.nextInt();
            System.out.println();
        }
        int smallindex=0;
        String swap="";
        for (int i=0;i<N-1;i++)
        {
            smallindex=i;
            for (int j=i+1;j<N;j++)
            {
                if (name[j].compareTo(name[smallindex]) < 0)
                smallindex = j;
            }
            swap = name[i];
            name[i] = name[smallindex];
            name[smallindex]=swap;
        }
        System.out.println("\n        BETHANY INSTITUTIONS");
        System.out.println("SL.NO    NAME OF STUDENTS     TOTAL MARKS");
        for (int i=0;i<N;i++)
        {
            System.out.println("  "+i+"         "+name[i]+"               "+m[i]);
        }
    }
}