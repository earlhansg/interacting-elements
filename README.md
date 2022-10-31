# Selenium Popups

Switching controls from Parent to Child


```python
# Get current window use which is your "MAIN" window
String MainWindow = driver.getWindowHandle();
# Using a set to store all open window handle id's
Set<String> handles =  driver.getWindowHandles();
# Creating an iteraor object to parse through each value in the set
Iterator <String> iterate = handles.iterator();
# While loop checks to see if there is a next value in the set
while(iterate.hasNext()) {
	# Child variables stores the value of the next window handle id
	String child = iterate.next();
		# Checks to make sure the Main window id is not the same as the child window	
		if(!MainWindow.equalsIgnoreCase(child)) {
			Thread.sleep(3000);
			# Switches focus to the child window
			driver.switchTo().window(child);
			# Closes it
			driver.close();
		}
}
Thread.sleep(3000);
# Brings focus to the Main window
driver.switchTo().window(MainWindow);
# Clicks the trigger button, proving focus was returned to the main window
driver.findElement(By.cssSelector("[onclick='alertTrigger\\(\\)']")).click();
