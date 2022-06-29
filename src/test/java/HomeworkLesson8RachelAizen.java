import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomeworkLesson8RachelAizen {
    private static WebDriver driver;
    static final String CHROMEDRIVER_PATH = "C:\\Intel\\SELENIUM\\chromedriver.exe";
    //1
    @BeforeClass
    public static void openWallaInGoogle(){
        System.setProperty("webdriver.chrome.driver", HomeworkLesson8RachelAizen.CHROMEDRIVER_PATH);
        driver = new ChromeDriver();
        driver.get("https://www.walla.co.il");}
    //2
    @Test
    public static void openTranslateInGoogle(){
        driver = new ChromeDriver();
        driver.get("https://translate.google.com/");
        System.out.println(driver.findElement(By.className("er8xn")));
        System.out.println(driver.findElement(By.cssSelector("textarea[jsname=BJE2fc]")));}

    //5
    @Test
    public static void openAmazonInGoogle(){
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.findElement(By.id("nav-bb-search")).sendKeys("Leather shoes");}

    //6
    @Test
    public static void openTranslateInGoogleAgain(){
        driver = new ChromeDriver();
        driver.get("https://translate.google.com/");
        driver.findElement(By.className("er8xn")).sendKeys("זה עובד?");}

    //7
    @Test
    public static void openYoutubeInGoogle(){
        driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
        driver.findElement(By.id("search"));
        driver.findElement(By.className("gsfi")).sendKeys("Simple Man Jensen Ackles");
        driver.findElement(By.id("search-icon-legacy")).click();}

    //8
    //I don't have a facebook account...
    @Test
    public static void openFacebookInGoogle(){
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");}

    public static void main(String[] args) {
        System.out.println("I didn't do the Firefox ones because I couldn't find the chrome.");
    }
}
