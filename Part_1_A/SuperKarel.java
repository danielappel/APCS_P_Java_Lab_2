package Part_1_A;
import kareltherobot.*;


public class SuperKarel extends Robot
{
    /**
     * Constructor for objects of class SuperKarel
     */
    public SuperKarel(int st, int av, Direction dir, int numBeepers)
    {
        super(st, av, dir, numBeepers);
    }
    
    public void turnRight() {
        //If you want it to "look" like it's turning right
        //World.setDelay(0); 
        turnLeft();
        turnLeft();
        turnLeft();
        World.setDelay(50); 
    }
    
}


