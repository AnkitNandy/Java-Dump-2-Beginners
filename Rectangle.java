/**A program that implements a rectangle class.
 * The class has fields: 
 * 'ength, breadth, area, and perimeter.
 * It must obtain values of length and breadth,
 * to calculate area and to calculate perimeter.
 */
import java.util.*;
public class Rectangle
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("TO CALCULATE THE AREA AND PERIMETER OF A RECTANGLE??");
        System.out.println();
        int choice;
        float length,breadth;
        double area=0.0,perimeter=0.0;
        System.out.println("Given, Rectangle.");
        System.out.println("Enter length of rectangle:-");
        length=sc.nextFloat();
        System.out.println("Enter breadth of rectangle:-");
        breadth=sc.nextFloat();
        area=length*breadth;
        perimeter=2.0*(length+breadth);
        System.out.println();
        System.out.println("1. Area"+"\n"+"2. Perimeter"+"\n"+"3. Both of them");
        System.out.println("Enter your choice out of 1,2 and 3:-");
        choice=sc.nextInt();
        switch(choice)
        {
            case 1:
            System.out.println("Area??");
            System.out.println("Area of the rectangle:-"+"\n"+area+" square unit.");
            break;
            case 2:
            System.out.println("Perimeter??");
            System.out.println("Perimeter of the rectangle:-"+"\n"+perimeter+" square unit.");
            break;
            case 3:
            System.out.println("Area and Perimeter??");
            System.out.println("Area of the rectangle:-"+"\n"+area+" square unit.");
            System.out.println();
            System.out.println("Perimeter of the rectangle:-"+"\n"+perimeter+" square unit.");
            break;
            default:
            System.out.println("Wrong Choice Entered!!");
            System.out.println("You must enter either 1, 2 or 3.");
        }
    }
}
        