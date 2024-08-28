Feature: Edit Account in Test Leaf
Scenario: Verify successfull Account Editn in Test Leaf
#Given Launch Browser and User Logs in and selects Lead
When lead is searched
And Lead details are edited and submitted
Then Verify Lead is updated
