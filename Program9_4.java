import java.util.*;
 
public class Program9_4
{
    static <T> boolean searchElement(LinkedList<T> list, T element)
    {
        return list.contains(element);
    }
 
    public static void main(String[] args)
    {
        LinkedList<Integer> rollNos = new LinkedList<>(
            Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Searching in Integer LinkedList " + rollNos + ":");
        System.out.println("Search 3  -> Found: " + searchElement(rollNos, 3));
        System.out.println("Search 10 -> Found: " + searchElement(rollNos, 10));
        LinkedList<String> names = new LinkedList<>(
            Arrays.asList("Alice", "Bob", "Charlie"));
        System.out.println("\nSearching in String LinkedList " + names + ":");
        System.out.println("Search Bob   -> Found: " + searchElement(names, "Bob"));
        System.out.println("Search David -> Found: " + searchElement(names, "David"));
    }
}
