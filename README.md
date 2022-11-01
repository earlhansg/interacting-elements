# Selenium Implicit Wait

Set globally
Applies to all elements
Does not require a setting of a condition
Best used when all elements are loaded before the duration time set

```python
# Apply 10 seconds wait in every element
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
