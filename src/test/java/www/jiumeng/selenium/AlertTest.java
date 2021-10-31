package www.jiumeng.selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;


/**
 *
 * @author GaoYue
 * @create 2021-10-27 21:07
 */
public class AlertTest extends  StepTest{
    @Test
    public void alertTest() throws InterruptedException {
        driver.get("https://www.runoob.com/try/try.php?filename=jqueryui-api-droppable");
        driver.switchTo().frame("iframeResult");
        Actions actions = new Actions(driver);
        actions.dragAndDrop(driver.findElement(By.id("draggable")),driver.findElement(By.id(
                "droppable"))).perform();
        Thread.sleep(4000);
        driver.switchTo().alert().accept();
        JavascriptExecutor jsDriver = (JavascriptExecutor)driver;
        jsDriver.executeScript("window.alert(\"test\")");
        Thread.sleep(4000);
        driver.switchTo().alert().accept();

        Thread.sleep(4000);
        driver.switchTo().parentFrame();
        System.out.println(driver.findElement(By.id("submitBTN")).getText());
        driver.quit();


    }
}
