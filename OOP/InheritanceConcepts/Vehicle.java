package OOP.InheritanceConcepts;

public class Vehicle {
    protected int maxSpeed;
    protected int numOfWheels;

    public void print(){
        System.out.println(maxSpeed + " " + numOfWheels);
    }

    public int getWheels(){
        return numOfWheels;
    }
}








// If you make private than can't access in child even if you extending it 

