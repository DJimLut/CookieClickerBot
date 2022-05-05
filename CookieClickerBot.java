// Importing proper libraries...

import java.awt.AWTException;
import java.awt.Desktop;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.TimeUnit;

public class CookieClickerBot 
{
	public static void main(String[] args) throws IOException, URISyntaxException, InterruptedException, AWTException
	{
		String url = "https://orteil.dashnet.org/cookieclicker/"; // URL of cookie clicker website
        if (Desktop.isDesktopSupported())
        {
        	Desktop desktop = Desktop.getDesktop(); // Creating Desktop variable then assigning it to the user's desktop
        	desktop.browse(new URI(url)); // Open Browser
        	TimeUnit.SECONDS.sleep(2); // Wait for browser to load
        	
        	Robot robot = new Robot(); // Creating new robot object
        	robot.mouseMove(250, 450); // moving mouse to cookie
        	for (int i = 0; i < 1000; i++) // iterating clicking 1000 times
        	{
        		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        		Thread.sleep(50);
        	}
			// Closing cookie clicker tab
        	robot.keyPress(KeyEvent.VK_CONTROL);
        	robot.keyPress(KeyEvent.VK_W);
        	robot.keyPress(KeyEvent.VK_CONTROL);
        	robot.keyPress(KeyEvent.VK_W);
        }
	}
}
