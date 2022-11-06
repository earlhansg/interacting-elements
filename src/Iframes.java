import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\EarlHans Geñoso\\Desktop\\Resources\\driver_v1\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.automationtesting.co.uk/iframes.html");
		
		// switch to first index value
		driver.switchTo().frame(0);
		driver.findElement(By.cssSelector(".toggle")).click();
		
		Thread.sleep(2000);
		
		// switch to parent/main frame
		driver.switchTo().parentFrame();
		driver.findElement(By.cssSelector(".toggle")).click();
		
		Thread.sleep(2000);
		
		// switch to second index value which is youtube site
		driver.switchTo().frame(1);
		driver.findElement(By.cssSelector("[aria-label='Play']")).click();
		
	}

}
