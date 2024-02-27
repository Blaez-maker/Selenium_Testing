package TestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGTest {

    public WebDriver driver = new ChromeDriver();
    String appUrl = "https://gamefaqs.gamespot.com/";

    @Test
    public void gamefaqsHomePage() {
        // launch the firefox browser and open the application url
        driver.get("https://gamefaqs.gamespot.com/");

// maximize the browser window
        driver.manage().window().maximize();

// declare and initialize the variable to store the expected title of the webpage.
        String expectedTitle = "GameFAQs - Video Game Cheats, Reviews, FAQs, Message Boards, and More";

// fetch the title of the web page and save it into a string variable
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);

// enter a valid username in the email textbox
        WebElement search = driver.findElement(By.id("searchtextbox"));
        search.clear();
        search.sendKeys("Shadow Hearts: Covenant");

// close the web browser
        driver.close();
    }
}
