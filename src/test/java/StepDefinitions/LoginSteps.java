package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import pages.ComposePage;

public class LoginSteps {
    WebDriver driver;
    LoginPage loginPage;
    ComposePage composePage;

    @Given("^user is on the login page$")
    public void user_is_on_the_login_page() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=Ab5oB3oVXmAvSSF8QDQpwddWQeSURU-OdnY7J3NbZkndp21UKKysRhgA2WrqVpD6ukEPI0wZz0UVSw&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S-281948639%3A1724220405273045&ddm=0");
        loginPage = new LoginPage(driver);
        composePage = new ComposePage(driver);
    }

    @When("^user enters (.*) and (.*)$")
    public void user_enters_name1_and(String mail, String pwd) throws InterruptedException {
        loginPage.enterUsername(mail);
        loginPage.clickNextButton();
        Thread.sleep(5000);
        loginPage.enterPassword(pwd);
        loginPage.clickNextButton();
    }

    @And("^compose a mail$")
    public void compose_a_mail() throws InterruptedException {
        Thread.sleep(2000);
        WebElement closeButton = driver.findElement(By.xpath("//button[@title=\"Close\"]"));
        if (closeButton.isDisplayed()) {
            closeButton.click();
            System.out.println("Button clicked.");
        } else {
            System.out.println("Button not visible.");
        }
        composePage.clickComposeButton();
        composePage.enterRecipient("u2003142@rajagiri.edu.in");
        composePage.enterSubject("PROFESSIONAL EMAIL");
        composePage.enterBody("HEYYYY!! HOW ARE YOU?");
    }

    @Then("^the mail is sent$")
    public void the_mail_is_sent() {
        composePage.clickSendButton();
        System.out.println("The mail is sent");
        driver.quit();
    }
}




















































































//package StepDefinitions;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.cucumber.messages.types.Duration;
//
//public class LoginSteps {
//	 WebDriver driver = new ChromeDriver();
//@Given("^user is on the login page$")
//public void user_is_on_the_login_page() {
//    System.out.println("Inside the home page");
//   
//   
//   driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=Ab5oB3oVXmAvSSF8QDQpwddWQeSURU-OdnY7J3NbZkndp21UKKysRhgA2WrqVpD6ukEPI0wZz0UVSw&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S-281948639%3A1724220405273045&ddm=0");
//   driver.manage().window().maximize();
//}
//
//@When("^user enters (.*) and (.*)$")
//public void user_enters_name1_and(String mail,String pwd) throws InterruptedException {
//	System.out.println("Entering the login credentials");
//	 WebElement usernameField=driver.findElement(By.xpath("//input[@id=\"identifierId\"]"));
//	 usernameField.sendKeys(mail);
//	 driver.findElement(By.xpath("//span[text()='Next']")).click();
//	 Thread.sleep(5000);
//	 WebElement passwordField=driver.findElement(By.name("Passwd"));
//	 passwordField.sendKeys(pwd);
//	 driver.findElement(By.xpath("//span[text()='Next']")).click();
//}
//
//@And("^compose a mail$")
//public void compose_a_mail() throws InterruptedException {
//	System.out.println("Composing a mail to person");
//	try {
//		Thread.sleep(2000);
//	} catch (InterruptedException e) {
//
//		e.printStackTrace();
//	}
//	 WebElement closeButton = driver.findElement(By.xpath("//button[@title=\"Close\"]"));
//     if (closeButton.isDisplayed()) {
//         closeButton.click();
//         System.out.println("Button clicked.");
//     } else {
//         System.out.println("Button not visible.");
//     }
//    driver.findElement(By.xpath("//div[text()='Compose']")).click();
//    Thread.sleep(5000);
//	driver.findElement(By.xpath("//input[@aria-label=\"To recipients\"]")).sendKeys("u2003142@rajagiri.edu.in");
//	driver.findElement(By.xpath("//input[@placeholder=\"Subject\"]")).sendKeys("PROFESSIONAL EMAIL");
//	driver.findElement(By.xpath("//div[@class=\"Am aiL Al editable LW-avf tS-tW\"]")).sendKeys("HEYYYY!!HOW ARE YOU?");
//	
//}
//
//@Then("^the mail is sent$")
//public void the_mail_is_sent() {
//	System.out.println("The mail is sent");
//	driver.findElement(By.xpath("//div[contains(@aria-label, 'Send ‪(Ctrl-Enter)')]")).click();
//}
//
//
//}
