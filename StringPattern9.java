/**         A
 *        A B
 *      A B C
 *    A B C D
 *  A B C D E
 */
class StringPattern9
{
    static void main()
    {
        for (char i='A';i<='E';i++)
        {
            for (char k='E';k>i;k--)
            {
                System.out.print("  ");
            }
            for (char j='A';j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}