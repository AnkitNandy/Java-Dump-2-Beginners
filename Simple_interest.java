/*This Java program is to accept the principle amount, rate
  of interest and time. We are computing and displaying the
  simple interest*/
  public class Simple_interest
  {
      public static void main (double p,int t,double r)
      {
          double interest;
          interest = (p*r*t)/100;
          System.out.print("Simple interest for principle "+p);
          System.out.print(", rate of interest "+r);
          System.out.print(" and time period "+t);
          System.out.println(" is:-");
          System.out.println(+interest);
        }
    }
          
          