import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class logInToNdosiMultipleMethod {


    WebDriver driver;

    @BeforeTest

    public void setup() throws InterruptedException{
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ndosisimplifiedautomation.vercel.app/#overview");
        Thread.sleep(2000);

    }

    @Test
    public void clickLogin(){
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[3]/button/span[1]")).click();

    }

    @Test(priority = 1)
    public void enterEmail() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.id("login-email")).sendKeys("merry1234@gmail.com");
    }

    @Test(priority = 2)
    public void enterPassword() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.id("login-password")).sendKeys("junmafu@123");
    }

    @Test(priority = 3)
    public void clickLoginButton() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.id("login-submit")).click();

    }

    @Test(priority = 4)
    public void verifyLogin() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[3]/div/button/span[1]")).isDisplayed();
    }

    @Test(priority = 5)
    public void selectLearnDropdown() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/button/span[2]")).click();

    }

    @Test(priority = 6)
    public void selectLearningMaterials() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/div/button[2]/span[2]")).click();

    }

    @Test(priority = 7)
    public void validateLearningMaterialsPage() throws InterruptedException{
        Thread.sleep(4000);
        driver.findElement(By.xpath("")).isDisplayed();
    }
    @Test(dependsOnMethods = "validateLearningMaterialsPage")
    public void selectWebAutomationBasicForm() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"tab-btn-password\"]/span[2]")).click();
    }

    @Test(dependsOnMethods = "selectWebAutomationBasicForm")
    public void validateBasicPracticeFrom() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.xpath("page-title")).isDisplayed();

    }

    @Test(dependsOnMethods = "validateBasicPracticeFrom")
    public void fillInFullName() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.id("name")).sendKeys("merry mashila");

    }

    @Test(dependsOnMethods ="fillInFullName")
    public void fillInEmailAddress() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.id("email")).sendKeys("merry1234@gmail.com");
    }

    @Test(dependsOnMethods = "fillInEmailAddress" )
    public void fillInAge() throws InterruptedException{
        Thread.sleep(4000);
        driver.findElement(By.id("age")).sendKeys("16");
    }

    @Test(dependsOnMethods = "fillInAge" )
    public void selectGenderButton() throws InterruptedException{
        Thread.sleep(4000);
        driver.findElement(By.id("gender")).click();
    }

    @Test(dependsOnMethods = "selectGenderButton")
    public void selectGender() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"gender\"]")).click();
    }

    @Test(dependsOnMethods = "selectGender")
    public void selectCountryButton() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.id("country")).click();
    }
    @AfterTest
    public void quitBrowser(){
        driver.quit();

    }
}

