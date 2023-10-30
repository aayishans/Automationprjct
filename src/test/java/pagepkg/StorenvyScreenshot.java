package pagepkg;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class StorenvyScreenshot {
	WebDriver driver;
	
	
	public StorenvyScreenshot(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void screenshot() throws Throwable 
	{
		File shot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(shot,new File("C:\\Users\\aayis\\Desktop\\automation\\Wholeshot.png"));
		
		System.out.println("Screenshot successfully");


		

	}
	

}
