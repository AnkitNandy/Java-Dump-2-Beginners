/** B L U E J
 *    B L U E
 *      B L U
 *        B L
 *          U
 */
class Series30
{
    public static void main()
    {
        String s = "BLUEJ";
        int p=0;
        for (int i=s.length()-1;i>=0;i--)
        {
            for (int k=1;k<=p;k++)
            System.out.print(" ");
            for (int j=0;j<=i;j++)
            System.out.print(s.charAt(j)+" ");
            System.out.println();
            p+=2;
        }
    }
}