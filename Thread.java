public class Thread 
{
    private int count = 0;

    private synchronized void increment() 
    {
        count++;
    }

    private synchronized int getCount() 
    {
        return count;
    }

    private class Worker implements Runnable 
    {
        private final int iterations;

        private Worker(int iterations) 
        {
            this.iterations = iterations;
        }

        @Override
        public void run() 
        {
            for (int i = 0; i < iterations; i++) 
            {
                increment();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException 
    {
        Thread demo = new Thread();

        java.lang.Thread t1 = new java.lang.Thread(demo.new Worker(10000));
        java.lang.Thread t2 = new java.lang.Thread(demo.new Worker(10000));

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final count: " + demo.getCount());
    }
}
