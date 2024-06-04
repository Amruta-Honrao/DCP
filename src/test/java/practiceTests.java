import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.testng.annotations.Test;

public class practiceTests {

	@Test 
	public void m1() throws IOException, AWTException
	{
		File file = new File("C:\\Amruta Study\\Java\\LamdaExpressions.txt");
		try {
			FileReader fr = new FileReader(file);
			BufferedReader BR = new BufferedReader(fr);
			String s;
			while( (s=BR.readLine()) != null)
			{
				System.out.println(s);
			}
		} catch (FileNotFoundException e) {
			
		}
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(null, null);
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.delay(3000);
	}
	
	
	
}
