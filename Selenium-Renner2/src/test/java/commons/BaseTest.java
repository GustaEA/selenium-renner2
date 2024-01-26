package commons;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Elements;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    public static WebDriver driver;
    public static WebDriverWait wait;
    @Before
    public void abrirNavegador(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions opt = new ChromeOptions();
        opt.addExtensions(new File("Extensions/adblock.crx"));
        driver = new ChromeDriver(opt);
        wait = new WebDriverWait(driver, 6);
        Elements.driver = driver;
        Elements.wait = wait;
        driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(600, TimeUnit.MILLISECONDS);
    }


    @After
    public void fecharNavegador(){
        driver.quit();
    }
}