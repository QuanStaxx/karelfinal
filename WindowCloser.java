import kareltherobot.*;

/**
 * Write a description of class MazeWalker here.
 * 
 * @author Marquan Bowman
 * @version 2015-10-26-1342
 */
public class WindowCloser extends Robot implements Directions
{
    public WindowCloser(int st, int ave, Direction dir, int beeps)
    {
        super(st, ave, dir, beeps);
    }
    
    public void closeWindow()
    {
        if(leftIsClear())
        {
            putBeeper();
        }
    }
    
    public boolean leftIsClear()
    {
        boolean result = false;
        
        turnLeft();
        if(frontIsClear())
        {
            result = true; 
        }
        turnRight();
        
        return result;
    }
    
    public void moveToNextWindow()
    {
        while(!leftIsClear())
        {
            if(!frontIsClear())
        {
            turnRight();
        }
        else
        {
            move();
        }
        }
    }
    
    public void work()
    {
        putBeeper();
        move();
        while(!nextToABeeper())
        {
            moveToNextWindow();  
            closeWindow();
            move();
        }
        pickBeeper();
    }
    
    public void turnRight()
    {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}