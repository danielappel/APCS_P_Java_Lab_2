package Problem_Set_2;
import kareltherobot.*;
import java.awt.Color;

public class Problem1 implements Directions
{
    public static void main(String args[])  {

        //Uncomment the following constructor method and place karel in the correct location
        // and orientation
        SuperKarel karel = new SuperKarel(5, 4, East, 1);  
        
        //your code goes here
        
        
        karel.turnOff();  
    } 

    static {
        World.reset(); 
        World.readWorld("worlds/fig2-7.kwld"); 
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker());
        World.setDelay(50);  
        World.setVisible(true);
    }
}