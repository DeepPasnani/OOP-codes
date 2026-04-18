import java.util.*;
 
class Box<T>
{
    private ArrayList<T> items = new ArrayList<>();
    public void addItem(T item) { items.add(item); }
    public void display()
    {
        for (T item : items) System.out.println(item);
    }
}
 
public class Program9_3
{
    public static void main(String[] args)
    {
        Box<String> stringBox = new Box<>();
        stringBox.addItem("Alice");
        stringBox.addItem("Bob");
        stringBox.addItem("Charlie");
        System.out.println("String Box contents:");
        stringBox.display();
        Box<Integer> intBox = new Box<>();
        intBox.addItem(101);
        intBox.addItem(102);
        intBox.addItem(103);
        System.out.println("\nInteger Box contents:");
        intBox.display();
    }
}
