class SelectionSorted_Array
{
    static void main(int num[])
    {
        int smallindex,swap=0;
        System.out.println("Unsorted array :-");
        for (int i=0;i<num.length;i++)
        System.out.print(num[i]+" ");
        for (int i=0;i<num.length-1;i++)
        {
            smallindex=i;
            for (int j=i+1;j<num.length;j++)
            {
                if (num[j]<num[smallindex])
                smallindex=j;
            }
            swap=num[i];
            num[i]=num[smallindex];
            num[smallindex]=swap;            
        }
        System.out.println("\nSelection Sorted Array =\n");
        for (int i=0;i<num.length;i++)
        System.out.print(num[i]+" ");
    }
}