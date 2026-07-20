package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class logInToNdosiMultipleMethod {


    WebDriver driver;

    @BeforeTest

    public void setup() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ndosisimplifiedautomation.vercel.app/#overview");
        Thread.sleep(2000);

    }

    @Test(priority = 1)
    public void clickLogin(){
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[3]/button/span[1]")).click();



    }

    @Test(priority = 2)
    public void enterEmail() throws InterruptedException {
        Thread.sleep(4000);
         driver.findElement(By.id("login-email")).sendKeys("merry1234@gmail.com");
    }

    @Test(priority = 3)
    public void enterPassword() throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(By.id("login-password")).sendKeys("junmafu@123");
    }

    @Test(priority = 4)
    public void clickLoginButton() throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(By.id("login-submit")).click();

    }

    @Test(priority = 5)
    public void verifyLogin() throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[3]/div/button/span[1]")).isDisplayed();
    }

    @Test(priority = 6)
    public void selectLearnDropdown() throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/button/span[2]")).click();

    }

    @Test(priority = 7)
    public void selectLearningMaterials() throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/div/button[2]/span[2]")).click();

    }

    @Test(priority = 8)
    public void validateLearningMaterialsPage() throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"practice-section\"]/p")).isDisplayed();

    }
    @Test(priority = 9)
    public void selectWebAutomationBasicForm() throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"tab-btn-password\"]/span[2]")).click();
    }

    @Test(priority = 10)
    public void validateBasicPracticeFrom() throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(By.id("page-title")).isDisplayed();

    }

    @Test(priority = 11)
    public void fillInFullName() throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(By.id("name")).sendKeys("merry mashila");

    }

    @Test(priority = 12)
    public void fillInEmailAddress() throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(By.id("email")).sendKeys("merry1234@gmail.com");
    }

    @Test(priority = 13)
    public void fillInAge() throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(By.id("age")).sendKeys("25");
    }

    @Test(priority = 14)
    public void selectGenderButton() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id("gender")).click();
        driver.findElement(By.id("gender")).sendKeys("male");
    }

    @Test(priority = 15)
    public void selectCountry() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id("country")).click();
        driver.findElement(By.id("country")).sendKeys("south africa");
    }

    @Test(priority = 16)
    public void selectExperience() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id("experience")).click();
        driver.findElement(By.id("experience")).sendKeys("Intermediate (2-5 years");
    }

    @Test(priority = 17)
    public void selectJavaScript() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id("skill-javascript")).click();
    }

    @Test(priority = 18)
    public void selectSelenium() throws InterruptedException {
    Thread.sleep(3000);
    driver.findElement(By.id("skill-selenium")).click();

    }

    @Test(priority = 19)
    public void addAdditionalComment() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id("comments")).sendKeys("This is my web basic automation form");

    }
    @Test(priority = 20)
    public void clickSubscribeToNewsLetter() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id("newsletter")).click();

    }

    @Test(priority = 21)
    public void clickTermsAndConditions() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id("terms")).click();

    }

    @Test(priority = 22)
    public void clickValidate() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id("validate-btn")).click();
    }

    @Test( priority = 23)
    public void confirmValidationPopUp() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"practice-section\"]/div[3]/div[1]")).isDisplayed();
    }

    @Test(priority= 24 )
    public void selectSubmitForm() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id("submit-btn")).click();
    }

    @Test( priority = 25)
    public void confirmSubmitFormPopUp() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"practice-section\"]/div[3]/div[1]")).isDisplayed();
    }

    @Test(priority = 26)
    public void viewSubmissions() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id("submissions-toggle-btn")).click();
    }

    @Test (priority = 27)
    public void viewFormData() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"practice-form\"]/details/summary")).click();
    }

    @Test (priority = 28)
    public void viewFormDataInfo() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id("form-data")).isDisplayed();
    }

    @AfterTest
    public void quitBrowser(){
            driver.quit();

    }
}

