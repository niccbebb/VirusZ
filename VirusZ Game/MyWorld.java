import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    int count = 0;
    int spawnSpeed = 50;
    int randomSpawn;
    public Player mainPlayer = new Player();
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Player player = new Player();
        addObject(mainPlayer, 500, 400);

    }
    
    public void act()
    {
        count++;
        spawnZombies();
    }
    
    public void spawnZombies()
    {
        if(count % spawnSpeed ==0)
        {
            randomSpawn = Greenfoot.getRandomNumber(8);
            switch(randomSpawn)
            {
                case 0 : addObject(new Zombie(mainPlayer), 0, 0); break;
                case 1 : addObject(new Zombie(mainPlayer), getWidth()/2, 0); break;
                case 2 : addObject(new Zombie(mainPlayer), getWidth(), 0); break;
                case 3 : addObject(new Zombie(mainPlayer), 0, getHeight()/2); break;
                case 4 : addObject(new Zombie(mainPlayer), getWidth(), getHeight()/2); break;
                case 5 : addObject(new Zombie(mainPlayer), 0, getHeight()); break;
                case 6 : addObject(new Zombie(mainPlayer), getWidth()/2, getHeight()); break;
                case 7 : addObject(new Zombie(mainPlayer), getWidth(), getHeight()); break;
            }
        }
    }
}
