import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BattleshipBlue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BattleshipBlue extends Actor
{
    /**
     * Act - do whatever the BattleshipBlue wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int number;
    int answer;
    int key=0;;
    
    public BattleshipBlue(int x,int ans){
        number=x;
        this.answer=ans;
    }
    
    public void act() 
    {
        // Add your action code here.
            if(Greenfoot.mouseClicked(this)){
                if(LogicCore.flag==true){
                    if(this.number==this.answer) key=1;
                    World world=getWorld();
                    world.showText(""+this.number+"",this.getX(),this.getY());
                    world.removeObject(this);
                    Greenfoot.playSound("blast.wav");
                    if(key==1){
                        world.showText("Blue win",200,200);
                        Greenfoot.playSound("Player2.mp3");
                        Greenfoot.delay(100);
                        Greenfoot.setWorld(new ScoreBoard());
                        Greenfoot.stop();
                    }
                    LogicCore.flag=false;
                }
            
            };
        
        
        
        
    }    
    
    
}
