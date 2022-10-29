# Locators & Selenium alert, switchTo()

```python
# select 'cssSelector' and click() & switchTo to accept alert popup
driver.findElement(By.cssSelector("[onclick='alertTrigger\\(\\)']")).click();
Thread.sleep(3000);
driver.switchTo().alert().accept();

# to dismiss alert
driver.switchTo().alert().dismiss();
