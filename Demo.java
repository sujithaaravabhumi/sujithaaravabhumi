import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		//invoke .exe file 
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\rekha\\Desktop\\Automation\\chromedriver.exe");

		  // WebDriver driver=new ChromeDriver();

		   //driver.get("https://www.google.com/");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sujij\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.netonnet.se/");
		System.out.println(driver.getTitle());
		System.out.print(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		driver.close();

	}

}
