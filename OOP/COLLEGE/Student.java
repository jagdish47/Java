package OOP.COLLEGE;

public class Student extends College{
    
    String studentName;
    int studentId;

    public void print(){
        super.print();
        System.out.println(studentId);
        System.out.println(studentName);
    }
}
