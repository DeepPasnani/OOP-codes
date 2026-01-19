import java.util.*;
public class Program1_4
{
    public static void main(String args[])
    {
        double p, i, k, m, BMI;
        System.out.println("Enter ypur wight in pounds: ");
        Scanner s1 = new Scanner(System.in);
        p = s1.nextDouble();
        System.out.println("Enter your height in inches: ");
        i = s1.nextDouble();
        k = p * 0.45359237;
        m = i * 0.0254;
        BMI = k/(m * m);
        System.out.println("Your BMI is: " + BMI);
    }
}
