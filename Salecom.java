//Pg 449 -> Question 6
import java.util.*;
class Salecom
{
    double sale,com;
    Salecom(double s,double c)
    {
        sale=s;
        com=c;
    }
    void commission()
    {
        if (sale<=1000)
        com = (5.0/100.0)*sale;
        else if (sale<=2000)
        com = (10.0/100.0)*sale;
        else
        com = (15.0/100.0)*sale;
    }
    void display()
    {
        System.out.println("\nCommission = Rs."+com);
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Sale Value for which commission is to be paid:");
        double a = sc.nextDouble();
        Salecom obj = new Salecom(a,0);
        obj.commission();
        obj.display();
    }
}