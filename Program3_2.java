import java.util.*;

class College 
{

    private String collegeName;

    public College(String collegeName) 
    {
        this.collegeName = collegeName;
    }

    public String getCollegeName() 
    {
        return collegeName;
    }

    class Admission 
    {

        private String studentName;
        private String course;

        public Admission() {}

        public void acceptDetails(String studentName, String course) {
            this.studentName = studentName;
            this.course      = course;
        }

        public void displayDetails() 
        {
            System.out.println("  College Name  : " + collegeName);
            System.out.println("  Student Name  : " + studentName);
            System.out.println("  Course        : " + course);
        }
    }
}

public class Program3_2 
{

    public static void main(String args[]) 
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter College Name : ");
        String collegeName = sc.nextLine();
        College college = new College(collegeName);
        
        College.Admission admission = college.new Admission();

        System.out.print("Enter Student Name : ");
        String studentName = sc.nextLine();

        System.out.print("Enter Course Name  : ");
        String course = sc.nextLine();

        admission.acceptDetails(studentName, course);

        System.out.println();
        admission.displayDetails();

        sc.close();
    }
}
