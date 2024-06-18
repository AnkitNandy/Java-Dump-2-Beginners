import java.util.*;
class Search_Function
{
    void Search(int m[],int ns)
    {
        int pos=-1;
        for(int i=0;i<m.length;i++)
        {
            if (ns==m[i])
            {
                pos++;
                break;
            }
        }
        if (pos>-1)
        System.out.println("\nThe number "+ns+" is PRESENT in the given array.");
        else
        System.out.println("\nThe number "+ns+" is NOT PRESENT IN GIVEN ARRAY!!");
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int num[]=new int[10];
        System.out.println("Enter 10 integers line by line:");
        for (int i=0;i<10;i++)
        num[i]=sc.nextInt();
        System.out.println("\nEnter the number you want to search from your list:");
        int search=sc.nextInt();
        Search_Function obj = new Search_Function();
        obj.Search(num,search);
    }
}