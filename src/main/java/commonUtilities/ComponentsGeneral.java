package commonUtilities;

import base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ComponentsGeneral {
    WebDriver driver;

    public ComponentsGeneral(WebDriver driver) {
        this.driver = driver;
    }
    public void waitForElement(WebElement waitElement, String waitType) throws InterruptedException {

        //Thread.sleep(10000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        switch (waitType.toLowerCase()) {
            case "visible":
                wait.until(ExpectedConditions.visibilityOf(waitElement));
                break;
            case "clickable":
                wait.until(ExpectedConditions.elementToBeClickable(waitElement));
            default:
                if (waitType.toLowerCase().contains("sleep")) {
                    Thread.sleep(2000);
                }
                break;
        }
    }
}
