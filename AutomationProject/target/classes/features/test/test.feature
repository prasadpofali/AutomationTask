Feature: Test log in to Canopy

#	Scenario: Log in to the Canopy homepage
#		Given Canopy homepage is loaded
#		When navigated to Canopy Homepage
#		Then User should be able to log in

	Scenario: Navigate to Create Task
		Given User is logged in
		When navigated to Stashboard
		And Created a new task
		Then Stashboard should be displayed