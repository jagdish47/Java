package OOP;

public class Student {
    public String name;
    private int enrollmentNumber;
    final int conversnalFactor;
    // final int conversnalFactor = 10;


    // CREATEING CONSTRUCTOR(WHICH HAVE TWO PARAMETER)
    public Student(String name, int enrollmentNumber){
        this.name = name;
        this.enrollmentNumber = enrollmentNumber;
        conversnalFactor = 10;
    }

    // CREATING SINGLE PARAMETER CONSTRUCTOR
    public Student(String name){
        this.name = name;
        conversnalFactor = 10;
    }

    public Student(){
        conversnalFactor = 10;
    }

    public double convertPercentageToCGPA(int percentage){
        return percentage / conversnalFactor;
    }

    public void setEnrollmentNumber(int num){
        if(num < 0){
            return;
        }
        enrollmentNumber = num;
    }


    public int getEnrollmentNumber(){
        return enrollmentNumber;
    }
}

// ACCESS MODIFIERS

// [PUBLIC] - Public is use everywhere everyclass and everyPackage(folder)
// [PRIVATE] - Private only accessible inside the same class only can't access
// different package or different classes.
// [DEFAULT] - If no modifier given than it's Default, Default is Accessible every
// class of Same package only can't access different Packages





// SETTER AND GETTER METHOD
// whenever we made an attribute or property of class private we can't access that different classes and different package
// We can access these property using setter and getter method if we want to make change and access to other class than why
// we are making these private why don't we make public Default ?

// because suppose we want to give some restrication and suppose we dont want someone give roll no in minus thats why we use setter and getter
// method to change so we can provide some of conditions





// FINAL
// 1.Once you declare a variable with final keyword afterward you can't change its value ever
// 2.if you do not want to give value to at time of declaration you can give at Constructor
// 3.Give value in each constructor.

