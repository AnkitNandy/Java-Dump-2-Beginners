/**C L A S S
 * C L A S
 * C L A
 * C L
 * A
 */
class StringPattern4
{
    static void main()
    {
        String s="CLASS";
        for (int i=s.length()-1;i>=0;i--)
        {
            for (int j=0;j<=i;j++)
            {
                System.out.print(s.charAt(j)+" ");
            }
            System.out.println();
        }
    }
}