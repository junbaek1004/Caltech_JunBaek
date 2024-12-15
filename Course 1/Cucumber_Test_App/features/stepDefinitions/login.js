const { Given, When, Then } = require('@cucumber/cucumber');
const { Builder, By, until } = require('selenium-webdriver');

let driver;

Given('I am on the login page', async function() {
  driver = await new Builder().forBrowser('chrome').build();
  await driver.get('http://localhost:4200/login');
});

When('I enter a valid email and password', async function() {
  await driver.findElement(By.id('login-email')).sendKeys('test@example.com');
  await driver.findElement(By.id('login-pw')).sendKeys('password123');
});

When('I click the login button', async function() {
  await driver.findElement(By.css('button[type="submit"]')).click();
});

Then('I should see the alert', async function() {
    await driver.wait(until.alertIsPresent(), 5000);
    const alert = await driver.switchTo().alert();
    const alertText = await alert.getText();
    console.log("Alert text:", alertText);
});