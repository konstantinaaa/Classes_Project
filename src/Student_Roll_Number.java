import java.util.Date;

// Create a class that generates a unique roll number for each student.
class StudentRollNo
{
    private String rollNo; // roll number
    private static int count = 1;
    private String generateRollNo()
    {
        Date d = new Date();

        String rn = "Univ-" + (d.getYear() + 1900) + "-" + count;
        count++;
        return rn; // roll number
    }
    public StudentRollNo()
    {
        rollNo = generateRollNo();
    }
    public String getRollNo()
    {
        return rollNo;
    }



}

public class Student_Roll_Number {
    public static void main(String[] args) {
        StudentRollNo st1 = new StudentRollNo();
        StudentRollNo st2 = new StudentRollNo();
        StudentRollNo st3 = new StudentRollNo();

        System.out.println(st1.getRollNo());
        System.out.println(st2.getRollNo());
        System.out.println(st3.getRollNo());


    }
}
