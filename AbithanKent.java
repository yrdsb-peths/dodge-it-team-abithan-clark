import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AbithanKent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AbithanKent extends Actor
{
    boolean atTop = true;
    int mouseClicks = 0;
    
    public void act()
    {
       if(atTop)
       {
           setLocation(100,100);
       }
       else
       {
           setLocation(100,300);
       }
       
       if(Greenfoot.mouseClicked(null))
       {
           atTop = !atTop;
           mouseClicks++;
           String mouseStr = "" + mouseClicks;
           getWorld().showText(mouseStr, 550, 350);
       }
    }
}
