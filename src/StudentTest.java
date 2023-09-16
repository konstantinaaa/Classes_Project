class Student
{
    public int roll_number;
    public String name;
    public String course;
    public int m1, m2, m3;

    public int total()
    {
        return m1 + m2 + m3;
    }

    public float average()
    {
        return (float)total()/3;
    }

    public char grade()
    {
        if (average() >= 70)
            return 'A';
        else if(average()>=60 && average()<=69)
            return 'B';
        else if(average()>= 50 && average()<=59)
            return 'C';
        else if(average()>= 40 && average()<=49)
            return 'C';
        else return 'F';
    }

    public String details() // return the details of a student
    {
        return "Roll Number: " + roll_number + "\n" + "Name: " + name + "\n" + "Course: " + course + "\n" ;
    }
}

public class StudentTest {
    public static void main(String[] args) {

        Student s = new Student();

        s.roll_number = 1;
        s.name = "John";
        s.course = "Computer Science";
        s.m1 = 70;
        s.m2 = 80;
        s.m3 = 65;

        System.out.println("Total: " + s.total());
        System.out.println("Average: " + s.average());
        System.out.println("Details: \n" + s.details());


    }
}
