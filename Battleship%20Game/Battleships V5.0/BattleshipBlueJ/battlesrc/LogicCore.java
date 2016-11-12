package battlesrc;


public class LogicCore
{
    // instance variables - replace the example below with your own
    public  static int[] generateRandomArr() {
        int[] ranArr=new int[26];
        for(int i=0;i<26;i++){
            ranArr[i]=(int)(Math.random()*1001);
        }
        return ranArr;
    }
    
   
}
