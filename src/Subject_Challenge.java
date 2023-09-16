class Subject
{
    private String subID;
    private String name;
    private int maxMarks;
    private int marksObtain;

    public Subject(String subID, String name, int maxMarks, int marksObtain)
    {
        this.subID = subID;
        this.name = name;
        this.maxMarks = maxMarks;
        this.marksObtain = marksObtain;
    }

    public String getSubID() {return subID;}
    public String getName() {return name;}
    public int getMaxMarks() {return maxMarks;}
    public int getMarksObtain() {return marksObtain;}

    public void setMaxMarks(int maxMarks)
    {
        this.maxMarks = maxMarks;
    }

    public void setMarksObtain(int marksObtain)
    {
        this.marksObtain = marksObtain;
    }

    String isQualified()
    {
        return "Pass: " + (marksObtain >= maxMarks/10*4);
    }

    public String toString()
    {
        return "\nSubject ID: " + subID + "\nName: " + name + "\nMarks Obtained: " + marksObtain;
    }
}
public class Subject_Challenge {
    public static void main(String[] args) {

        Subject subs[] = new Subject[3];

        subs[0] = new Subject("s101", "Maths", 100, 80);
        subs[1] = new Subject("s102", "Algorithms", 100, 40);
        subs[2] = new Subject("s103", "Physics", 100, 30);

        for(Subject s: subs)
        {
            System.out.println(s);
            System.out.println(s.isQualified());
        }
    }

}
