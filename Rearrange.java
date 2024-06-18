import java.io.*;
class Rearrange
{
    String txt;
    String cxt;
    int len;
    Rearrange()
    {
        txt="";
        cxt="";
        len=0;
    }
    void readword()throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a word in uppercase:");
        txt=buf.readLine();
    }
    void convert()
    {
        int i,cnt=0;
        char c;
        len=txt.length();
        for (i=0;i<len;i++)
        {
            c=txt.charAt(i);
            if (i==0)
            {
                if (c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
                {
                    cxt=txt+"Y";
                    cnt++;
                    break;
                }
            }
            else
            {
                if (c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
                {
                    cxt=txt.substring(i,txt.length())+txt.substring(0,i);
                    cnt++;
                    break;
                }
            }
        }
        if (cnt==0)
        cxt=txt+"N";
    }
    void display()
    {
        System.out.println("\nOriginal Word : "+txt);
        System.out.println("\nChanged Word : "+cxt);
    }
    public static void main()throws IOException
    {
        Rearrange obj=new Rearrange();
        obj.readword();
        obj.convert();
        obj.display();
    }
}