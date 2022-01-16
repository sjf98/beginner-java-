
package monsters;


public class Skeleton extends Monster   // derived class, sub class, child class, 
{
    String typeOfAttack;
    @Override
    public void attack()
        {
            // HERE IS SCRIPT THAT ATTACKS PEOPLE
            
            
            System.out.println("I'm attacking from Skeleton class");

        }
    public Skeleton()     
    {
        super.attack();
        System.out.println("I'm DEFAULT constructor from Skeleton class");
    }
    public Skeleton(double hitPoints, double speed)
    {
        super(hitPoints, speed);
        System.out.println("I'm constructor from Skeleton class with 2 arguments");
        typeOfAttack = "Axe";
       
    }
    
    public Skeleton(double hitPoints, double speed, String typeOfAttack)
    {
        super(hitPoints, speed);
        System.out.println("I'm constructor from Skeleton class with 2 arguments");
        this.typeOfAttack = typeOfAttack;
    }

    
        
}
    
