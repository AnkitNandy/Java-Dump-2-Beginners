//To calculate volume and surface area of a sphere
import java.util.*;
public class sphere
{
    public static void main()
    {
        double r;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius of the sphere: ");
        r=sc.nextDouble();
        double vol,sa;
        vol=(4.0/3.0)*(22.0/7.0)*r*r*r;//volume of sphere
        sa=4.0*(22.0/7.0)*r*r;//surface area of sphere
        System.out.println("The volume of the sphere is: "+"\n"+vol);
        System.out.println("The surface area of the sphere is: "+"\n"+sa);
    }
}
        

