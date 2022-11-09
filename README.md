# Selenium Tutorial

## Chrome options class

- the Chrome Options class can be used to set a number of browser options to Chrome when a test is triggered
- For example, we can:

instead of setting the browser to maximize the conventional way
```python
WebDriver driver = new ChromeDriver();
druver.manage().window().maximize(); 
```
We could make use of Chrome Options by writing something like this:
```python
ChromeOptions options = new ChromeOptions();
options.addArguments("--start-maximized");
options.addArguments("--incognito");
WebDriver driver = new ChromeDriver(options);
```
### Chrome Option Choices
#### start-maximized
Opens Chrome in maximize mode
#### headless
Opens Chrome in headless mode
#### disable-extensions
Disables existing extensions on Chrome browser
#### incognito
Opens Chrome in in incognito mode
#### make-default-browser
Makes Chrome default browser
#### version
Print chrome browser version
#### disable-infobars
Prevent Chrime from displaying the notification `Chrome is being controlled by automated software` message
#### disable-popup-blocking
Disables pop-ups displayed on Chrome browser
