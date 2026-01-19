import java.util.*;
public class Program1_1
{
public static void main(String args[])
{
    int a;
    System.out.println("Enter the numnber to convert into feet: ");
    Scanner s1 = new Scanner(System.in);
    a = s1.nextInt();
    System.out.println("The number in feet is: " + a * 3.28084);
}
}
