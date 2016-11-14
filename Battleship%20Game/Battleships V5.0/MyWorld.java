import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1090, 600, 1); 
        welcome();
        // prepare();
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        
        WelcomeScreen screen= new WelcomeScreen();
        addObject(screen,545,300);
        
        EnterButton enterbutton = new EnterButton();
        addObject(enterbutton,549,544);
        
        //enterbutton.setLocation(549,544);
        
    }
    
    public void welcome(){
       
        //Greenfoot.delay(10000);
        //removeObject(screen);
      }
    
}
