/**One shopkeeper offers 30% discount while
 * the other shopkeeper offers 2 successive discounts
 * of 20% and 10% for same articles. Which is a better
 * offer for the customers
 */
import java.util.*;
public class Shopkeepers
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String name;
        int price;
        double disc1,disc2,disc3,pay1,a,pay2;
        System.out.println("Shopkeeper:-1 VS 2");
        System.out.println("Enter name of customer:-");
        name=sc.nextLine();
        System.out.println("Enter price of an article in both shops:-");
        price=sc.nextInt();
        disc1=price*0.30;
        pay1=price-disc1;
        disc2=price*0.20;
        a=price-disc2;
        disc3=a*0.10;
        pay2=a-disc3;
        if (pay1>pay2)
        System.out.println(name+", The first shopkeeper is giving a better offer!");
        else
        System.out.println(name+", The second shopkeeper is giving a better offer!");
    }
}
