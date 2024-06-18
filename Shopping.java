/**To calculate amount to be paid by a customer,
 * taking printed price as the input based on
 * 10%discount and 6%sales tax
 */
import java.util.*;
public class Shopping
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String name;
        int pp;//printed price
        double disc,a,st,amt;//st is sales tax
        System.out.println("WELCOME TO CAMERA STORE");
        System.out.println("Enter name of customer:-");
        name=sc.nextLine();
        System.out.println("Enter printed price of digital camera:-");
        pp=sc.nextInt();
        disc=pp*0.10;
        a=pp-disc;
        st=a*0.06;
        amt=a+st;
        System.out.println(name+" has to pay a total of Rs "+amt+" for the camera.");
    }
}
