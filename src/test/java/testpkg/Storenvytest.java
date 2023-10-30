package testpkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.StorenvyScreenshot;
import pagepkg.Storenvyfileupload;
import pagepkg.Storenvylogin;
import pagepkg.Storenvyprdct;
import pagepkg.Storenvysearchprdct;
import pagepkg.Storenvywindowhandle;
/*import pagepkg.Storenvysearchprdct;*/

public class Storenvytest {WebDriver driver;

@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
}

@BeforeMethod
public void urlload()
{
	driver.get("https://www.storenvy.com/");
}

@Test
public void ctest() throws Throwable
{
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30000));
	driver.navigate().refresh();
			
	
	Storenvylogin l=new Storenvylogin(driver);
	l.Setvalues("aayishanshamsudeen@gmail.com", "Aayish@2002*");
	
	
	Storenvyprdct p=new Storenvyprdct(driver);
	p.nvymouse("https://www.storenvy.com/");
	
	
	Storenvysearchprdct s=new Storenvysearchprdct(driver);
	s.searchnvy("Alia earrings");
	
   /* s.Checkout("abcd efg", "xyz street 11th street kkpp p.o ","ernakulam", "683561", "9747924467");*/
	
	s.Checkout();
    s.homeurl();
   
    
    Storenvyfileupload f=new Storenvyfileupload(driver);
	f.nvyfileupload("hair band");
	f.nvyphotoupload("C:\\Users\\aayis\\Pictures\\Private\\Screenshots\\hairband.png", "Hair band set for kids","https://www.storenvy.com/");
	
	
	Storenvywindowhandle sw=new Storenvywindowhandle(driver);
	sw.nvywindowhandle("abcd@gmail.com","1234");
	
	
	StorenvyScreenshot sc=new StorenvyScreenshot(driver);
	sc.screenshot();




}



}
