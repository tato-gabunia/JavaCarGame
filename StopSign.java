import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StopSign here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StopSign extends Actor
{
    /**
     * Act - do whatever the StopSign wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        StopSignKey();
    }
    /**
     *
     * When the "C" key is pressed, StopSign gets removed from the World.
     */
    public void StopSignKey()
    {
        if (Greenfoot.isKeyDown("C") == true)
        {
            getWorld().removeObject(this);
        }
    }
}