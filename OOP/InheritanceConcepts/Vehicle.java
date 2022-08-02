package OOP.InheritanceConcepts;

public abstract class Vehicle {
    public int maxSpeed;
    public int numOfWheels;

    public void print(){
        System.out.println(maxSpeed + " " + numOfWheels);
    }

    public int getWheels(){
        return numOfWheels;
    }

    public abstract boolean hasGear();
}








// If you make private than can't access in child even if you extending it 

