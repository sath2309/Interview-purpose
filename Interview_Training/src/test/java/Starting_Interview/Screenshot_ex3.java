package Starting_Interview;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http:\\www.amazon.in");
		
		driver.manage().window().maximize();
		
		WebElement targetfile = driver.findElement(By.xpath("//*[@id=\"glow-ingress-line1\"]"));
		
		File screenshot = targetfile.getScreenshotAs(OutputType.FILE);
	
		File screen = new File(System.getProperty("user.dir")+"\\Screenshot\\sathya.png");
		
		screenshot.renameTo(screen);
		
		driver.quit();
	}

}
