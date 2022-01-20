
package objectclass;


public class ObjectClass {

   
    public static void main(String[] args) 
    
    {
        Object a = new Point(4, 10);
     
        
        Point p = new Point(1, 10);
        Point p2 = new Point(1,10);

        if (p.equals(p2))
            System.out.println("they are equal");
    }
        
}      
 
class Point
{
    private int x;
    private int y;
    
    Point(){ }
    Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
   
    int getX()
    {
        return x;
    }
    int getY()
    {
        return y;
    }
    
    public boolean equals(Object o) {
      Point sentPoint = (Point)o;
        
        return this.x == sentPoint.x && this.y == sentPoint.y;
         
    }
    
}   
        
        
        
        
    
    

