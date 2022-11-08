import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOption {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\EarlHans Geñoso\\\\Desktop\\\\Resources\\\\driver_v1\\\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		// instead of this driver.manage().window().maximize();
		options.addArguments("--start-maximized");
		// open browser to incognito mode
		options.addArguments("--incognito");
		// inject the options object
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://automationtesting.co.uk");

	}

}