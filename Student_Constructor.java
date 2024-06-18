/**Define a class called Student to check whether a Student is eligible
 * for admission in class Std.XI with the following specifications:
 * 
 * Instance Variables/Data members:-
 * String name : to store Name
 * int mm : to store Maths mark
 * int scm : to store Science mark
 * int comp : to store Computer mark
 * 
 * Methods:-
 * Student_Constructor() : parameterized constructor to initialize the data members
 *             by accepting details of a Student_Constructor
 * check() : to check the eligibility for course with these conditions....
 * 
 *                  MARKS                                       ELIGIBITY
 *      90% or more in all the subjects                   Science With Computer
 *        Average Marks 90% or more                           Bio - Science
 * Average Marks 80% or more and less than 90%              Science With Hindi
 * 
 * display() : to print the eligibility
 * 
 * Write the main method to create an object of a class and call all the 
 * above member methods.
 */
import java.util.*;
class Student_Constructor
{
    static String name;
    static int mm,scm,comp;
    Student_Constructor(String n,int maths,int science,int computer)
    {
        name = n;
        mm = maths;
        scm = science;
        comp = computer;
    }
    int check()
    {
        double p = ((mm + scm + comp)/300.0)* 100;
        double avg = (mm + scm + comp)/3.0;
        double avgper = (avg/300.0) * 100;
        if (p>=90)
        return 1;
        else if (avg>=90)
        return 2;
        else if (avg>=80 && avg<90)
        return 3;
        else
        return 4;
    }
    void display()
    {
        int d = check();
        if (d == 1)
        System.out.println("\nEligibility is Science With Computer.");
        else if (d == 2)
        System.out.println("\nEligibility is Bio - Science.");
        else if (d == 3)
        System.out.println("\nEligibility is Science With Hindi.");
        else
        System.out.println("\nSorry, No eligibility for the Student_Constructor found!!");
    }
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the Student_Constructor:");
        name = sc.next();
        System.out.println("\nTotal Marks is 100 for each subject.");
        System.out.println("\nEnter marks scored in Maths:");
        mm = sc.nextInt();
        System.out.println("Enter marks scored in Science:");
        scm = sc.nextInt();
        System.out.println("Enter marks scored in Computer:");
        comp = sc.nextInt();
        Student_Constructor obj = new Student_Constructor(name,mm,scm,comp);
        obj.check();
        obj.display();
    }
}