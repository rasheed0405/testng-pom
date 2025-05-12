package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	protected WebDriver driver;
    protected WebDriverWait wait;

	@BeforeTest
	public void setup() throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rashe\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	}

	@AfterTest
	public void tearDown() {
		driver.quit();

	}
}
