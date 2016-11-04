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
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        
        //Start of BattleshipBlue Objects
        BattleshipBlue[] battleshipBlues=new BattleshipBlue[26];
        BattleshipBlue battleshipBlue1 = new BattleshipBlue();
        addObject(battleshipBlue1,60,50);
        BattleshipBlue battleshipBlue2 = new BattleshipBlue();
        addObject(battleshipBlue2,140,50);
        BattleshipBlue battleshipBlue3 = new BattleshipBlue();
        addObject(battleshipBlue3,220,50);
        BattleshipBlue battleshipBlue4 = new BattleshipBlue();
        addObject(battleshipBlue4,300,50);
        BattleshipBlue battleshipBlue5 = new BattleshipBlue();
        addObject(battleshipBlue5,380,50);
        BattleshipBlue battleshipBlue6 = new BattleshipBlue();
        addObject(battleshipBlue6,460,50);
        BattleshipBlue battleshipBlue7 = new BattleshipBlue();
        addObject(battleshipBlue7,540,50);
        BattleshipBlue battleshipBlue8 = new BattleshipBlue();
        addObject(battleshipBlue8,620,50);
        BattleshipBlue battleshipBlue9 = new BattleshipBlue();
        addObject(battleshipBlue9,700,50);
        BattleshipBlue battleshipBlue10 = new BattleshipBlue();
        addObject(battleshipBlue10,780,50);
        BattleshipBlue battleshipBlue11 = new BattleshipBlue();
        addObject(battleshipBlue11,860,50);
        BattleshipBlue battleshipBlue12 = new BattleshipBlue();
        addObject(battleshipBlue12,940,50);
        BattleshipBlue battleshipBlue13 = new BattleshipBlue();
        addObject(battleshipBlue13,1020,50);
        BattleshipBlue battleshipBlue14 = new BattleshipBlue();
        addObject(battleshipBlue14,60,150);
        BattleshipBlue battleshipBlue15 = new BattleshipBlue();
        addObject(battleshipBlue15,140,150);
        BattleshipBlue battleshipBlue16 = new BattleshipBlue();
        addObject(battleshipBlue16,220,150);
        BattleshipBlue battleshipBlue17 = new BattleshipBlue();
        addObject(battleshipBlue17,300,150);
        BattleshipBlue battleshipBlue18 = new BattleshipBlue();
        addObject(battleshipBlue18,460,150);
        BattleshipBlue battleshipBlue19 = new BattleshipBlue();
        addObject(battleshipBlue19,540,150);
        BattleshipBlue battleshipBlue20 = new BattleshipBlue();
        addObject(battleshipBlue20,620,150);
        BattleshipBlue battleshipBlue21 = new BattleshipBlue();
        addObject(battleshipBlue21,700,150);
        BattleshipBlue battleshipBlue22 = new BattleshipBlue();
        addObject(battleshipBlue22,780,150);
        BattleshipBlue battleshipBlue23 = new BattleshipBlue();
        addObject(battleshipBlue23,860,150);
        BattleshipBlue battleshipBlue24 = new BattleshipBlue();
        addObject(battleshipBlue24,940,150);
        BattleshipBlue battleshipBlue25 = new BattleshipBlue();
        addObject(battleshipBlue25,1020,150);
        BattleshipBlue battleshipBlue26 = new BattleshipBlue();
        addObject(battleshipBlue26,380,150);
        
        //Start of BattleshipBlack Objects
        BattleshipBlack battleshipBlack1 = new BattleshipBlack();
        addObject(battleshipBlack1,60,420);
        BattleshipBlack battleshipBlack2 = new BattleshipBlack();
        addObject(battleshipBlack2,140,420);
        BattleshipBlack battleshipBlack3 = new BattleshipBlack();
        addObject(battleshipBlack3,220,420);
        BattleshipBlack battleshipBlack4 = new BattleshipBlack();
        addObject(battleshipBlack4,300,420);
        BattleshipBlack battleshipBlack5 = new BattleshipBlack();
        addObject(battleshipBlack5,380,420);
        BattleshipBlack battleshipBlack6 = new BattleshipBlack();
        addObject(battleshipBlack6,460,420);
        BattleshipBlack battleshipBlack7 = new BattleshipBlack();
        addObject(battleshipBlack7,540,420);
        BattleshipBlack battleshipBlack8 = new BattleshipBlack();
        addObject(battleshipBlack8,620,420);
        BattleshipBlack battleshipBlack9 = new BattleshipBlack();
        addObject(battleshipBlack9,700,420);
        BattleshipBlack battleshipBlack10 = new BattleshipBlack();
        addObject(battleshipBlack10,780,420);
        BattleshipBlack battleshipBlack11 = new BattleshipBlack();
        addObject(battleshipBlack11,860,420);
        BattleshipBlack battleshipBlack12 = new BattleshipBlack();
        addObject(battleshipBlack12,940,420);
        BattleshipBlack battleshipBlack13 = new BattleshipBlack();
        addObject(battleshipBlack13,1020,420);
        BattleshipBlack battleshipBlack14 = new BattleshipBlack();
        addObject(battleshipBlack14,60,520);
        BattleshipBlack battleshipBlack15 = new BattleshipBlack();
        addObject(battleshipBlack15,140,520);
        BattleshipBlack battleshipBlack16 = new BattleshipBlack();
        addObject(battleshipBlack16,220,520);
        BattleshipBlack battleshipBlack17 = new BattleshipBlack();
        addObject(battleshipBlack17,300,520);
        BattleshipBlack battleshipBlack18 = new BattleshipBlack();
        addObject(battleshipBlack18,380,520);
        BattleshipBlack battleshipBlack19 = new BattleshipBlack();
        addObject(battleshipBlack19,460,520);
        BattleshipBlack battleshipBlack20 = new BattleshipBlack();
        addObject(battleshipBlack20,540,520);
        BattleshipBlack battleshipBlack21 = new BattleshipBlack();
        addObject(battleshipBlack21,620,520);
        BattleshipBlack battleshipBlack22 = new BattleshipBlack();
        addObject(battleshipBlack22,700,520);
        BattleshipBlack battleshipBlack23 = new BattleshipBlack();
        addObject(battleshipBlack23,780,520);
        BattleshipBlack battleshipBlack24 = new BattleshipBlack();
        addObject(battleshipBlack24,860,520);
        BattleshipBlack battleshipBlack25 = new BattleshipBlack();
        addObject(battleshipBlack25,940,520);
        BattleshipBlack battleshipBlack26 = new BattleshipBlack();
        addObject(battleshipBlack26,1020,520);

    }
}
