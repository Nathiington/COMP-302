package Practice;

public class Student
{

//  Fields/attributes every student has
    private int studentID;
    private String studentName;

//  A constructor is used in the main method to create a Student object
    public Student(int studentID, String studentName)
    {
        this.studentID = studentID;
        this.studentName = studentName;
    }

//    Getter returns the value of the attribute for that particular Student object
    public int getStudentID()
    {
        return studentID;
    }

    public String getStudentName()
    {
        return studentName;
    }


//    Setters gives the attribute a valuable
    public void setStudentID(int studentID)
    {
        this.studentID = studentID;
    }

    public void setStudentName(String studentName)
    {
        this.studentName = studentName;
    }


    @Override
    public String toString()
    {
        return "Student{" +
                "studentID=" + studentID +
                ", studentName='" + studentName + '\'' +
                '}';
    }
}