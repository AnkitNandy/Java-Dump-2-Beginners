/**Accept the city names and
 * arrange them in ascending order
 * using selection sort technique.
 */
import java.util.*;
class SelectionSortedCities
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        String n[]=new String[5];
        System.out.println("Enter the names of five cities :-");
        for (int i=0;i<5;i++)
        {
            n[i]=sc.nextLine();
        }
        String swap="";
        int smallindex=0;
        for (int i=0;i<4;i++)
        {
            smallindex=i;
            for (int j=i+1;j<5;j++)
            {
                if (n[j].compareTo(n[smallindex])<0) 
                smallindex=j;                
            }
            swap=n[i];
            n[i]=n[smallindex];
            n[smallindex]=swap;
        }
        System.out.println("\nCity names in alphabetical order:");
        for (int k=0;k<5;k++)
        {
            System.out.println(n[k]);
        }
    }
}