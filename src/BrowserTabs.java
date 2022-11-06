import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTabs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\EarlHans Ge�oso\\Desktop\\Resources\\driver_v1\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://www.automationtesting.co.uk/browserTabs.html");
		
		for(int i=0; i<3; i++) {
			driver.findElement(By.xpath("//input[@value='Open Tab']")).click();
		}
		// store all windows open
		ArrayList<String> windowsHandles = new ArrayList<String>(driver.getWindowHandles());
		System.out.println("There are " + windowsHandles.size() + " tabs open");
		
		for(String item:windowsHandles) {
			Thread.sleep(1500);
			// switch to specific window
			driver.switchTo().window(item);
		}
		
		Thread.sleep(2000);
		// switch to main window /  first window
		driver.switchTo().window(windowsHandles.get(0));
		
	}

}
