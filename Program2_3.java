class Point 
{
    double x;
    double y;
    public Point() 
    {
        this.x = 5;
        this.y = 5;
    }
    public Point(double x, double y) 
    {
        this.x = x;
        this.y = y;
    }
    public Point(Point p) 
    {
        this.x = p.x;
        this.y = p.y;
    }
    void display() 
    {
        System.out.println("Point: (" + x + ", " + y + ")");
    }
}

public class Program2_3 
{
    public static void main(String args[]) 
    {
        Point p1 = new Point();
        System.out.println("Default constructor:");
        p1.display();
        
        Point p2 = new Point(10, 20);
        System.out.println("\nParameterized constructor:");
        p2.display();
        
        Point p3 = new Point(p2);
        System.out.println("\nCopy constructor:");
        p3.display();
    }
}
