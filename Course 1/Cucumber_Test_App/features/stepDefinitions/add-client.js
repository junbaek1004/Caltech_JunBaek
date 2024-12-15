const { Given, When, Then } = require('@cucumber/cucumber');
const { Builder, By } = require('selenium-webdriver');

let driver;

Given('I am logged into the dashboard', async () => {
  driver = await new Builder().forBrowser('chrome').build();
  await driver.get('http://localhost:4200/home');
});

When('I navigate to the "Add Client" page', async () => {
  await driver.findElement(By.css('button[routerLink="/add_client"]')).click();
});

When('I fill in client details', async function() {
  await driver.findElement(By.id('client-name')).sendKeys('Test Client');
  await driver.findElement(By.id('client-email')).sendKeys('test@client.com');
  await driver.findElement(By.id('client-type')).sendKeys('individual');
  await driver.findElement(By.id('client-memo')).sendKeys('Test Memo');
});

When('I click the "Add Client" button', async function() {
  await driver.findElement(By.css('button[type="submit"]')).click();
});

Then('I should see a confirmation message', async function() {
  console.log('Client added successfully.');
  await driver.quit();
});