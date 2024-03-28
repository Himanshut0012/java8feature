public class Student {
    private int rollNumber;
    private String studentName;
    private String branch;

    public Student(int rollNumber, String studentName, String branch) {
        this.rollNumber = rollNumber;
        this.studentName = studentName;
        this.branch = branch;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", studentName='" + studentName + '\'' +
                ", branch='" + branch + '\'' +
                '}';
    }
}
