//To print the series:- 2, 4, 8, 14, 22, 32,........ n terms
import java.util.*;
class Series8
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms :-");
        int n=sc.nextInt();
        int i,sum=2;
        for(i=0;i<=(n*2);i=i+2)
        {
            sum=sum+i;
            System.out.print(sum+", ");
        }
    }
}