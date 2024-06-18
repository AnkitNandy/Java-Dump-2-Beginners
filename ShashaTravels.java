/**Shasha Travels Pvt.Ltd. gives these discounts to its customers:
 *        TICKET AMOUNT                 DISCOUNT
 *       Above Rs 70000                    18%
 *      Rs 55001 to Rs 70000               16%
 *     Rs 35001 to Rs 55000                12%
 *     Rs 25001 to Rs 35000                10%
 *      Less Than Rs 25001                  2%
 * Write a program to input the name and ticket amount for
 * the customer and calculate the discount amount and
 * net amount to be paid. Display the output in the following
 * format for each customer:
 *    Name             Ticket Charges         Discount            Net Charges
 */
import java.util.*;
public class ShashaTravels
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String name;
        double ticamt,disc=0,netamt=0;
        System.out.println("Shasha Travels Pvt.Ltd. gives these discounts to its customers:");
        System.out.println("        TICKET AMOUNT                 DISCOUNT");
        System.out.println("        Above Rs 70000                    18%");
        System.out.println("       Rs 55001 to Rs 70000               16%");
        System.out.println("      Rs 35001 to Rs 55000                12%");
        System.out.println("      Rs 25001 to Rs 35000                10%");
        System.out.println("       Less Than Rs 25001                  2%");
        System.out.println("DISPLAY THE NET AMOUNT AND THE DISCOUNT AMOUNT");
        System.out.println();
        System.out.println("Enter the name of the customer:-");
        name=sc.nextLine();
        System.out.println("Enter the ticket amount:-(in Rs)");
        ticamt=sc.nextDouble();
        System.out.println("Discount Amount and Net Amount?????");
        System.out.println();
        if (ticamt>70000)
        {
            disc=ticamt*0.18;
            netamt=ticamt-disc;
        }
        if (ticamt>55000&&ticamt<=70000)
        {
            disc=ticamt*0.16;
            netamt=ticamt-disc;
        }
        if (ticamt>35000&&ticamt<=55000)
        {
            disc=ticamt*0.12;
            netamt=ticamt-disc;
        }
        if (ticamt>25000&&ticamt<=35000)
        {
            disc=ticamt*0.10;
            netamt=ticamt-disc;
        }
        if (ticamt>0&&ticamt<=25000)
        {
            disc=ticamt*0.02;
            netamt=ticamt-disc;
        }
        if (ticamt<=0)
        System.out.println("Ticket amount cannot be less than Rs 1."+"\n"+"Wrong amount entered");
        System.out.println("       NAME           TICKET CHARGES             DISCOUNT           NET AMOUNT");
        System.out.println("      "+name);
        System.out.println("                      Rs."+ticamt);
        System.out.println("                                               Rs."+disc);
        System.out.println("                                                                   Rs."+netamt);
    }
}