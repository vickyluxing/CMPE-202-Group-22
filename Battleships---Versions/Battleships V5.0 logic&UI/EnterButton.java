import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnterButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnterButton extends Actor
{
    /**
     * Act - do whatever the EnterButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
   
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)){
         World world = getWorld();
         //world.getObject(545,300,screen);
         world.removeObjects(world.getObjectsAt(545,300,WelcomeScreen.class));
         world.removeObjects(world.getObjectsAt(549,544,EnterButton.class));
            //Start of BattleshipBlue Objects
        BattleshipBlue[] battleshipBlues=new BattleshipBlue[26];
        BattleshipBlack[] battleshipBlacks=new BattleshipBlack[26];
        int[] arrBS=LogicCore.generateBSArr();
        int[] arrLS=new int[26];
        System.arraycopy(arrBS,0,arrLS,0,arrBS.length);
        java.util.Arrays.sort(arrBS);
        int ans=Greenfoot.getRandomNumber(26);
        world.showText("Find this number : "+arrBS[ans]+"",900,300);
        
        for(int i=0;i<13;i++){
            battleshipBlues[i]=new BattleshipBlue(arrBS[i],arrBS[ans]);
            battleshipBlacks[i]=new BattleshipBlack(arrLS[i],arrBS[ans]);
            world.addObject(battleshipBlues[i],60+i*80,50);
            world.addObject(battleshipBlacks[i],60+i*80,420);
        }
        for(int i=13;i<26;i++){
            battleshipBlues[i]=new BattleshipBlue(arrBS[i],arrBS[ans]);
            world.addObject(battleshipBlues[i],60+(i-13)*80,150);
            battleshipBlacks[i]=new BattleshipBlack(arrLS[i],arrBS[ans]);
            world.addObject(battleshipBlacks[i],60+(i-13)*80,520);
        }
    };
    }    
}
