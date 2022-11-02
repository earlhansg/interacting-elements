# Selenium Fluent Wait
Two primary parameters set with Timeout and pollingevery

withTimeout has been set to 10secs, meaning the wait will wait to a maximum of 10secs before throwing an error

Pollingevery has been set to 1sec, meaning the wait will check at a frequency of every 1sec until the condition is met, or timeout time has breached

A third parameter (ignoring..) has been set where WebDriver will ignore this error if returned before the timeout time is breached

If the condition is not met by the timeout time then a "ElementNotVisibleException" exception is thrown

```python
# Imports
import java.time.Duration;
import java.util.function.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

# Creating web driver wait using FluentWait
Wait<WebDriver> fluent = new FluentWait<WebDriver>(driver)
	.withTimeout(Duration.ofSeconds(10))
	.pollingEvery(Duration.ofSeconds(1))
	.ignoring(NoSuchElementException.class);
		
WebElement para = fluent.until(new Function<WebDriver, WebElement>(){
	public WebElement apply(WebDriver driver) {
		return driver.findElement(By.cssSelector("#appears"));
	}
});
System.out.println(para.getText());
