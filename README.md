# Selenium Explicit Wait

Set at element level
Applies only to the element it is set against
Must always specify "ExpectedConditions" on the element to be located
Best used when an element tends to a while to load

## Why use ?
some of the elements are not identical to appear or load. EXAMPLE: Elemen1 needs 10secs, Element2 needs 5secs and so on... This will be a best approach if you want to create specific "waits" intended to every element requirements

```python
# Imports
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

# Create level element wait / you can use it to another or create your own level element wait intended for another
WebDriverWait wait = new WebDriverWait(driver, 10);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button#loaderBtn")));
driver.findElement(By.cssSelector("button#loaderBtn")).click();
