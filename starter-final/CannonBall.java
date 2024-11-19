import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class CannonBall extends Actor
{

    /**
     * Act - do whatever the CannonBall wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(1);
        getTarget();
        if (isGameLose()) {
            transitionToGameOverWorld();
        }
    }
    /**
     * When the Balls get to the Ladybug 
     */
    public void getTarget()
    {
        Actor ladybug = getOneIntersectingObject(Ladybug.class);
        if (ladybug != null) {
            World world = getWorld();
            world.removeObject(ladybug);
        }
    }
    
    /**
     * Check if the Ladybug is been reached
     */
    public boolean isGameLose()
    {
        World world = getWorld();
        if (world.getObjects(Ladybug.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }
    /**
     * Transition to Game Over World
     */
    public void transitionToGameOverWorld()
    {
        World gameOverWorld =  new  GameOverWorld();
        Greenfoot.setWorld(gameOverWorld);
        Greenfoot.playSound("lose.wav");
    }
}
