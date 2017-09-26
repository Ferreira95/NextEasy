import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.Point;
import java.awt.AWTException;

public class NextEasy
{
	public static void main(String[] args)
	{
		MouseController cursor = new MouseController();
		KeyboardSimulation key = new KeyboardSimulation();

		for(;;)
		{
			Point anterior = cursor.getPosition();
			Point atual = cursor.getPosition();
				
			if (atual.x > anterior.x)
				key.move(key.RIGHT);
			else if(atual.x < anterior.x)
				key.move(key.LEFT);
			cursor.centerCursor();		
		}
	}
}
