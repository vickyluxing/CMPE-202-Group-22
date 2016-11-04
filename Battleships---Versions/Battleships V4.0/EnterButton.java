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
        BattleshipBlue battleshipBlue1 = new BattleshipBlue();
        world.addObject(battleshipBlue1,60,50);
        BattleshipBlue battleshipBlue2 = new BattleshipBlue();
        world.addObject(battleshipBlue2,140,50);
        BattleshipBlue battleshipBlue3 = new BattleshipBlue();
        world.addObject(battleshipBlue3,220,50);
        BattleshipBlue battleshipBlue4 = new BattleshipBlue();
        world.addObject(battleshipBlue4,300,50);
        BattleshipBlue battleshipBlue5 = new BattleshipBlue();
        world.addObject(battleshipBlue5,380,50);
        BattleshipBlue battleshipBlue6 = new BattleshipBlue();
        world.addObject(battleshipBlue6,460,50);
        BattleshipBlue battleshipBlue7 = new BattleshipBlue();
        world.addObject(battleshipBlue7,540,50);
        BattleshipBlue battleshipBlue8 = new BattleshipBlue();
        world.addObject(battleshipBlue8,620,50);
        BattleshipBlue battleshipBlue9 = new BattleshipBlue();
        world.addObject(battleshipBlue9,700,50);
        BattleshipBlue battleshipBlue10 = new BattleshipBlue();
        world.addObject(battleshipBlue10,780,50);
        BattleshipBlue battleshipBlue11 = new BattleshipBlue();
        world.addObject(battleshipBlue11,860,50);
        BattleshipBlue battleshipBlue12 = new BattleshipBlue();
        world.addObject(battleshipBlue12,940,50);
        BattleshipBlue battleshipBlue13 = new BattleshipBlue();
        world.addObject(battleshipBlue13,1020,50);
        BattleshipBlue battleshipBlue14 = new BattleshipBlue();
        world.addObject(battleshipBlue14,60,150);
        BattleshipBlue battleshipBlue15 = new BattleshipBlue();
        world.addObject(battleshipBlue15,140,150);
        BattleshipBlue battleshipBlue16 = new BattleshipBlue();
        world.addObject(battleshipBlue16,220,150);
        BattleshipBlue battleshipBlue17 = new BattleshipBlue();
        world.addObject(battleshipBlue17,300,150);
        BattleshipBlue battleshipBlue18 = new BattleshipBlue();
        world.addObject(battleshipBlue18,460,150);
        BattleshipBlue battleshipBlue19 = new BattleshipBlue();
        world.addObject(battleshipBlue19,540,150);
        BattleshipBlue battleshipBlue20 = new BattleshipBlue();
        world.addObject(battleshipBlue20,620,150);
        BattleshipBlue battleshipBlue21 = new BattleshipBlue();
        world.addObject(battleshipBlue21,700,150);
        BattleshipBlue battleshipBlue22 = new BattleshipBlue();
        world.addObject(battleshipBlue22,780,150);
        BattleshipBlue battleshipBlue23 = new BattleshipBlue();
        world.addObject(battleshipBlue23,860,150);
        BattleshipBlue battleshipBlue24 = new BattleshipBlue();
        world.addObject(battleshipBlue24,940,150);
        BattleshipBlue battleshipBlue25 = new BattleshipBlue();
        world.addObject(battleshipBlue25,1020,150);
        BattleshipBlue battleshipBlue26 = new BattleshipBlue();
        world.addObject(battleshipBlue26,380,150);

        //Start of BattleshipBlack Objects
        BattleshipBlack battleshipBlack1 = new BattleshipBlack();
        world.addObject(battleshipBlack1,60,420);
        BattleshipBlack battleshipBlack2 = new BattleshipBlack();
        world.addObject(battleshipBlack2,140,420);
        BattleshipBlack battleshipBlack3 = new BattleshipBlack();
        world.addObject(battleshipBlack3,220,420);
        BattleshipBlack battleshipBlack4 = new BattleshipBlack();
        world.addObject(battleshipBlack4,300,420);
        BattleshipBlack battleshipBlack5 = new BattleshipBlack();
        world.addObject(battleshipBlack5,380,420);
        BattleshipBlack battleshipBlack6 = new BattleshipBlack();
        world.addObject(battleshipBlack6,460,420);
        BattleshipBlack battleshipBlack7 = new BattleshipBlack();
        world.addObject(battleshipBlack7,540,420);
        BattleshipBlack battleshipBlack8 = new BattleshipBlack();
        world.addObject(battleshipBlack8,620,420);
        BattleshipBlack battleshipBlack9 = new BattleshipBlack();
        world.addObject(battleshipBlack9,700,420);
        BattleshipBlack battleshipBlack10 = new BattleshipBlack();
        world.addObject(battleshipBlack10,780,420);
        BattleshipBlack battleshipBlack11 = new BattleshipBlack();
        world.addObject(battleshipBlack11,860,420);
        BattleshipBlack battleshipBlack12 = new BattleshipBlack();
        world.addObject(battleshipBlack12,940,420);
        BattleshipBlack battleshipBlack13 = new BattleshipBlack();
        world.addObject(battleshipBlack13,1020,420);
        BattleshipBlack battleshipBlack14 = new BattleshipBlack();
        world.addObject(battleshipBlack14,60,520);
        BattleshipBlack battleshipBlack15 = new BattleshipBlack();
        world.addObject(battleshipBlack15,140,520);
        BattleshipBlack battleshipBlack16 = new BattleshipBlack();
        world.addObject(battleshipBlack16,220,520);
        BattleshipBlack battleshipBlack17 = new BattleshipBlack();
        world.addObject(battleshipBlack17,300,520);
        BattleshipBlack battleshipBlack18 = new BattleshipBlack();
        world.addObject(battleshipBlack18,380,520);
        BattleshipBlack battleshipBlack19 = new BattleshipBlack();
        world.addObject(battleshipBlack19,460,520);
        BattleshipBlack battleshipBlack20 = new BattleshipBlack();
        world.addObject(battleshipBlack20,540,520);
        BattleshipBlack battleshipBlack21 = new BattleshipBlack();
        world.addObject(battleshipBlack21,620,520);
        BattleshipBlack battleshipBlack22 = new BattleshipBlack();
        world.addObject(battleshipBlack22,700,520);
        BattleshipBlack battleshipBlack23 = new BattleshipBlack();
        world.addObject(battleshipBlack23,780,520);
        BattleshipBlack battleshipBlack24 = new BattleshipBlack();
        world.addObject(battleshipBlack24,860,520);
        BattleshipBlack battleshipBlack25 = new BattleshipBlack();
        world.addObject(battleshipBlack25,940,520);
        BattleshipBlack battleshipBlack26 = new BattleshipBlack();
        world.addObject(battleshipBlack26,1020,520);
    };
    }    
}
