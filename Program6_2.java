public class Program6_2
{
    static void checkEligibility(int age)
    {
        if (age < 18)
            throw new IllegalArgumentException("Age must be 18 or above to vote");
        System.out.println("Age " + age + " is eligible to vote.");
    }
 
    public static void main(String[] args)
    {
        int[] testAges = {20, 15, 18};
        for (int age : testAges)
        {
            System.out.println("Testing with age = " + age + ":");
            try
            {
                checkEligibility(age);
            }
            catch (IllegalArgumentException e)
            {
                System.out.println("Exception caught: " + e.getMessage());
            }
            finally
            {
                System.out.println("Validation process completed.");
            }
            System.out.println();
        }
    }
}
