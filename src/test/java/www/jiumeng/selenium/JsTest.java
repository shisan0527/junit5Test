package www.jiumeng.selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;

/**
 *
 * @author GaoYue
 * @create 2021-10-27 20:25
 */
public class JsTest extends  StepTest{
    @Test
    public void jsTest() throws InterruptedException {
        driver.get("https://www.12306.cn/index");
//        Thread.sleep(4000);
        JavascriptExecutor jsDriver = (JavascriptExecutor) driver;
        Thread.sleep(4000);
        jsDriver.executeScript("document.getElementById(\"train_date\").value='2021-10-30'");
        Thread.sleep(4000);
        System.out.println(jsDriver.executeScript("return document.getElementById(\"train_date\")" +
                ".value"));

    }
}
