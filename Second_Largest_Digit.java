/**To pass an integer as argument and
 * print the second largest digit.
 */
public class Second_Largest_Digit
{
    public static void main(int num)
    {
        int largest=0,secondlargest=0;
        int digit=0;
        while (num!=0)
        {
            digit=num%10;
            num=num/10;
            if (digit>largest)
            {
                secondlargest=largest;
                largest=digit;
            }
            else if (digit>=secondlargest && digit<=largest)
            secondlargest=digit;
        }
        System.out.println(secondlargest);
    }
}