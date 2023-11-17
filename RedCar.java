import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RedCar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RedCar extends Actor
{
    int counter = 0;
    boolean counterboolean = true;
    public RedCar()
    {
        setRotation(90);
    }
    public void act()
    {
        move(2);
        counter=counter+1;
        addRedCarToTheWorld();
        removeRedCarFromTheWorld();
        redCarTouching();
    }
    /**
     *
     * When RedCar reaches the edge of the world, it gets removed.
     */
    public void removeRedCarFromTheWorld()
    {
        if (getY() > 570)
        {
            setLocation(240, 20);
        }
    }
    /**
     *
     * Makes Car4 appear periodically rather than once or twice.
     */
    public void addRedCarToTheWorld()
    {
        if (counter > 500 && counterboolean == true)
        {
            getWorld().addObject(new RedCar(), 250, Greenfoot.getRandomNumber(200));
            counterboolean = false;
        }
    }
    /**
     *
     * If RedCar accidentally touches another RedCar, it will steer away from it.
     */
    public void redCarTouching()
    {
        if (isTouching(LeftBus.class) == true)
        {
            setLocation(getX()+7, getY());
        }
        if (isTouching(RedCar.class) == true)
        {
            setLocation(getX(), getY()-10);
        }
    }
}