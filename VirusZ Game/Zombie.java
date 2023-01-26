import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Zombie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zombie extends Actor
{
    /**
     * Act - do whatever the Zombie wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int animateImage = 0;
    int animateSpeed = 5;
    int count;
    int health = 3;
    Player player;
    public Zombie(Player mainPlayer)
    {
        player = mainPlayer;
        setImage("zombie-walk_16.png");
        getImage().scale(120,120);
    }
    
    public void act()
    {
        count++;
        animate();
        walk();
        hitByBullet();
    }
    
    public void animate()
    {
        if(count % animateSpeed == 0)
        {
            if(animateImage > 16)
            {
                animateImage = 0;
            }
            setImage("zombie-walk_" + animateImage + ".png");
            animateImage++;
            getImage().scale(130,130);
        }
    }
    
    public void walk()
    {
        move(1);
        turnTowards(player.getX(), player.getY());
    }
    
    public void hitByBullet()
    {
        Actor bullet = getOneIntersectingObject(Bullet.class);
        if(bullet != null)
        {
            health--;
            getWorld().removeObject(bullet);
        }
        if(health == 0)
        getWorld().removeObject(this);
    }
}
