# SauceDemo Login Testing
[![License](https://img.shields.io/badge/License-MIT-blue.svg)](https://opensource.org/licenses/MIT)
## Overview

This project is a Java-based automated testing solution using Selenium WebDriver, designed to thoroughly test the login functionality of the SauceDemo website. The testing encompasses two primary scenarios: successful login and logout, as well as the handling of login attempts with locked-out user accounts.

### Key Features

- **Scenario 1: Successful Login and Logout**
  - Demonstrates a seamless login experience using standard user credentials.
  - Validates successful navigation to the home page.
  - Gracefully logs out and confirms the return to the login page.

- **Scenario 2: Handling Locked-Out User Accounts**
  - Handles login attempts with locked-out user credentials.
  - Verifies the presentation of a user-friendly error message.
    
*The project uses Apache Maven. This simplifies the setup process for Selenium Java by automating the retrieval of required JAR files from the Maven repository.*
    
## Usage

1. Clone the repository to your local machine.
2. Open the project in your preferred Java Integrated Development Environment (IDE).
3. Run the `FirstApp.java` and `SecondApp.java` respectively inside the `./src/main/java/CodingChallenge/Scenarios/` folder to execute the test scenarios.

**Acknowledgements:**
- Special thanks to the following resources for their invaluable guides and documentation:
  - [BrowserStack Guide: Login Automation using Selenium WebDriver](https://www.browserstack.com/guide/login-automation-using-selenium-webdriver)
  - [Sauce Labs Documentation](https://docs.saucelabs.com/web-apps/automated-testing/selenium/)
  - [Selenium Official Documentation](https://www.selenium.dev/documentation/)
  - [Maven Documentaion](https://maven.apache.org/guides/)
  - [Maven Repository](https://mvnrepository.com/)

**This project has been created as a part of my internship application requirement.**

## Disclaimer

This project is intended for educational and testing purposes only. It utilizes publicly available test credentials provided by Sauce Labs for demonstration purposes on their SauceDemo website. Do not use this program with real user accounts or sensitive information.
