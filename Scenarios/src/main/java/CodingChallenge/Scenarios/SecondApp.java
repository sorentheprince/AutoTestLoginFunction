package CodingChallenge.Scenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;

public class SecondApp {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");

		WebElement usernameField = driver.findElement(By.id("user-name"));
        usernameField.sendKeys("locked_out_user");
        
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");
        
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();
        
        WebElement errorElement = driver.findElement(By.cssSelector("h3[data-test='error']"));
        String errorMessage = errorElement.getText();
        String expectedMessage = "Epic sadface: Sorry, this user has been locked out.";
        
        assert errorMessage.equals(expectedMessage);
        if (!errorMessage.equals(expectedMessage)) {
            System.out.println("Error message does not match: " + errorMessage);
        }
        
        
        driver.quit();
        

	}

}
