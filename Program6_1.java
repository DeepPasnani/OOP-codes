public class Program6_1
{
	public static void main(String args[])
	{
		int n = Integer.parseInt(args[0]);
		int d = Integer.parseInt(args[1]);
		try 
		{
            int ans = n / d;
            System.out.println("Answer: " + ans);
        } 
		catch (ArithmeticException e)
		{
        	System.out.println("Error: Division by 0!");
        }
	}
}
