
package monsters;


public class Skeleton extends Monster   // derived class, sub class, child class, 
{
    String typeOfAttack;
@Override
public void attack()
{
super.attack();
System.out.println("im attack method from skeleton class");

}

public void test()
{
    System.out.println("bam");
}

public Skeleton ()
{
System.out.println("I'm DEFAULT constructor from Skeleton class ");
}
public Skeleton (double hitPoints, double speed)
{
    
super(hitPoints, speed);
System.out.println("I'm constructor from Skeleton class with 2 arguments");
typeOfAttack = "Axe";

}
public Skeleton (double hitPoints, double speed, String typeOfAttack)
{
super (hitPoints, speed);
System.out.println("I'm constructor from Skeleton class with 2 arguments");
this.typeOfAttack = typeOfAttack;
}

    @Override
    protected void description() {
        
    }


    
        
}
    
