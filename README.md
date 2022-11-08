# Selenium Tutorial

## Chrome options class

- the Chrome Options class can be used to set a number of browser options to Chrome when a test is triggered
- For example, we can:

instead of setting the browser to maximize the conventional way ...
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
