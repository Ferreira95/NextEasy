import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.AWTException;
				
public class KeyboardSimulation
{
	private Robot robot;
	final int LEFT = 1;
	final int RIGHT = 2;
	
	public KeyboardSimulation()
	{
		try
		{	
			robot = new Robot();
		}
		catch(AWTException e)
		{
			e.printStackTrace();
		}
		
	}
	
	public void move(int direction)
	{
			int key = direction == 1 ? KeyEvent.VK_LEFT:KeyEvent.VK_RIGHT;
			robot.keyPress(key);
			robot.keyRelease(key);
			robot.delay(1000);
	}

}			

