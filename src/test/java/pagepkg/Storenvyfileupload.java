package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Storenvyfileupload {
	WebDriver driver;
	
	By store=By.xpath("//body/div[@id='wrapper']/div[2]/div[1]/div[1]/div[3]/a[1]");
	By admin=By.xpath("//a[contains(text(),'Admin Panel')]");
	By collection=By.xpath("//body/div[2]/div[1]/div[1]/ul[1]/a[5]/li[1]/p[1]");
	By newcollectn=By.xpath("//button[contains(text(),'Add New Collection')]");
	By namecollectn=By.xpath("//input[@id='collection_name']");
	By submit=By.name("commit");
	
	By photo=By.xpath("//input[@id='collection_photo']");
	By descriptn=By.xpath("//textarea[@id='collection_description']");
	By save=By.name("commit");
	
	
	public Storenvyfileupload(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void nvyfileupload(String name)
	{
		Actions act=new Actions(driver);
		WebElement p=driver.findElement(store);
		act.moveToElement(p).perform();
		
		driver.findElement(admin).click();
		driver.findElement(collection).click();
		driver.findElement(newcollectn).click();
		driver.findElement(namecollectn).sendKeys(name);
		driver.findElement(submit).click();
		
	}
	
	public void nvyphotoupload(String pic,String descrip,String urlhome)
	{
		driver.findElement(photo).sendKeys(pic);
		driver.findElement(descriptn).sendKeys(descrip);
		driver.findElement(save).click();
		
		System.out.println("file upload successfully");
		
		driver.navigate().to(urlhome);
	}

}
