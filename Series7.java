//To print the series:- 1, 2, 4, 7, 11, 16, 22, 29,.........n terms.
import java.util.*;
class Series7
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms :-");
        int n=sc.nextInt();
        System.out.println();
        int sum=1;
        int i=0;
        while(i<=n-1)
        {
            sum=sum+i;
            if (i==(n-1))
            System.out.print(sum+".");
            else
            System.out.print(sum+", ");
            i++;
        }
    }
}