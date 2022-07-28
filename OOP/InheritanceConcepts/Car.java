package OOP.InheritanceConcepts;

public class Car extends Vehicle{
    String color;

    public void print(){
        super.print();  //Super keyword use to when we have to call the parent class function in child classes
        System.out.println(color);
    }

    
}



// Car extends Vehicle
// Car taking all propertys of Vehicle class

// not only propertis even we can use functions of parent class

