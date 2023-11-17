import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RightBus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RightBus extends Actor
{
    int counterbus = 0;
    boolean counterbusboolean = true;
    public RightBus()
    {
        setRotation(90);
    }
    /**
     * Act - do whatever the Car2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      move(-1);
      counterbus=counterbus+1;
      addRightBusToTheWorld();
      removeRightBusFromWorld();
      rightBusTouching();
    }
    /**
     *
     * When Car2 reaches the edge of the world, it gets removed.
     */
    public void removeRightBusFromWorld()
    {
        if (getY() < 20)
        {
            setLocation(560, 550);
        }
    }
    /**
     *
     * Makes RightBus appear periodically rather than once or twice.
     */
    public void addRightBusToTheWorld()
    {
        if (counterbus > 500 && counterbusboolean == true)
        {
            getWorld().addObject(new RightBus(), Greenfoot.getRandomNumber(150)+430, Greenfoot.getRandomNumber(400));
            counterbusboolean = false;
        }
    }
    /**
     *
     * If RightBus accidentally touches another RightBus, it will steer away from it.
     */
    public void rightBusTouching()
    {
        if (isTouching(RightBus.class) == true)
        {
            setLocation(getX(), getY()+10);
        }
    }
}