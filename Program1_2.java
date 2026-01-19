import java.util.*;
public class Program1_2
{
    public static void main(String args[])
    {
        int a, b, c, d, e, f;
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter coefficient a: ");
        a = s1.nextInt();
        System.out.print("Enter coefficient b: ");
        b = s1.nextInt();
        System.out.print("Enter coefficient e: ");
        e = s1.nextInt();
        System.out.print("Enter coefficient c: ");
        c = s1.nextInt();
        System.out.print("Enter coefficient d: ");
        d = s1.nextInt();
        System.out.print("Enter coefficient f: ");
        f = s1.nextInt();
        int denominator = (a * d) - (b * c);
        if (denominator == 0) 
        {
            System.out.println("Error: Division by zero.");
            return;
        }
        double x = (double) ((e * d) - (b * f)) / denominator;
        double y = (double) ((a * f) - (e * c)) / denominator;
        System.out.println("Solution:");
        System.out.println("x = " + x + "y = " + y);
    }
}