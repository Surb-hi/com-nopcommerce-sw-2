package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    //Use @before junit method for open a browser for method
    public void setup() {
        openbrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        //regiter elements
        WebElement registerlink = driver.findElement(By.linkText("Register"));
        registerlink.click();

        //actualresult
        WebElement actualresult = driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
        String actualmsg = actualresult.getText();

        //expectedresult
        String expectedmsg = "Register";

        ////match actalresult and expected result
        Assert.assertEquals("", actualmsg, expectedmsg);
    }
    @Test
    public void userSholdRegisterAccountSuccessfully(){
        //regiter elements
        WebElement registerlink = driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
        registerlink.click();

        //gender elements
        WebElement genderFields=driver.findElement(By.id("gender-female"));
        genderFields.click();

        //Firstname elements
        WebElement firstnameField=driver.findElement(By.id("FirstName"));
        firstnameField.sendKeys("surbhi");

        //Lastname elements
        WebElement lastnameField=driver.findElement(By.name("LastName"));
        lastnameField.sendKeys("kakadiya");

        //Date of birth elements
        WebElement dateofbirthField=driver.findElement(By.xpath("//select[@name='DateOfBirthDay']/option[2]"));
        dateofbirthField.click();

        //month of birth elements
        WebElement monthofbirthField=driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']/option[6]"));
        monthofbirthField.click();

        //Year of birth elements
        WebElement yearofbirthField=driver.findElement(By.xpath("//option[contains(text(),'1997')]"));
        yearofbirthField.click();

        //Email address elements
        WebElement EmailField=driver.findElement(By.name("Email"));
        EmailField.sendKeys("prime123@gmail.com");

        // Password elements
        WebElement PasswordField=driver.findElement(By.name("Password"));
        PasswordField.sendKeys("prime123");

        //Confirm password
        WebElement ConfirmpasswordField=driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
        ConfirmpasswordField.sendKeys("prime123");

        //Click on REGISTER button
        WebElement registerbutton=dateofbirthField.findElement(By.xpath("//button[@id='register-button']"));
        registerbutton.click();;

        //actualresult
        WebElement actualresult=driver.findElement(By.xpath("//h1[contains(text(),'Register')]"));
        String actualmsg=actualresult.getText();

        //expected result
        String expectedresult="Your registration completed";

        //match actualresult and xpectetd result
        Assert.assertEquals("User is alredy exit",actualmsg,expectedresult);
    }
}

