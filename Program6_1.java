public class Program6_1
{
    public static void main(String[] args)
    {
        try
        {
            if (args.length < 2)
                throw new ArrayIndexOutOfBoundsException("Two arguments required.");
            int numerator   = Integer.parseInt(args[0]);
            int denominator = Integer.parseInt(args[1]);
            System.out.println("Numerator: "   + numerator);
            System.out.println("Denominator: " + denominator);
            double result = (double) numerator / denominator;
            if (denominator == 0)
                throw new ArithmeticException("/ by zero");
            System.out.println("Result: " + result);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
        catch (NumberFormatException e)
        {
            System.out.println("NumberFormatException: Invalid number format in argument.");
        }
        catch (ArithmeticException e)
        {
            System.out.println("ArithmeticException: " + e.getMessage());
        }
    }
}
