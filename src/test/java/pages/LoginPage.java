package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;

    private By usernameField = By.id("identifierId");
    private By nextButton = By.xpath("//span[text()='Next']");
    private By passwordField = By.name("Passwd");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String email) {
        WebElement usernameElement = driver.findElement(usernameField);
        usernameElement.sendKeys(email);
    }

    public void clickNextButton() {
        WebElement nextButtonElement = driver.findElement(nextButton);
        nextButtonElement.click();
    }

    public void enterPassword(String password) {
        WebElement passwordElement = driver.findElement(passwordField);
        passwordElement.sendKeys(password);
    }
}
