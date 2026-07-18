import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class loginToNdosiWebsite {


    WebDriver driver;

    @Test
    public void loginToNdosiWebsiteTest() throws InterruptedException {
        driver = new ChromeDriver();
        Thread.sleep(3000);
        driver.get("https://ndosisimplifiedautomation.vercel.app/#overview");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[3]/button/span[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("login-email")).sendKeys("merry1234@gmail.com");
        driver.findElement(By.id("login-password")).sendKeys("junmafu@123");
        Thread.sleep(3000);
        driver.findElement(By.id("login-submit")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"app-main-content\"]/section/div[1]/div[1]/h2/span[1]")).isDisplayed();
        Thread.sleep(3000);

        driver.quit();



    }
}
