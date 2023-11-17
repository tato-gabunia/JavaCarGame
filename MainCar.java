import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainCar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainCar extends Actor
{
    GameOver GameOver1 = new GameOver();
    boolean CarTouching = true;
    boolean GameOverCounter = false;
    GreenfootImage StopSign = new GreenfootImage(100, 100);
    public void act()
    {
     if(CarTouching == true)
     {
         carIsTouchingObjects();
     } 
     checkKeys();
     stopGame();
    }
    /**
     *
     * Controls movement of MainCar. Buttons "A" and "D" are use for steering, while "W" and "S" are used for forward and backward movement. "L" is used as a turbo mode toggle.
     */
    public void checkKeys()
    {
        if (Greenfoot.isKeyDown("D") == true)
        {
            move(4);
        }
        if (Greenfoot.isKeyDown("A") == true)
        {
            move(-4);
        }
        if (Greenfoot.isKeyDown("S") == true)
        {
            setLocation(getX(), getY()+2);
        }
        if (Greenfoot.isKeyDown("W") == true)
        {
            setLocation(getX(), getY()-2);
        }
        if (Greenfoot.isKeyDown("L") == true)
        {
            setLocation(getX(), getY()-5);
        }
    }
    /**
     *
     * If MainCar touches any of the objects listed below, it will get removed from the World.
     */
    public void carIsTouchingObjects()
    {
        if (isTouching(RightAsphaltLine.class)||isTouching(RightBus.class)||isTouching(RightGrass.class))
        {
            CarTouching = false;
            //taken from http://soundbible.com/262-Car-Screech-And-Crash.html
            Greenfoot.playSound("carsound.wav");
            getWorld().addObject(GameOver1, 400, 300);
            getWorld().removeObject(this);
            GameOverCounter = true;
            Greenfoot.stop();
        }
    }
    /**
     *
     * Listed below are two different ways of pausing the game.
     */
    public void stopGame()
    {
        if (Greenfoot.isKeyDown("P") == true)
        {
            getWorld().addObject(new StopSign(), 400, 300);
        }
        if (Greenfoot.isKeyDown("K") == true)
        {
            getWorld().addObject(new StopSign(), 400, 300);
            Greenfoot.stop();
        }
    }
}