Feature: Edit of an Account in Salesforce
Scenario: Edit of an Valid Account in Salesforce
Given Browser Launched and URL loaded
When Click the App Launcher Icon next to Setup
And Select Accounts is clicked
And Account Name is located
And Edit is clicked
And Type is set to Technology Partner
And Industry is set to Healthcare
And Billing Street 'St.Marys Street' is entered
And Shipping Street 'St.Marys Street' is entered
And Billing City 'Chennai' is entered
And Shipping City 'Chennai' is entered
And Billing PIN '600028' is entered
And Shipping PIN '600028' is entered
And Billing State 'TN' is entered
And Shipping State 'TN' is entered
And Billing Country 'India' is entered
And Shipping Country 'India' is entered
And Customer Priority is set To Low
And SLA set to Silver
And Active set to No
And Unique '1234567890' is entered
And Upsell Opportunity is set to 'No'
And Save is clicked
Then Verify Phone number is entered correctly in record