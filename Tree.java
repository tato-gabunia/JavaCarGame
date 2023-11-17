import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tree extends Actor
{
    public void act() 
    {
      if (getY() > 590)
        {
            setLocation(getX(), 50);
        }
      towardsTheCar();
      move(3);
    }
    /**
     *
     * Makes Tree turn toward Car. The turnTowards() method affects the move() method.
     */
    public void towardsTheCar()
    {
        turnTowards(getX(), 600);
    }
}