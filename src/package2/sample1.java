package package2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class sample1 {
	
	@Test
	 public void run()
	 {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\newselenium\\Simplemaven\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://docs.seleniumhq.org/");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver. findElement(By.xpath("//a[text()='Download']")).click();
		System.out.println(driver.getTitle());
		driver.close();
		
		
	 }
}
