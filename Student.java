package CollegeManagementSystem;

public class Student {
    private String rollNumber;
    private int marks;

    public Student(String rollNumber, int marks) {
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public int getMarks() {
        return marks;
    }
}
