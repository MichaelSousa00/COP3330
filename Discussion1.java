class Car {
    // fields
    String make;
    String color;
    int speed;

    // constructor
    Car(String color, String make, int speed){
        this.color = color;
        this.make = make;
        this.speed = speed;
    }

    // method
    public int accelerate(int mph) {
        speed = speed + mph;
        return speed;
    }
}

public class Discussion1{
    public static void main(String[] args) {
        //creating new object 
        Car myNewCar = new Car("Red", "BMW", 0);

        //accessing with dot operator 
        myNewCar.color = "Red";
        myNewCar.make = " BMW";

        System.out.print("Check out myNewCar! Its a "+myNewCar.color +myNewCar.make+".\n");
        System.out.println("Lets take it for a spin! My current speed is: "+myNewCar.accelerate(10));
    }//main args
}//main