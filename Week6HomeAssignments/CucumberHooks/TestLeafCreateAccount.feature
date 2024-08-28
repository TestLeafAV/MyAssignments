Feature: Create Account in Test Leaf
Scenario: Verify successfull Account creation in Test Leaf
#Given Launch Browser and User Logs in and selects Lead
When create lead is selected
And Lead details are provided and submitted
Then Verify Lead is created
