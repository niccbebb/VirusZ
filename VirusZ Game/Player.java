import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed = 3;
    public void act()
    {
        turnAround();
        moveAround();
        fireBullet();
    }
    
    public void turnAround()
    {
        MouseInfo pointer = Greenfoot.getMouseInfo();
        if(pointer != null)
        {
            int mouseX = pointer.getX();
            int mouseY = pointer.getY();
            turnTowards(mouseX, mouseY);
        }
    }
    
    public void moveAround()
    {
        if(Greenfoot.isKeyDown("w"))
        setLocation(getX(),getY() - speed);
        if(Greenfoot.isKeyDown("a"))
        setLocation(getX() - speed, getY());
        if(Greenfoot.isKeyDown("s"))
        setLocation(getX(),getY() + speed);
        if(Greenfoot.isKeyDown("d"))
        setLocation(getX() + speed, getY());
    }
    
    public void fireBullet()
    {
        if(Greenfoot.mousePressed(null))
        {
        Bullet bullet = new Bullet();
        getWorld().addObject(bullet, getX(), getY());
        bullet.setRotation(getRotation());
        
        }
    }
}
