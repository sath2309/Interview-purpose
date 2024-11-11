package Starting_Interview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome_incongnito {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("http://www.google.com");
		
}
}