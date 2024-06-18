/**Shasha Travels Pvt.Ltd gives the foloowing discount:-
 *        TICKET AMOUNT          DISCOUNT
 *       Above Rs.70000             18 %
 *     Rs.55001 to Rs.70000         16 %
 *     Rs.25001 to Rs.35000         12 %
 *     Rs.25001 to Rs.35000         10 %
 *     Less than Rs.25001            2 %
 *Input name and ticket amount for the customer(s)
 *and calculate the discount amount and et amount 
 *to be paid in a well-defined format.
 */
import java.util.*;
public class ShashaTravels_Pvt_Ltd
{
    static int noc=15,i,amt;
    static double disc=0,netamt=0;
    static String name;
    public static void main()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("WELCOME TO SHASHA TRAVELS PVT.LTD");
        System.out.println("There are 15 customers.");
        for(i=1;i<=noc;i++)
        {
            System.out.println("Enter the name of customer "+i+" :-");
            name=scan.next();
            System.out.println("Enter the ticket amount for "+name+" :-");
            amt=scan.nextInt();
            if (amt>70000)
            disc=amt*18/100;
            else if (amt>=55001&&amt<=70000)
            disc=amt*16/100;
            else if (amt>=35001&&amt<=55000)
            disc=amt*12/100;
            else if (amt>=25001&&amt<=35000)
            disc=amt*10/100;
            else
            disc=amt*2/100;
            netamt=amt-disc;
            System.out.println("SL.NO.        NAME        TICKET AMOUNT        DISCOUNT AMOUNT        NET AMOUNT");
            System.out.println(" "+i+"          "+name+"         Rs."+amt+"                  Rs."+disc+"             Rs."+netamt);
        }
    }
}