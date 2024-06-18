/**A B C D E
 *   B C D E
 *     C D E
 *       D E
 *         E
 */
class StringPattern7
{
    static void main()
    {
        for (char i='A';i<='E';i++)
        {
            for (int k='A';k<i;k++)
            {
                System.out.print("  ");
            }
            for (char j=i;j<='E';j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}