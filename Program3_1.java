import java.util.*;
class University
{
    static int totalStudents;
    static String universityName;
    public static int getTotalStudents()
    {
        return totalStudents;
    }
    static
    {
        universityName = "SVIT, Vasad";
        System.out.println("Static block executed.");
    }

    {
        System.out.println("Object is created.");
        totalStudents++;
    }
}

public class Program3_1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);  
        University student1 = new University();
        University student2 = new University();
        University student3 = new University();
        System.out.println("Total students enrolled: " + University.getTotalStudents());
    }
}
