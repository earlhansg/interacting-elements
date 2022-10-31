# JUnit's Assertion

Assertions is a collection of utility methods that support asserting conditions in tests.

```python
# Comparing totalValue to expectedValue using Assertion
String totalValue = driver.findElement(By.cssSelector(".product-total > .value")).getText();
Assert.assertEquals("$26.12", totalValue);
