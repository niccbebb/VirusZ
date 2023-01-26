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
    HealthBar healthbar = new HealthBar();
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(1000, 800, 1); 
    
        Player player = new Player();
        addObject(mainPlayer, 500, 400);
        addObject(healthbar, mainPlayer.getX() - 5, mainPlayer.getY() - 50);
    }
    
    public Player getPlayer()
    {
        return mainPlayer;
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
