/* 145 is special number because
 * 1! + 4! + 5! = 1 + 24 + 120 = 145
 */
import java.util.*;
class Special_Number
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        System.out.println();
        int f=1,d=0,s=0;
        int n=num;
        while (n!=0)
        {
            f=1;
            d = n%10;
            for (int i=1;i<=d;i++)
            f*=i;
            s = s+f;
            n = n/10;
        }
        if (s==num)
        System.out.println(num+" IS A SPECIAL NUMBER.");
        else
        System.out.println(num+" is NOT a Special Number !!");
    }
}