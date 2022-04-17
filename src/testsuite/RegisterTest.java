package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    //Use @before junit method for open a browser for method
    public void setup() {
        openbrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {

        //computer element
        WebElement Computerlink = driver.findElement(By.linkText("Computers"));
        Computerlink.click();

        //Actuall result
        WebElement actualresult = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]"));
        String actualmsg = actualresult.getText();

        //expected result
        String expectedresult = "Computers";

        //Match actual result and expectedresult
        Assert.assertEquals(actualmsg, expectedresult);

    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {

        //Electronics elements
        WebElement Electrinicslinks = driver.findElement(By.linkText("Electronics"));
        Electrinicslinks.click();

        //Actalresult
        WebElement actualresult = driver.findElement(By.xpath("//h1[contains(text(),'Electronics')]"));
        String actualmsg = actualresult.getText();

        //ecpectedresult
        String expectedresult = "Electronics";

        //match actallresult and expectedresult
        Assert.assertEquals(actualmsg, expectedresult);
    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {

        //Apparelink elements
        WebElement apparelink = driver.findElement(By.linkText("Apparel"));
        apparelink.click();

        //actualresult
        WebElement actualresult = driver.findElement(By.xpath("//h1[contains(text(),'Apparel')]"));
        String actualmsg = actualresult.getText();

        //expectedresult
        String expectedmsg = "Apparel";

        //match actuall and expected result
        Assert.assertEquals("User is not on appareal page", actualmsg, expectedmsg);
    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {

        //digitaldownload elements
        WebElement digitaldownloadslink = driver.findElement(By.linkText("Digital downloads"));
        digitaldownloadslink.click();

        //actualresult
        WebElement actualresult = driver.findElement(By.xpath("//h1[contains(text(),'Digital downloads')]"));
        String actualmsg = actualresult.getText();

        //expectedresult
        String expectedmsg = "Digital downloads";

        //match actalresult and expected result
        Assert.assertEquals(actualmsg, expectedmsg);
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        //bboks elements
        WebElement bookslink = driver.findElement(By.linkText("Books"));
        bookslink.click();

        //actualresult
        WebElement actualresult = driver.findElement(By.xpath("//h1[contains(text(),'Books')]"));
        String actualmsg = actualresult.getText();

        //expectedresult
        String expectedmsg = "Books";

        //match actalresult and expected result
        Assert.assertEquals(actualmsg, expectedmsg);
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        //jewelry elemetns
        WebElement jewelrylink = driver.findElement(By.linkText("Jewelry"));
        jewelrylink.click();

        //actualresult
        WebElement actualresult = driver.findElement(By.xpath("//h1[contains(text(),'Jewelry')]"));
        String actualmsg = actualresult.getText();

        //expectedresult
        String expectedmsg = "Jewelry";

        //match actalresult and expected result
        Assert.assertEquals(actualmsg, expectedmsg);

    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
        //Giftcard elements
        WebElement giftcardlink = driver.findElement(By.linkText("Gift Cards"));
        giftcardlink.click();

        //actualresult
        WebElement actualresult = driver.findElement(By.xpath("//h1[contains(text(),'Gift Cards')]"));
        String actualmsg = actualresult.getText();

        //expectedresult
        String expectedmsg = "Gift Cards";

        //match actalresult and expected result
        Assert.assertEquals(actualmsg, expectedmsg);
    }

    @After
    //Here After method for close the browser
    public void teardown() {
        closebrowser();

    }

}

