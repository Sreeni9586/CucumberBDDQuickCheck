package base;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseClass {

    public WebDriver driver;
    //Test Comments for testing Jenkins Build Trigger
    public WebDriver initializeDriver(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return driver;
    }
    public void tearDown(){
        if(driver!=null){
            driver.quit();
            driver = null;
        }
    }
}
