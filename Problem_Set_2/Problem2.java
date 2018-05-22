package Problem_Set_2;
import kareltherobot.*;
import java.awt.Color;

public class Problem2 implements Directions
{
    public static void main(String args[])  {
        SuperKarel karel = new SuperKarel(3, 4, West, 0);  
        //your code goes below
        
        
        karel.turnOff();  
    } 

    static {
        World.reset(); 
        World.readWorld("worlds/fig2-8.kwld"); 
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker());
        World.setDelay(50);  
        World.setVisible(true);
    }
}