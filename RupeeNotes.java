/*Program that displays
 * an amount as an input
 * in rupees in terms of notes
 * of different denominations.
 */
import java.util.*;
public class RupeeNotes
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int amt;
        System.out.println("TO CONVERT AMOUNT IN RUPEES TO TERMS OF NOTES OF DIFFERENT DENOMINATIONS");
        amt=sc.nextInt();
        int r2000=0,r500=0,r100=0,r50=0,r20=0,r10=0,r5=0,r2=0,r1=0;
        int bal;
        bal=amt;
        r2000=bal/2000;
        bal=bal%2000;
        r500=bal/500;
        bal=bal%500;
        r100=bal/100;
        bal=bal%100;
        r50=bal/50;
        bal=bal%50;
        r20=bal/20;
        bal=bal%20;
        r10=bal/10;
        bal=bal%10;
        r5=bal/5;
        bal=bal%5;
        r2=bal/2;
        bal=bal%2;
        r1=bal/1;
        System.out.println("Amount:-"+"\n"+amt);
        System.out.println("________________________________________________________________________");
        System.out.println("  NOTES             NUMBER");
        System.out.println("  2000                "+r2000);
        System.out.println("   500                "+r500);
        System.out.println("   100                "+r100);
        System.out.println("    50                "+r50);
        System.out.println("    20                "+r20);
        System.out.println("    10                "+r10);
        System.out.println("    5                 "+r5);
        System.out.println("    2                 "+r2);
        System.out.println("    1                 "+r1);
    }
}