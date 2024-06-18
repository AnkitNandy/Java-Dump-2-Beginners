/*Sum(S) = (1 + 2)/(1*2) + (1 + 2 + 3)/(1*2*3) + (1 + 2 + 3 + 4)/(1*2*3*4) + (1 + 2 + 3 + 4 +
 *         5)/(1*2*3*4*5) +.........,upto n terms
 */
public class Series16
{
    public static void main(int n)
    {
        int p=1,q=1;
        float s=0.0F;
        for (int i=1;i<=n;i++)
        {     
             p=p+(i+1);
             q=q*(i+1);
             s=s+(float)(p/q);
        }
        System.out.println("Sum ="+s);
    } 
}
