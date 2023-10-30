package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Storenvylogin {
WebDriver driver;
	
	By accnt=By.xpath("//a[@id='log_in']");
    By email=By.xpath("//body/div[@id='wrapper']/div[3]/div[1]/div[1]/div[3]/div[2]/form[1]/div[1]/input[1]");	
   
    By psswrd=By.xpath("//body/div[@id='wrapper']/div[3]/div[1]/div[1]/div[3]/div[2]/form[1]/div[2]/input[1]");
    By log=By.xpath("//input[@id='login_submit']");
    
 
    public Storenvylogin(WebDriver driver)
    {
    	this.driver=driver;
    }
    
    public void Setvalues(String emailfield,String password)
    {

         
    	driver.findElement(accnt).click();
    	driver.findElement(email).sendKeys(emailfield);
    	driver.findElement(psswrd).sendKeys(password);
    
    	driver.findElement(log).click();
    	
    	System.out.println("login successfully");    	
    }

}
