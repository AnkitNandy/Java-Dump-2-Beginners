class Repeat
{
    static void main(String s)
    {
        String s1="";
        int flag=0,index=0;
        for (int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            for (int j=i+1;j<s.length();j++)
            {
                if (ch != s.charAt(j))
                {
                    i=j;
                    i--;
                    break;
                }                
            }
            s1 = s1+ch;
        }
        System.out.println(s1);
    }
}