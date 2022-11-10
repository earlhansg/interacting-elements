# Selenium Tutorial

## What are COOKIES ?
- Cookies are messages that web servers pass to your web browser when you visit internet sites
- Your browser stores each message in a small file, called cookie.txt
- When you request another page from the server, your browser sends the cokkie back to the server
- These files typically contain information about your visit to the web page, as well as any information you've voluntered such as your name etc.
- Cookies are used to maintain sessions between the server and client

## Selenium Cookie Command
- The below commands can be set by using driver.manage()
- We are able to add, return or delete cookies based on our requirements

```python
driver.manage().addCookie(arg0);
driver.manage().getCookies();
driver.manage().getCookieNamed(arg0);
driver.manage().deleteCookie(arg0);
driver.manage().deleteCookieNamed(arg0);
driver.manage().deleteAllCookies();
```
