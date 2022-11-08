# Selenium Tutorial

## JavascriptExecutor INTERFACE METHODS

### JavascriptExecutor interface provides two methods, as follows:
- executeScript()
- executeAsyncScript()

The main difference between these are that scripts executed with async must explicitly signal they are finished by invoking the provided callback

This callback is always injected into the executed function as the last argument

## Using the Javascript Executor

- the below code is usually used when making use of the JavascriptExecutor interface
- we are referencing the interface (js) and assigning the driver instance to it
- we then use the executeScript method you need to provide a Script and an optional Argument

```python
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript(Script, Arguments);
