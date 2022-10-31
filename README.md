#Selenium Hidden Elements, isDisplayed()

Checking elements whether hidden or not

```python
# output was FALSE
System.out.println(driver.findElement(By.cssSelector(".col-12.col-12-small > p:nth-of-type(2)")).isDisplayed());
# output was TRUE
System.out.println(driver.findElement(By.cssSelector(".col-12.col-12-small > p:nth-of-type(3)")).isDisplayed());
