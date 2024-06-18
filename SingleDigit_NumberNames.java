/*Program that receives a single digit number
 * from the user and displays
 * it in words.
 * E.G.If the number passed
 * is 4, it prints four.
 */
import java.util.*;
public class SingleDigit_NumberNames
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("TO CONVERT A SINGLE-DIGIT NUMBER INTO WORDS");
        System.out.println();
        System.out.println("Enter a single digit number here:-");
        num=sc.nextInt();
        switch(num)
        {
            case 0:
            System.out.println("ZERO");
            break;
            case 1:
            System.out.println("ONE");
            break;
            case 2:
            System.out.println("TWO");
            break;
            case 3:
            System.out.println("THREE");
            break;
            case 4:
            System.out.println("FOUR");
            break;
            case 5:
            System.out.println("FIVE");
            break;
            case 6:
            System.out.println("SIX");
            break;
            case 7:
            System.out.println("SEVEN");
            break;
            case 8:
            System.out.println("EIGHT");
            break;
            case 9:
            System.out.println("NINE");
            break;
            default:
            System.out.println("Wrong Choice Entered!!"+"\n"+"You must enter a single-digit number from 0 to 9");
        }
    }
}