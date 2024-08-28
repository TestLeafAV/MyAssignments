Feature: Account Creation in Salesforce
Scenario: Login with valid credentials
Given Load Url and Launch Salesforce with valid credentials
When Click on toggle menu button
And Click view All
And click Sales
And Click on Accounts tab
And Click on New button
And Enter your name as account name
And Select Ownership as Public
And Click save
Then Verify Account creation is Successful