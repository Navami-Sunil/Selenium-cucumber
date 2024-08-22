package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ComposePage {
     WebDriver driver;

  By composeButton = By.xpath("//div[text()='Compose']");
  By recipientField = By.xpath("//input[@aria-label='To recipients']");
  By subjectField = By.xpath("//input[@placeholder='Subject']");
  By bodyField = By.xpath("//div[@class='Am aiL Al editable LW-avf tS-tW']");
  By sendButton = By.xpath("//div[contains(@aria-label, 'Send ‪(Ctrl-Enter)')]");

    public ComposePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickComposeButton() {
        WebElement composeElement = driver.findElement(composeButton);
        composeElement.click();
    }

    public void enterRecipient(String recipient) {
        WebElement recipientElement = driver.findElement(recipientField);
        recipientElement.sendKeys(recipient);
    }

    public void enterSubject(String subject) {
        WebElement subjectElement = driver.findElement(subjectField);
        subjectElement.sendKeys(subject);
    }

    public void enterBody(String body) {
        WebElement bodyElement = driver.findElement(bodyField);
        bodyElement.sendKeys(body);
    }

    public void clickSendButton() {
        WebElement sendElement = driver.findElement(sendButton);
        sendElement.click();
    }
}
