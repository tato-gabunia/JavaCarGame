import greenfoot.*;

/**
 * Write a description of class StandardHouse here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StandardHouse extends Actor
{
    public StandardHouse()
    {
        setRotation(90);
    }
    /**
     * Act - do whatever the WhiteHouse wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(1);
        if (getY() > 590)
        {
            setLocation(Greenfoot.getRandomNumber(135)+625, 50);
        }
    }
}
