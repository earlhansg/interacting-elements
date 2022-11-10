# Selenium Tutorial

## Requirements & Configuration
- install apache commons io jar
- import jar to the project
	- Right click properties
	- Click "Classpath"
	- Java Build Path
	- Libraries
	- Add external jars
	- Apply and Close
## Why are screenshots useful?
- screenshots act as evidence
- they can help debug problems
- if we have a test step that fails, we'd want to see visual evidence as to why it failed
- screenshots are important from a reporting perspective, as they give context behind a failure
- we can give screenshots files a specific name to prevent file overwrite
## Some things to know
- we are going to create a couple of methods
	- 1. Contain the screenshot code
	- 2. Generate the screenshot file name (using date and time)
- we are going to need to import an external jar called "Apache Commons IO" which is simply a library of utilities to assist with developing IO functionality
	- This will allow us to write a file to a folder on our local machine (e.g. when we take a screenshot and save the file locally)
