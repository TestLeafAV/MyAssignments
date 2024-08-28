Feature: Account creation in Salesforce
Scenario Outline: Verify Account creation is Success
Given Salesforce is launched and user is logged in
When Menu button is clicked
And View All options is clicked
And Sales option is clicked
And Accounts Tab is clicked
And New buttton is clicked
And <name> is entered for Account
And Ownership is selected as Public
And Save button is clicked
Then Verify Account is created with entered name
Examples:
|name|
|'Aish'|
|'Aishwarya'|
|'AV'|