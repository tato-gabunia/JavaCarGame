import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LeftBus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LeftBus extends Actor
{
    public LeftBus()
    {
        setRotation(90);
    }
    /**
     * Act - do whatever the Car3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(1);
        removeRightBusFromWorld();
    }
    /**
     *
     * When RightBus reaches the edge of the world, it gets removed.
     */
    public void removeRightBusFromWorld()
    {
        if (getY() > 570)
        {
            setLocation(270, 20);
        }
    }
}