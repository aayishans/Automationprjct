package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Storenvyprdct {
	WebDriver driver;
	
	By women=By.xpath("//a[contains(text(),\"Women's\")]");
	By dress=By.xpath("//a[contains(text(),'Dresses')]");
	By tshirt=By.xpath("//body/div[@id='wrapper']/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/a[1]/img[1]");
	
	
	public Storenvyprdct(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void nvymouse(String homeurl)
	{
		Actions act=new Actions(driver);
		WebElement p=driver.findElement(women);
		act.moveToElement(p).perform();
		
		driver.findElement(dress).click();
		driver.findElement(tshirt).click();
		
		System.out.println("mousehover successfull");
		
		driver.navigate().to(homeurl);
		
	}

}
