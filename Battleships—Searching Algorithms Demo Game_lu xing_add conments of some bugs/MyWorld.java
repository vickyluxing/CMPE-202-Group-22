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
        BattleshipBlack[] battleshipBlacks=new BattleshipBlack[26];
        int[] arrBS=LogicCore.generateBSArr();
        int[] arrLS=new int[26];
        System.arraycopy(arrBS,0,arrLS,0,arrBS.length);
        java.util.Arrays.sort(arrBS);
        int ans=Greenfoot.getRandomNumber(26);
        this.showText("Find this number : "+arrBS[ans]+"",900,300);
        
        for(int i=0;i<13;i++){
            battleshipBlues[i]=new BattleshipBlue(arrBS[i],arrBS[ans]);
            battleshipBlacks[i]=new BattleshipBlack(arrLS[i],arrBS[ans]);
            addObject(battleshipBlues[i],60+i*80,50);
            addObject(battleshipBlacks[i],60+i*80,420);
        }
        for(int i=13;i<26;i++){
            battleshipBlues[i]=new BattleshipBlue(arrBS[i],arrBS[ans]);
            addObject(battleshipBlues[i],60+(i-13)*80,150);
            battleshipBlacks[i]=new BattleshipBlack(arrLS[i],arrBS[ans]);
            addObject(battleshipBlacks[i],60+(i-13)*80,520);
        }
    }
        
}
