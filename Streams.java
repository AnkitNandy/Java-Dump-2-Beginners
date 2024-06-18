/**St.Xavier's School regards admission in Std.XI 
 * for choosing different streams.It is according to 
 * marks obtained in english, maths and science.
 * Print the appropriate stream.
 * Eng,maths&science>=80% - pure science
 * Eng&science>=80%,maths>=60% - Bio.Science
 * Eng,maths&science>=60% - Commerce
 */
import java.util.*;
public class Streams
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int maths,science,eng;
        String name;
        System.out.println("Enter name of candidate:-");
        name=sc.nextLine();
        System.out.println("Total marks=80");
        System.out.println("Enter marks in maths,science and english:-");
        maths=sc.nextInt();
        science=sc.nextInt();
        eng=sc.nextInt();
        double mathper,sciper,engper;
        mathper=(maths/80.0)*100.0;
        sciper=(science/80.0)*100.0;
        engper=(eng/80.0)*100.0;
        if (mathper>=0.80&&sciper>=0.80&&engper>=0.80)
        System.out.println(name+":-Stream - Pure Science.");
        if (mathper>=0.60&&engper>=0.80&&sciper>=0.80)
        System.out.println(name+":-Stream - Bio. Science.");
        if (engper>=0.60&&mathper>=0.60&&sciper>=0.60)
        System.out.println(name+":-Stream - Commerce.");
        if (engper<=0.60&&mathper<=0.60&&sciper<=0.60)
        System.out.println("Sorry, no stream for "+name);
    }
}