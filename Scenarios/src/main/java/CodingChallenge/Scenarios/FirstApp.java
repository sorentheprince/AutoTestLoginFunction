package CodingChallenge.Scenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;


public class FirstApp {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		WebElement usernameField = driver.findElement(By.id("user-name"));
        usernameField.sendKeys("standard_user");
        
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");
        
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();
        
        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.equals("https://www.saucedemo.com/inventory.html")) {
            System.out.println("User is able to login and navigate the home page");
        } else {
            System.out.println("User is unable to login and navigate the home page");
        }
        
        WebElement menuButton = driver.findElement(By.id("react-burger-menu-btn"));
        menuButton.click();
        
        
        try {
        	Thread.sleep(1000);
        } catch (InterruptedException e) {
        	e.printStackTrace();
        }
        
        WebElement logoutButton = driver.findElement(By.id("logout_sidebar_link"));
        logoutButton.click();
        
        currentUrl = driver.getCurrentUrl();
        if (currentUrl.equals("https://www.saucedemo.com/")) {
            System.out.println("User is able to logout and navigated to the log page");
        } else {
            System.out.println("User is unable to logout and navigated to the login page");
        }
        
        driver.quit();

	}

}
