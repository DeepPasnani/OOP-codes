class Rectangle 
{
    private double width = 1;
    private double height = 1;
    
    public Rectangle() {}
    
    public Rectangle(double width, double height) 
    {
        this.width = width;
        this.height = height;
    }
    
    public double getArea() 
    {
        return width * height;
    }
    
    public double getPerimeter() 
    {
        return 2 * (width + height);
    }
}

public class Program2_1 
{
    public static void main(String[] args) 
    {
        Rectangle r1 = new Rectangle();
        System.out.println("Rectangle using No-Argument Constructor: ");
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());
        
        Rectangle r2 = new Rectangle(4, 5);
        System.out.println("Rectangle using Parameterized Constructor: ");
        System.out.println("Area: " + r2.getArea());
        System.out.println("Perimeter: " + r2.getPerimeter());
    }
}