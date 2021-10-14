Feature: Test the create lead feature in leaftaps application

Background:
Given Open the browser and launch the 'http://leaftaps.com/opentaps/'
And Enter the 'username' 'DemoSalesManager'
And Enter the 'password' 'crmsfa'
When Click on the submit button

Scenario Outline: Testing the create lead with variour inputs

Then 'Home page' page should be displayed
When Click on the 'CRM/SFA' link
Then 'My Home' page should be displayed
When Click on the 'Leads' link
Then 'My Leads' page should be displayed
When Click on the 'Create Lead' link
Then 'Create Lead' page should be displayed
Given Enter the 'createLeadForm_companyName' <companyName>
Given Enter the 'createLeadForm_firstName' <firstName>
And Enter the 'createLeadForm_lastName' <lastName>
And Enter the 'createLeadForm_primaryPhoneNumber' <phoneNumber>
When Click on submit button
Then New Lead should be created

Examples:
|companyName|firstName|lastName|phoneNumber|
|'Zoho'|'Bharathi'|'Krishna'|'9090'|
|'Trumple'|'Manoharan'|'Krishnamoorthy'|'8080'|
|'FreskDesk'|'Usha'|'Rani'|'7070'|
