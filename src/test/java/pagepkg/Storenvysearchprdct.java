package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Storenvysearchprdct {
	WebDriver driver;
	
	By sfield=By.xpath("//input[@id='header-keyword-search']");
	By sbutton=By.xpath("//i[contains(text(),'Search')]");
	
	By earring=By.xpath("//body/div[@id='wrapper']/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/a[1]/img[1]");
	By cart=By.name("submit");
	By vchart=By.xpath("//a[contains(text(),'View Cart')]");
	
	By oder=By.xpath("//body/div[@id='app-wrapper']/div[1]/div[3]/div[3]/form[1]/div[1]/div[1]/input[1]");
	By click=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]");
	
	/*By fname=By.name("full_name");
	By street=By.xpath("//body/div[@id='app-wrapper']/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/form[1]/div[1]/div[3]/input[1]");
	By city=By.name("city");
	By state=By.xpath("//body/div[@id='app-wrapper']/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/form[1]/div[1]/div[5]/div[1]/select[1]");
	By kerala=By.xpath("//option[contains(text(),'Kerala')]");
	By zip=By.xpath("//body/div[@id='app-wrapper']/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[6]/input[1]");
	By phoneno=By.xpath("//body/div[@id='app-wrapper']/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/form[1]/div[1]/div[7]/input[1]");
	
	By save=By.xpath("//button[contains(text(),'Save and Continue')]");*/
	
	By conti=By.xpath("//button[contains(text(),'Continue')]");
	
	By home=By.xpath("//*[@id=\"app-wrapper\"]/div/div[1]/div/div[2]/a");
	
	
	
	public Storenvysearchprdct(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void searchnvy(String prdctsearch)
	{
		driver.findElement(sfield).sendKeys(prdctsearch);
		driver.findElement(sbutton).click();
		
		driver.findElement(earring).click();
		driver.findElement(cart).click();
		
		driver.findElement(vchart).click();
		
	}
	
	public void Checkout()
	{
		driver.findElement(oder).click();
		driver.findElement(click).click();
		
		/*driver.findElement(fname).sendKeys(fullname);
		driver.findElement(street).sendKeys(streetname);
		driver.findElement(city).sendKeys(cityname);
		driver.findElement(state).click();
		driver.findElement(kerala).click();
		driver.findElement(zip).sendKeys(postalcode);
		driver.findElement(phoneno).sendKeys(mobileno);
		
		driver.findElement(save).click();*/
		driver.findElement(conti).click();
		
	}
	public void homeurl()
	{
		
		
		driver.findElement(home).click();
		
		System.out.println("Search product successfully");
			
		
	}

}
