/**Mr.A.P.Singh is a software engineer.
 * He pays annual tax.
 * Upto Rs 250000 - No Tax
 * Rs 250001 to 500000 - 10% of amt exceeding Rs 250000
 * Rs 500001 to 1000000 - Rs 10000+20% of amt exceeding Rs 250000
 * Above Rs 1000000 - Rs 25000+30% of amt exceeding Rs 1000000
 */
import java.util.*;
public class SalaryTax
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        double annsalary;
        System.out.println("Enter Mr.A.P.Singh's Annual Salary:-");
        annsalary=sc.nextDouble();
        double t=0;
        if (annsalary<=250000)
        
            t=(0.0/100.0)*annsalary;
        
        else if (annsalary>=250001&&annsalary<=500000)
        
            t=(10.0/100.0)*(annsalary-250000);
        
        else if (annsalary>=500001&&annsalary<=1000000)
        
            t=10000+(20.0/100.0)*(annsalary-500000);
        
        else if (annsalary>=1000000)
        
            t=25000+(30.0/100.0)*(annsalary-1000000);
        System.out.println("Tax="+t);
    }
}
        