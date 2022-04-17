package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    //Use @before junit method for open a browser for method
    public void setup() {
        openbrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {

        //Find log in link and click on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();

        //expected result
        String expectedMessage = "Welcome, Please Sign In!";

        //Find the text elements
        WebElement actualMsgElemment = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
        String actualMessage = actualMsgElemment.getText();
        System.out.println(actualMessage);

        //Validate actual and expected message
        Assert.assertEquals("Login test fail", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //click in login method
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();

        //Emailfield element
        WebElement UsernameField = driver.findElement(By.id("Email"));
        UsernameField.sendKeys("prime123@gmail.com");

        //Passwordfield element
        WebElement PasswordField = driver.findElement(By.name("Password"));
        PasswordField.sendKeys("123456");

        //loginbutton element
        WebElement LoginButton = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
        LoginButton.click();

        //actual result
        WebElement LogoutLink = driver.findElement(By.linkText("Log out"));
        String actualresult = LogoutLink.getText();

        //expectedresult
        String expectedResult = "Log out";

        //Match expected and actual result
        Assert.assertEquals(expectedResult, actualresult);

    }

    @Test
    public void verifyTheErrorMessage() {
        //click on login field
        WebElement LoginLink = driver.findElement(By.linkText("Log in"));
        LoginLink.click();

        //Username elements
        WebElement EmailField = driver.findElement(By.id("Email"));
        EmailField.sendKeys("prime12@gmail.com");

        //Password elements
        WebElement PasswordField = driver.findElement(By.name("Password"));
        PasswordField.sendKeys("12345");

        //Loginbutton element
        WebElement LogInButton = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
        LogInButton.click();

        //Actuall result
        WebElement actuallresult=driver.findElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]"));
        String actuallmsg=actuallresult.getText();

        //Expected result
        String expectedresult="Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";

        //match actual and expected result
        Assert.assertEquals(actuallmsg,expectedresult);
    }

    @After
    //Here After method for close the browser
    public void teardown() {
        closebrowser();

    }
}


