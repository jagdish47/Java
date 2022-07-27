package OOP.InheritanceConcepts;

public class Car extends Vehicle{
    String color;

    public void print(){
        System.out.print(maxSpeed + " " + color + " " + getWheels());
    }

    
}



// Car extends Vehicle
// Car taking all propertys of Vehicle class

// not only propertis even we can use functions of parent class

