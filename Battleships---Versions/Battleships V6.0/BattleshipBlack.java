import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BattleshipBlack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BattleshipBlack extends Actor
{
    /**
     * Act - do whatever the Battleship1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int number;
    int answer;
    int key=0;
    
    public BattleshipBlack(int x,int ans){
        this.number=x;
        this.answer=ans;
    }
    
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            if(this.number==this.answer) key=1;
            World world=getWorld();
            world.showText(""+this.number+"",this.getX(),this.getY());
            world.removeObject(this);
            Greenfoot.playSound("blast.wav");
            if(key==1) {
                Greenfoot.playSound("Player2.mp3");
                world.showText("Player 2 wins",200,200);
            }
        }
    }    
}
