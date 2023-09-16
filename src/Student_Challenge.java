class Student1
{
    private String rollNo;
    private String name;
    private String dept; // department name
    private String sub; // subjects

    public Student1(String rollNo, String name, String dept, String sub)
    {
        this.rollNo = rollNo;
        this.name = name;
        this.dept = dept;
        this.sub = sub;
    }

    public String getRollNo() {return rollNo;}
    public String getName() {return name;}
    public String getDept() {return dept;}
    public String getSub() {return sub;}

    public void setSub(String sub)
    {
        this.sub = sub;
    }

    public String toString()
    {
        return "\nRoll No: " + rollNo + "\nName: " + name + "\nDepartment: " + dept + "\nSubject: " + sub;
    }

}


public class Student_Challenge {
    public static void main(String[] args) {

        Student1 st[] = new Student1[3];

        st[0] = new Student1("0001", "John", "Science", "Maths");
        st[1] = new Student1("0002", "Ana", "Business", "Finance");
        st[2] = new Student1("003", "Rose", "Science", "Physics");

        for(Student1 s : st)
            System.out.println(s);

    }
}
