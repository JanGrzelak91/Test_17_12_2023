import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UltimateQATest {

    // zmienne globalne

    String projectLocation = System.getProperty("user.dir");
    ChromeDriver driver;

    @BeforeEach
    public void setup()
    {
        System.setProperty("webdriver.chrome.driver", projectLocation + "/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ultimateqa.com/simple-html-elements-for-automation/");
    }

    @Test
    public void testOne()
    {
        WebElement button = driver.findElementById("idExample");
        button.click();

        // assertions - sprawdzenie

        WebElement text = driver.findElementByClassName("entry-title");
        Assertions.assertEquals("Button success", text.getText());
    }

    @AfterEach
    public void teardown()
    {
       // driver.quit();
    }

    @Test
    public void testTwo()
    {
        WebElement nameInput = driver.findElementByName("et_pb_contact_name_0");
        nameInput.sendKeys("Tester");

        WebElement emailInput = driver.findElementByName("et_pb_contact_email_0");
        emailInput.sendKeys("tester@test.com");

    }

    @Test
    public void testThree()
    {
        
    }
}

// skracanie czasu oczekiwania w Selenium
// implicit wait / explicit wait / fluent wait / Tread.sleep