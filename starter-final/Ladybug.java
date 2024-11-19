import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Ladybug extends Actor
{

    /**
     * Act - do whatever the Hero wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAndTurn();
        getTarget();
        if (isGameWon()) {
            transitionToGameWonWorld();
        }
    }
    
    /**
     * For the ladybug to move and turn
     */
    public void moveAndTurn()
    {
        if (Greenfoot.isKeyDown("left")) {
            turn(-3);
            move(4);
        }
        if (Greenfoot.isKeyDown("right")) {
            turn(3);
            move(4);
        }
    }
    
    /**
     * When the Ladybug get to the Finish Location 
     */
    public void getTarget(){
        Actor finishLocation = getOneIntersectingObject(FinishLocation.class);
        if (finishLocation != null) {
            World world = getWorld();
            world.removeObject(finishLocation);
        }
    }
    
    /**
     * Check if the Finish Location is been reached
     */
    public boolean isGameWon()
    {
        World world = getWorld();
        if (world.getObjects(FinishLocation.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }
    /**
     * Transition to Game Won World
     */
    public void transitionToGameWonWorld()
    {
        World gameWonWorld =  new  GameWonWorld();
        Greenfoot.setWorld(gameWonWorld);
        Greenfoot.playSound("win.wav");
    }
}
