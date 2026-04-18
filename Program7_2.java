public class Program7_2
{
    public static void main(String[] args) throws InterruptedException
    {
        Thread t1 = new Thread(() ->
        {
            for (int i = 1; i <= 100; i++)
                System.out.println("T1: " + i);
        });
 
        Thread t2 = new Thread(() ->
        {
            for (int i = 101; i <= 200; i++)
                System.out.println("T2: " + i);
        });
 
        Thread t3 = new Thread(() ->
        {
            for (int i = 201; i <= 300; i++)
                System.out.println("T3: " + i);
        });
 
        t1.start(); t1.join();
        t2.start(); t2.join();
        t3.start(); t3.join();
        System.out.println("All threads completed.");
    }
}
