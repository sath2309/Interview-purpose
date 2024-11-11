package Starting_Interview;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headlesstest_Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ChromeOptions option = new ChromeOptions();
 
 option.addArguments("--headless=new");
 
		WebDriver driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http:\\www.amazon.in");
		
		driver.manage().window().maximize();
		
		WebElement select =driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		
		select.sendKeys("mobile");
		
		WebElement submit = driver.findElement(By.xpath("//*[@id=\"nav-search-bar-form\"]/div[3]/div"));
		submit.click();
		
		System.out.println("test completed");
		
		driver.quit();
		
		
		
		
		
		
	}

}
