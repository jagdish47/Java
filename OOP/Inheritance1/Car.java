package OOP.Inheritance1;

import OOP.InheritanceConcepts.Vehicle;

public class Car extends Vehicle {
    String color;

        public void print() {
            System.out.println(maxSpeed + " " + numOfWheels + " ");
        }

        public int getMaxSpeed() {
            return maxSpeed;
        }

        public void setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
        }

        public boolean hasGear(){
            return true;
        }
}

