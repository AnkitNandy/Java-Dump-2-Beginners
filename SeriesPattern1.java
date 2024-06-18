/**L
 * AL
 * IAL
 * RIAL
 * TRIAl
 */
class SeriesPattern1
{
    static void main()
    {
        String s="TRIAL";
        for (int i=s.length()-1;i>=0;i--)
        {
            for (int j=i;j<s.length();j++)
            {
                char ch=s.charAt(j);
                System.out.print(ch);  
            }
            System.out.println();
        }
    }
}