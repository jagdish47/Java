package OOP;

public class StudentUse {
    public static void main(String[] args) {
        // Student s1 = new Student(); 
        // s1.name = "Jagdish";
        // s1.enrollmentNumber = 2012083;
        // System.out.println(s1.name + " " + s1.enrollmentNumber);



        // Student s2 = new Student();
        // s2.name = "Rahul";
        // s2.enrollmentNumber = 2011034;
        // System.out.println(s2.name + " " + s2.enrollmentNumber);


        Student s1 = new Student();

        s1.name = "Anshu Kumawat";
        // Set a value using the setter method
        s1.setEnrollmentNumber(2012083);

        System.out.println(s1.name);
        // get the value using the getter method
        System.out.println(s1.getEnrollmentNumber());
    }
}
