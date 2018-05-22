package Problem_Set_2;
import kareltherobot.*;
import java.awt.Color;

public class Problem3 implements Directions
{
    public static void main(String args[])  {
        SuperKarel karel = new SuperKarel(1, 2, East, 1);  
        
        karel.turnOff();  
    } 

    static {
        World.reset(); 
        World.readWorld("worlds/fig2-9.kwld"); 
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker());
        World.setDelay(50);  
        World.setVisible(true);
    }
}