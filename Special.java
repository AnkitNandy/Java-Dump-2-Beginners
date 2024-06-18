/**Design a class Special with the following description:
 * int fact(int n) : to return the factorial of n
 * void printSpecial() : by invoking the function fact(),
 *                       print all special numbers between 
 *                       s(start limit) and L(last limit).
 *                       The function reads start(s) and
 *                       last(L) limits.
 *Write a function display() to input start and end limits by
 *invoking suitable functions and print special numbers between
 *start and end limits.
 *[ Hint :-
 *  If sum of factorials of each digit of a number is equal to
 *  the number itself, the number is special.
 *  Eg  145 = 1! + 4! + 5! = 1+24+120 = 145,
 *                                      145 is special number.]
 */
import java.util.*;
class Special
{
    static void display()
    {
        Scanner sc=new Scanner(System.in);
        Special obj=new Special();
        System.out.println("Enter the start limit:");
        int S=sc.nextInt();
        System.out.println("Enter the end limit:");
        int L=sc.nextInt();
        System.out.println("\nSpecial numbers from "+S+" and "+L+" :-");
        for (int i=S;i<=L;i++)
        {
            obj.printSpecial(i);
        }
    }
    void printSpecial(int num)
    {
        Special obj=new Special();
        int a=num,r,sum=0,d;
        while (a!=0)
        {
            d=a%10;
            r=obj.fact(d);
            sum=sum+r;
            a=a/10;
        }
        if (sum==num)
        System.out.println(num);
    }
    int fact(int n)
    {
        int f=1;
        for (int i=1;i<=n;i++)
        {
            f=f*i;
        }
        return f;
    }     
}    