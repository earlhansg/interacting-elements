# Locators & Selenium textarea, input, sendkeys()

```python
# select 'cssSelector' & send data to input
driver.findElement(By.cssSelector("input[name='first_name']")).sendKeys("John");
driver.findElement(By.cssSelector("input[name='last_name']")).sendKeys("Smith");
driver.findElement(By.cssSelector("input[name='email']")).sendKeys("johnsmith@test.com");

# select 'cssSelector' & send data to textarea
driver.findElement(By.cssSelector("textarea[name='message']")).sendKeys("this is my message");
