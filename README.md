# Locators & Selenium Radio Buttons

```python
# select 'cssSelector' and click all radio button with the interval of 3 seconds
driver.get("https://www.automationtesting.co.uk/dropdown.html");
driver.findElement(By.cssSelector("[for='demo-priority-low']")).click();
Thread.sleep(3000);
driver.findElement(By.cssSelector("[for='demo-priority-normal']")).click();
Thread.sleep(3000);
driver.findElement(By.cssSelector("[for='demo-priority-high']")).click();
