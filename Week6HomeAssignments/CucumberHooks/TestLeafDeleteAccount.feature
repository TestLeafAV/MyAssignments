Feature: Delete Account in Test Leaf
Scenario: Verify successfull Deletion of Account in Test Leaf
#Given Launch Browser and User Logs in and selects Lead
When lead is searched and deleted
Then Verify Lead is deleted