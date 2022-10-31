# Selenium Popups

Switching controls from Parent to Child


```python
# Get current window use which is your "MAIN" window
String MainWindow = driver.getWindowHandle();
# Contains all windows
Set<String> handles =  driver.getWindowHandles();
# Conditions to switch to "CHILD" window
Iterator <String> iterate = handles.iterator();		
while(iterate.hasNext()) {
	String child = iterate.next();
			
		if(!MainWindow.equalsIgnoreCase(child)) {
			Thread.sleep(3000);
			driver.switchTo().window(child);
			driver.close();
		}
}
# Back to "MAIN" window and click button
Thread.sleep(3000);
driver.switchTo().window(MainWindow);
driver.findElement(By.cssSelector("[onclick='alertTrigger\\(\\)']")).click();
