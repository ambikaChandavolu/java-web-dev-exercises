package school;

public class Student {
    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;

    public void setName(String studentName){
        this.name = studentName;
    }
    public String getName(){
        return name;
    }

    public void setStudentId(int id){
        this.studentId = id;
    }
    public int getStudentId(){
        return studentId;
    }
    public void setNumberOfCredits(int credits){
        this.numberOfCredits = credits;
    }
    public int getNumberOfCredits(){
        return numberOfCredits;
    }
    public void setGpa(double studentGpa){
        this.gpa = studentGpa;
    }
    public double getGpa(){
        return gpa;
    }

}
