# Locators & Selenium Click

```python
# select 'ID'
driver.findelement (by.id(“idLocator”)).click();

# select 'Class Name'
driver.findelement (by.class.name(“mycheckbox”)).click();

# select 'Tag Name'
driver.findelement(by.tagname(“a”)).click();

# select 'Link Text'
driver.findelement(by.linktext(“facebook”).click();

# returns 'Partial Link Text'
driver.findelement(by.partiallinktext(“zon”)).click();

# returns 'CSS Selector'
driver.findElement(By.cssSelector("#app > section > form > div > div > input:nth-child(3)")).click();

# returns 'Xpath'
driver.findElement(By.xpath("//*[@id=\"app\"]/section/form/div/div/input[1]")).click();
```