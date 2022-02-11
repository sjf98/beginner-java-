
package Vehicle;


public class Coupe extends Vehicle {

    String typeOfFuel;
    
    public Coupe(String name, int wheels, int doors, int topSpeed, int seats, String typeOfFuel) {
        super(name, wheels, doors, topSpeed, seats);
        this.name = name;
        this.wheels = wheels;
        this.doors = doors;
        this.topSpeed = topSpeed;
        this.seats = seats;
        this.typeOfFuel = typeOfFuel; 
        }

    @Override
    public void getDescription() {
        System.out.println("***************");
        System.out.println("name: " + name);
        System.out.println("number of wheels: " + wheels);
        System.out.println("number of doors: " + doors);
        System.out.println("the top speed is: " + topSpeed);
        System.out.println("the amount of seats is " + seats);
        System.out.println("fuel type: " + typeOfFuel);
        System.out.println("***************");
    }  
}
