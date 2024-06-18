/**E D C B A
 *   E D C B
 *     E D C
 *       E D
 *         E
 */
class StringPattern8
{
    static void main()
    {
        for (char i='A';i<='E';i++)
        {
            for (char k='A';k<i;k++)
            {
                System.out.print("  ");
            }
            for (char j='E';j>=i;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}