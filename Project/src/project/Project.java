
package project;

import Vehicle.Vehicle;
import Vehicle.Coupe;
import Vehicle.Motorbike;
import Vehicle.Motorhome;
import java.util.ArrayList;

public class Project {
public static void main(String[] args)
{
         Vehicle[] car = new Vehicle[4];
         car[0] = new Coupe ("BMW", 4, 2, 220, 2, "Disel");
         car[1] = new Coupe ("Mercedes", 4, 2, 220, 2, "Disel");
         car[2] = new Motorbike ("Zero", 2, 0, 300, 1, "Disel");
         
         Motorhome motorhome = new Motorhome("Home", 6, 4, 120, 5, "Fox", new ArrayList<>());
         motorhome.storeVehicle(car[0]);
         
         motorhome.getDescription();
         
         car[0].getDescription();
         car[1].getDescription();
         car[2].getDescription();

         }
}


