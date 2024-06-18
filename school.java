class school
{
    int book;
    static int pencil;
    void increment()
    {
        book = book+1;
        pencil = pencil+1;
    }//end of increment
    public static void main()
    {
        school g1 = new school();
        school g2 = new school();
        school g3 = new school();
        g1.increment();
        System.out.println("Saina has "+g1.book+" book(s) & "+g1.pencil+" pencil(s)");
        g2.increment();
        System.out.println("Anna has "+g2.book+" book(s) & "+g2.pencil+" pencil(s)");
        g3.increment();
        System.out.println("Tina has "+g3.book+" book(s) & "+g3.pencil+" pencil(s)");
    }//end of main
}