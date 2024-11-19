import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Canon extends Actor
{

    /**
     * Act - do whatever the Canon wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        CannonBall newBall = new CannonBall();
        getWorld().addObject(newBall, getX(), getY());
        
    }
    
    //protected List getOneIntersectingObject(){
      //  CannonBall newBall = new CannonBall();
      //  getWorld().addObject(newBall, getX(), getY());
    //}
    
}
