import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium 
{

	@Test
	public void test() 
	{
		System.setProperty("webdriver.gecko.driver", "/Users/usermuser/Downloads/geckodriver-master");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.youtube.com/watch?v=rJ4rNZGAzW8");
		driver.quit();
	}

}
