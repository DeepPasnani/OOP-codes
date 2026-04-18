import java.util.*;
 
public class Program9_1
{
    public static void main(String[] args)
    {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(85);
        marks.add(92);
        marks.add(78);
        marks.add(95);
        marks.add(60);
        System.out.println("Student Marks: " + marks);
        System.out.println("Highest Marks: " + Collections.max(marks));
        System.out.println("Lowest Marks : " + Collections.min(marks));
    }
}
