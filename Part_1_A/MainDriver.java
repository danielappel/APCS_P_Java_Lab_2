package Part_1_A;
import kareltherobot.*;
import java.awt.Color;

public class MainDriver implements Directions
{
    public static void main(String args[])  {
        // constructor method  UrRobot(street, avenue, Direction, Number Beepers)
        SuperKarel karel = new SuperKarel(3, 2, East, 0);  
        
        karel.turnOff();  
    } 

    static {
        World.reset(); 
        World.readWorld("worlds/Karel-Intro-1.1.kwld"); 
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker());
        World.setDelay(50);  
        World.setVisible(true);
    }
}