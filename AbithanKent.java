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
    public void act()
    {
       if(Greenfoot.mouseClicked(null))
       {
           atTop = !atTop;
       }
       if(atTop)
       {
           setLocation(100,100);
       }
       else
       {
           setLocation(100,300);
       }
    }
}
