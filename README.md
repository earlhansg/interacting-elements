# Selenium Tutorial

## JavascriptExecutor INTERFACE METHODS

### JavascriptExecutor interface provides two methods, as follows:
- executeScript()
- executeAsyncScript()

The main difference between these are that scripts executed with async must explicitly signal they are finished by invoking the provided callback

This callback is always injected into the executed function as the last argument
