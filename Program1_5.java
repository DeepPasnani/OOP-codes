import java.util.*;
public class Program1_5
{
    public static void main(String args[])
    {
        int a;
        System.out.println("Enter the amount to withdraw: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        int h = a/100;
        int f = (a%100)/50;
        int t = ((a%100)%50)/10;
        System.out.println("The number of 100 Rs notes: " + h);
        System.out.println("The number of 50 Rs notes: " + f);
        System.out.println("The number of 10 Rs notes: " + t);
    }
}
