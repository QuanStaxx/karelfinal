import kareltherobot.*;
/**
 * Write a description of class TreasureDriver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WindowDriver implements Directions
{
   public static void main(String[] args)
   {
        World.reset();
        World.setDelay(1);
        World.readWorld("windowWorld.kwld");
        World.setTrace(true);
        World.setVisible(true);
       WindowCloser bot = new WindowCloser(7, 5, East, infinity);
       bot.work();
    }
}
