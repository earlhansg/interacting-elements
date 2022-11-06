# Selenium Tutorial

## BROWSER TAB
- browsers allow you to have more than one window open at a time
- for example, on one tab you might be looking up something on a search engine, while on the other, you might have a news website open
- if we want interact with another tab using Selenum Webdriver, then we need to instruct the driver to "switch to" the window

## driver.getWindowHandles()
- dirver.getWindowHandles() return all windows/tabs handle launched/opened by the same driver instance
- the return data type is String
- we can store all the values returned from driver.getWindowHandles() into a collection that we can then use to iterate and "switch to" the tabs
