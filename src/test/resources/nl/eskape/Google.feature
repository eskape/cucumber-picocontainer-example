Feature: Google Search

Scenario:
	Given I am on the Google page
	When I search "cats" in the search box
	Then "cats" should be mentioned in the results