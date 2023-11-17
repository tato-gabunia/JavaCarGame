import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CountrySide here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CountrySide extends World
{
    Asphalt Asphalt = new Asphalt();
    LeftGrass LeftGrass = new LeftGrass();
    RightGrass RightGrass = new RightGrass();
    GameOver GameOver1 = new GameOver();
    LeftAsphaltLine LeftAsphaltLine = new LeftAsphaltLine();
    RightAsphaltLine RightAsphaltLine = new RightAsphaltLine();
    MainCar MainCar = new MainCar();
    RightBus RightBus = new RightBus();
    LeftBus LeftBus = new LeftBus();
    RedCar RedCar = new RedCar();
    Tree Tree1 = new Tree();
    Tree Tree2 = new Tree();
    Tree Tree3 = new Tree();
    Tree Tree4 = new Tree();
    StandardHouse StandardHouse = new StandardHouse();
    /**
     * Constructor for objects of class Level1.
     * 
     */
    public CountrySide()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        addObject(Asphalt, 400, 300);
        addObject(LeftGrass, 110, 300);
        addObject(RightGrass, 690, 300);
        addObject(LeftAsphaltLine, 390, 300);
        addObject(RightAsphaltLine, 405, 300);
        addObject(MainCar, 500, 545);
        addObject(RightBus, 545, 50);
        addObject(LeftBus, 250, 30);
        addObject(RedCar, 350, 90);
        addObject(Tree1, 20, 50);
        addObject(Tree2, 80, 140);
        addObject(Tree3, 630, 30);
        addObject(Tree4, 700, 35);
        addObject(StandardHouse, 720, 75);
    }
}