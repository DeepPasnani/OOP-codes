public class Program7_1
{
    public static void main(String[] args)
    {
        Thread t1 = new Thread(() ->
        {
            for (int i = 1; i <= 10; i++)
            {
                System.out.println("Thread-1: " + i);
                try { Thread.sleep(1000); }
                catch (InterruptedException e) { e.printStackTrace(); }
            }
        });
 
        Thread t2 = new Thread(() ->
        {
            for (int i = 11; i <= 20; i++)
            {
                System.out.println("Thread-2: " + i);
                try { Thread.sleep(500); }
                catch (InterruptedException e) { e.printStackTrace(); }
            }
        });
 
        t1.start();
        t2.start();
    }
}
