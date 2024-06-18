/**To display 4 food items of restaurant.
 * Accept the choice of food and quantity from user.
 * Compute & display amount to be paid with GST as 8%
 */
import java.util.*;
public class Restaurant
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Ankit Restaurant");
        System.out.println("1)Burger - Veg/Chicken/Mixed");
        System.out.println("2)Pizza - Small/Medium/Large");
        System.out.println("3)Cold Drinks - Pepsi/Sprite/Maaza");
        System.out.println("4)Dessert - Chocolate/Vanilla/Strawberry");
        System.out.println("5)Rice - Fried/Curd/Biriyani");
        System.out.println("GST=8%");
        String name;
        System.out.println("Name of the customer:-");
        name=sc.nextLine();
        int q;
        int a,b,c,d,e,f;
        double amt,fmt;
        System.out.println("Press 1 for burger,2 for pizza,3 for drinks,4 for dessert,5 for rice.");
        System.out.println("Enter your choice:-(you can enter 0 to exit restaurant)");
        a=sc.nextInt();
        switch(a)
        {
            case 0:
            System.exit(0);
            break;
            case 1:
            System.out.println("1)Burger - Rs 50/90/135");
            System.out.println("Press 1 for veg,2 for chicken,3 for mixed");
            System.out.println("Enter your choice:-");
            b=sc.nextInt();
            System.out.println("Enter its quantity:-");
            q=sc.nextInt();
            switch(b)
            {
                case 1:
                amt=(50*q)*0.08;
                fmt=(50*q)+amt;
                System.out.println();
                case 2:
                amt=(90*q)*0.08;
                fmt=(90*q)+amt;
                System.out.println();
                case 3:
                amt=(135*q)*0.08;
                fmt=(135*q)+amt;
                System.out.println("Please pay Rs "+fmt);
            }
            break;
            case 2:
            System.out.println("2)Pizza - Rs 350/480/600");
            System.out.println("Press 1 for small,2 for medium,3 for large");
            System.out.println("Enter your choice:-");
            c=sc.nextInt();
            System.out.println("Enter its quantity:-");
            q=sc.nextInt();
            switch(c)
            {
                case 1:
                amt=(350*q)*0.08;
                fmt=(350*q)+amt;
                System.out.println();
                case 2:
                amt=(480*q)*0.08;
                fmt=(480*q)+amt;
                System.out.println();
                case 3:
                amt=(600*q)*0.08;
                fmt=(600*q)+amt;
                System.out.println("Please pay Rs "+fmt);
            }
            break;
            case 3:
            System.out.println("3)Cold Drinks - Rs 30/45/40");
            System.out.println("Press 1 for pepsi,2 for sprite,3 for maaza");
            System.out.println("Enter your choice:-");
            d=sc.nextInt();
            System.out.println("Enter its quantity:-");
            q=sc.nextInt();
            switch(d)
            {
                case 1:
                amt=(30*q)*0.08;
                fmt=(30*q)+amt;
                System.out.println();
                case 2:
                amt=(45*q)*0.08;
                fmt=(45*q)+amt;
                System.out.println();
                case 3:
                amt=(40*q)*0.08;
                fmt=(40*q)+amt;
                System.out.println("Please pay Rs "+fmt);
            }
            break;
            case 4:
            System.out.println("4)Dessert - Rs 150/110/140");
            System.out.println("Press 1 for chocolate,2 for vanilla,3 for strawberry");
            System.out.println("Enter your choice:-");
            e=sc.nextInt();
            System.out.println("Enter its quantity:-");
            q=sc.nextInt();
            switch(e)
            {
                case 1:
                amt=(150*q)*0.08;
                fmt=(150*q)+amt;
                System.out.println();
                case 2:
                amt=(110*q)*0.08;
                fmt=(110*q)+amt;
                System.out.println();
                case 3:
                amt=(140*q)*0.08;
                fmt=(140*q)+amt;
                System.out.println("Please pay Rs "+fmt);
            }
            break;
            case 5:
            System.out.println("5)Rice - Rs 110/60/180");
            System.out.println("Press 1 for fried,2 for curd,3 for biriyani");
            System.out.println("Enter your choice:-");
            f=sc.nextInt();
            System.out.println("Enter its quantity:-");
            q=sc.nextInt();
            switch(f)
            {
                case 1:
                amt=(120*q)*0.08;
                fmt=(120*q)+amt;
                System.out.println();
                case 2:
                amt=(60*q)*0.08;
                fmt=(60*q)+amt;
                System.out.println();
                case 3:
                amt=(180*q)*0.08;
                fmt=(180*q)+amt;
                System.out.println("Please pay Rs "+fmt);
                break;
            }
            break;
            default:
            System.out.println("Wrong Choice!!");
            }
        System.out.println("THANK YOU!!"+"\n"+"Come Again.");
    }
}
            
        
            
            
            