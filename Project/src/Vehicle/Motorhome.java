package Vehicle;
import java.util.List;

public class Motorhome extends Vehicle{
    String typeOfFuel;
    public List<Vehicle> storage;
        
    public Motorhome(String name, int wheels, int doors, int topSpeed, int seats, String typeOfFuel, List<Vehicle> currentStorage) {
        super(name, wheels, doors, topSpeed, seats);
        this.name = name;
        this.wheels = wheels;
        this.doors = doors;
        this.topSpeed = topSpeed;
        this.seats = seats;
        this.typeOfFuel = typeOfFuel;
        this.storage = currentStorage;
        }
    
    public void storeVehicle(Vehicle Store){
       storage.add(Store);
        }
    public void releaseVehicle(Vehicle Release){
        storage.remove(Release);
        }
    
     public String getName(){  
        return name;
        }
      public int getWheels(){  
        return wheels;
        }
      public int getDoors(){  
        return doors;
        }
     public int getTopSpeed(){
        return topSpeed;
        }     
     public int getSeats(){
        return seats;
        }
     public String getTypeOfFuel(){
         return typeOfFuel;
        }
     public List<Vehicle> getCurrentStorage(){
         return storage;
        }

    @Override
    public void getDescription() {
        System.out.println("name: " + name);
        System.out.println("number of wheels: " + wheels);
        System.out.println("number of doors: " + doors);
        System.out.println("the top speed is: " + topSpeed);
        System.out.println("the amount of seats is " + seats);
        System.out.println("fuel type: " + typeOfFuel);
        System.out.println("the current amount of vehicles stored : " + storage.size());
        }
}
