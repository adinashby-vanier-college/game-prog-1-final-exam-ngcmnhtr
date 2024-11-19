import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class GameWonWorld extends World
{

    /**
     * Constructor for objects of class GameWonWord.
     */
    public GameWonWorld()
    {
        super(560, 560, 1);
        showTextWithBigBlackFont("Congratulations, You Win!", 30, 200);
    }

    /**
     * To show the text with big black font
     */
    public void showTextWithBigBlackFont(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new Font(40);
        bg.setFont(font);
        bg.setColor(Color.BLACK);
        bg.drawString(message, x, y);
    }
}
