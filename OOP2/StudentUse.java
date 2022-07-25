package OOP2;
import OOP.Student;
// Here we are importing OOP Package(folder) where we have Created Student.java so we use that class here

public class StudentUse {

    public static void main(String[] args){
        Student s1 = new Student("Yuvraj Kumawat", 201111);

        System.out.println(s1.name);
        System.out.println(s1.getEnrollmentNumber());
    }
    
}



// Created new Package OOP2
// Import OOP package where we also import Student class
// Here OOP2 package we created StudentUse class and create object and give value to defined attrubute in Student
