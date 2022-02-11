
package Vehicle;


public abstract class Vehicle {

    
    Vehicle(String name, int wheels, int doors, int topSpeed, int seats){
       this.name = name;
       this.wheels = wheels;
       this.doors = doors;
       this.topSpeed = topSpeed;
       this.seats = seats;
       }

    protected String name;
    protected int wheels;
    protected int doors;
    protected int topSpeed;
    protected int seats;

    public abstract void getDescription();{
//       System.out.println("name: " + name);
//        System.out.println("number of wheels: " + wheels);
//        System.out.println("number of doors: " + doors);
//        System.out.println("the top speed is: " + topSpeed);
//        System.out.println("the amount of seats is " + seats);
    }
    static class vehicle {

        public vehicle(){

        }
    }  
}

