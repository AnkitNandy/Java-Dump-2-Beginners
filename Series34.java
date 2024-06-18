// S = 1 - a/2 + 3 - a/4 + 5 - a/6 +...... to 'n' terms
class Series34
{
    static void main(double a,int n)
    {
        double s=0.0;
        for (int i=1;i<=n;i++)
        {
            if (i%2!=0)
            s = s + i;
            else
            s = s - (double)a/i;
        }
        System.out.println("Sum of the Series : "+s);
    }
}