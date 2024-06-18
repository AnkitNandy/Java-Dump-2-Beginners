/**An interesting method of multiplication of integers(not very large
 * numbers) is illustrated by the following example. If the numbers 17 and
 * 19 are to be multiplied, they are put at the top of two columns as shown
 * below: 17   19.
 * The numbers at the left-hand side is successively divided by 2 (integer
 * division) while the other is successively multiplied by 2. The results are
 * written one below the other in their respective columns. The process is
 * repeated till the column containing the division results reached 1. At this
 * stage all the numbers in the right-hand column are struck off where
 * numbers corressponding to them on the left-hand column are even.
 *    17                      19
 * _______________________________
 * 8(even)                    38
 * 4(even)                    76
 * 2(even)                    152
 * 1                          304
 * Now the remaining numbers on the right-hand side are added:
 * 19+304 = 323, which is equal to the product of 17 and 19.
 * Write a program to input 2 integers and using the above method, 
 * find their product.
 */
import java.util.*;
public class Special_Multiplication
{
    public static void main()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter two integers to find their product by special multiplication :-");
        int a=scan.nextInt();
        int b=scan.nextInt();
        int num1=a,num2=b;
        System.out.println();
        System.out.println(num1+"\t\t"+num2);
        System.out.println("________|_________");
        while (a!=1)
        {
            a=a/2;
            b=b*2;
            System.out.println(a+"\t|\t"+b);
        }
        System.out.println();
        System.out.println("PRODUCT :-");
        System.out.println(num2+" + "+b+" =");
        int result=num2+b;
        System.out.println("----> "+result+"."+"\n"+"THE END OF SPECIAL MULTIPLICATION!!!");
    }
}