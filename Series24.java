/**Using switch statement, Write a menu driven
 * program to perform the following:
 * 
 * a) To print sum of series S = 1 + (2 square/2) + (3 square/3)
 *                               + (4 square/4) +........(n square/n)
 *    
 * b) To print the sum of te series:
 *    S = 1/2 + 3/4 + 5/6 + 7/8 +.....+19/20.
 */
import java.util.*;
class Series24
{
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press '1' to find the sum of the first series");
        System.out.println("S = 1 + (2 square/2) + (3 square/3) + ......(n square/n)");
        System.out.println("\nPress '2' to find the sum of the second series");
        System.out.println("S = 1/2 + 3/4 + 5/6 + 7/8 +.....+19/20.");
        System.out.println("\nEnter your choice:");
        int ch = sc.nextInt();
        switch (ch)
        {
            case 1:
            int s1=1;
            System.out.println("\nEnter the value of 'n' for the first series:");
            int n = sc.nextInt();
            for (int i=2;i<=n;i++)
            {
                s1 = s1 + ((i*i)/i);
            }
            System.out.println("\nSum of the first series = "+s1);
            break;
            case 2:
            double s2 = 0.0;
            for (int i=1;i<=19;i++)
            {
                s2 = s2 + (i/(i+1));
            }
            System.out.println("Sum of the second series = "+s2);
            break;
            default:
            System.out.println("Wrong Choice Entered!!");
        }
    }
}