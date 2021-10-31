package www.jiumeng.selenium;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author GaoYue
 * @create 2021-10-24 11:12
 */
public class StepTest {
    //全局变量driver
    public static WebDriver driver;
    @BeforeAll
    public static void initData(){
        //初始化chrome浏览器
        driver = new ChromeDriver();
        //隐式等待
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

//    @Test
//    public void  someTest(){
////        Allure.step("initData",this::initData);
////        Allure.step("openUrl",this::openUrl);
//        Allure.step("login",this::login);
//        Allure.step("logout",this::logout);
////        Allure.step("quit",this::quit);
//    }
//
//   @BeforeEach
//    private void openUrl(){
//        driver.get("https://ceshiren.com/");
//    }
//    @Step("login")
//    private void login(){
//        driver.findElement(By.xpath("//span[contains(text(),'登录')]")).click();
//        driver.findElement(By.id("login-account-name")).sendKeys("380376212@qq.com");
//        driver.findElement(By.id("login-account-password")).sendKeys("hogwarts");
//        driver.findElement(By.id("login-button")).click();
//    }
//    @Step("logout")
//    private void logout(){
//        driver.findElement(By.xpath("//*[@id='current-user']/a/div/img[@class='avatar']")).click();
//        driver.findElement(By.id("profile")).click();
//        driver.findElement(By.xpath("//*[@id='quick-access-profile']/ul/li[6]/button/span" +
//                "[contains(text(),'退出')]")).click();
//    }
    @AfterAll
    private static void quit(){
        driver.quit();
    }


}
