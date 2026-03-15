interface Exam 
{
    boolean isPassed(int mark);
}

interface Classify 
{
    String getDivision(double average);
}

class Result implements Exam, Classify 
{

    private String studentName;
    private int marks[];

    Result(String studentName, int marks[]) 
    {
        this.studentName = studentName;
        this.marks = marks;
    }

    public boolean isPassed(int mark) 
    {
        return mark >= 35; 
    }

    public String getDivision(double average) 
    {
        if (average >= 75) return "Distinction";
        else if (average >= 60) return "First Division";
        else if (average >= 50) return "Second Division";
        else if (average >= 35) return "Third Division";
        else return "Fail";
    }

    void displayResult() 
    {
        int    total       = 0;
        int    subjectCount = marks.length;
        boolean allPassed  = true;

        System.out.println("               RESULT                   ");
        System.out.println("Student Name : " + studentName);
        System.out.printf("%-12s %-10s %-10s%n", "Subject", "Marks", "Status");

        for (int i = 0; i < subjectCount; i++) 
        {
            String status = isPassed(marks[i]) ? "Pass" : "Fail";
            if (!isPassed(marks[i])) allPassed = false;
            System.out.printf("Subject %-4d %-10d %-10s%n", (i + 1), marks[i], status);
            total += marks[i];
        }

        double average = (double) total / subjectCount;

        System.out.println("Total Marks: " + total + " / " + (subjectCount * 100));
        System.out.printf ("Average: %.2f%%%n", average);
        System.out.println("Division: " + getDivision(average));
        System.out.println("Overall: " + (allPassed ? "PASSED" : "FAILED"));
    }
}

public class Program5_1 
{
    public static void main(String args[]) 
    {

        int[] marks1 = {78, 85, 62, 90, 74};
        Result r1 = new Result("Alice", marks1);
        r1.displayResult();

        System.out.println();

        int[] marks2 = {55, 30, 48, 60, 72};
        Result r2 = new Result("Bob", marks2);
        r2.displayResult();

        System.out.println();

        int[] marks3 = {95, 88, 92, 79, 85};
        Result r3 = new Result("Clara", marks3);
        r3.displayResult();

        System.out.println();

        System.out.println("========== Interface Method Demos ==========");
        Result r = new Result("Demo", new int[]{});

        System.out.println("isPassed(40) : " + r.isPassed(40)); 
        System.out.println("isPassed(28) : " + r.isPassed(28)); 

        System.out.println("getDivision(80.0) : " + r.getDivision(80.0));
        System.out.println("getDivision(63.5) : " + r.getDivision(63.5)); 
        System.out.println("getDivision(52.0) : " + r.getDivision(52.0)); 
        System.out.println("getDivision(37.0) : " + r.getDivision(37.0)); 
        System.out.println("getDivision(20.0) : " + r.getDivision(20.0)); 

        System.out.println();
        System.out.println("=== Polymorphic Interface References ===");
        Exam examRef = new Result("Poly", new int[]{});
        Classify classifyRef = new Result("Poly", new int[]{});
        System.out.println("Via Exam     -> isPassed(50)    : " + examRef.isPassed(50));
        System.out.println("Via Classify -> getDivision(68) : " + classifyRef.getDivision(68));
    }
}
