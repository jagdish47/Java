package OOP.Inheritance1;
// import OOP.InheritanceConcepts.Vehicle;


public class InhertanceUse{
    
    public static void main(String[] args) {
        Car c1 = new Car();

        c1.maxSpeed = 100;
        c1.numOfWheels = 4;

        System.out.println(c1.getMaxSpeed());

    }
}
