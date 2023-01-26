import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    /**
     * When the bullets hit the edge they will disappear instead of gathering in
     * altogether.
     */
    public void act()
    {
        move(10);
        
        if(isAtEdge())
        {
            getWorld().removeObject(this);
        }
    }
}
