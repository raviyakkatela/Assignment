Project:

	An ecommerce website labelled "http://automationpractice.com" which deals mainly with clothing of different brands.
	This project is to verify user is able to search for a criteria and able to select the item and he/she able to check out the item and complete 	the transaction.	

Scenario: 

	Verify user is able to select the lowest price item and able to checkout and complete the transaction process. 
 
Prerequisites: 

	To run this project, User should download the required jars listed below and configure the build path to the project.
	Chromdriver.exe  -> Modify the path of chromdriver in "createDriver" method of class "Driver".
	Selenium-server-standalone jar
	Junit 
	Cucumber required jars
			
How to run the test: 

	To run the test scenario, Navigate to Runner.java of testRunner package in project folder 'src/main/java'
	Right click on the Runner.java and run as Junit Test.
	
Design: 

	To automate the UI scenario, Used the Cucumber framework with Junit.
		
	Driver.java 
	createDriver method is used for driver initialization.
		
	WebPages.java
	Interface which has all the webelements and its corresponindg method declarations.
	   
	WebPagesImpl.java
	It has methods to enter required information to proceed with scenario steps.
	   
	Steps.java
	It is a StepDefinition and has glue code corresponding to the fature scenario.
	   
	AutomationPractice.feature
	This feature has the scenario which is automated
	
Execution Video: 

	Assignment_Execution.mp4