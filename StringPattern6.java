/**A B C D E
 * A B C D A 
 * A B C A B
 * A B A B C
 * A A B C D
 */
class StringPattern6
{
    static void main()
    {
        char i,j;
        for (i='E';i>='A';i--)
        {
            for (j='A';j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
                