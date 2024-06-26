import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SelfIntroduction{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Invoking Browser 
		// Chrome - ChromeDriver -> Methods close
		// Firefox - FirefoxDriver -> Methods close
		//System.setProperty("webdriver.chromedriver", "C://SHOAIB DANISH//ChromeDriver//chromedriver-win64.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}
}
