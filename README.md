# Selenium Tutorial with JAVASCRIPT

## What is the JAVASCRIPT executor?

- JavascriptExecutor is an Interface that helps to execute Javascript through Selenium Webdriver
- it allows you to interact directly with HTML DOM of the webpage by executing JavaScript expressions
- it provides a way automate a user interaction even when the paage is not fully loaded, or elements are placed in a way that the direct interaction is blocked

## When could we use it?

- somethimes web controls dont react well using selenium commands
- if we come across a situation where our Selenium test are not functioning as expected (could be various reasons), then we also have the option to interact with the webpage using Javascript
- for example, say we have a button on awebpage and for some reason we cant click on it with the standard Selenium methods
- we could instead click the button by executing Javascript via Selenium using the JavaScriptExecutor interface 
