package pagepkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Storenvywindowhandle {
WebDriver driver;
	
	By insta=By.xpath("//body/div[@id='footer']/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/a[3]");
	
	By login=By.xpath("//a[contains(text(),'Log In')]");
	By logemail=By.name("username");
	By logpsswrd=By.name("password");
	By logb=By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/section[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[3]");
	
	
	
	public Storenvywindowhandle(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void nvywindowhandle(String email,String password)
	{
		String storewindow=driver.getWindowHandle();
		System.out.println("parent window title :"+driver.getTitle());
		driver.findElement(insta).click();
					
		Set<String>allwindowhandles=driver.getWindowHandles();
	       for(String handle:allwindowhandles)
	       {
	    	   System.out.println(handle);
	    	if(!handle.equalsIgnoreCase(storewindow))  
	    	{
	    		driver.switchTo().window(handle);
	    		driver.findElement(login).click();
	    		driver.findElement(logemail).sendKeys(email);
	    		driver.findElement(logpsswrd).sendKeys(password);
	    		driver.close();
	    	}
	    	
	    	driver.switchTo().window(storewindow);
	    	
	       }
		
		
		System.out.println("window handle successfully");
	}

}
