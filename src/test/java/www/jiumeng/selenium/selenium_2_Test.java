package www.jiumeng.selenium;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

import lombok.Data;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import www.jiumeng.entry.CaseResult;
import www.jiumeng.entry.ResultList;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author jiumeng
 * @create 2021-10-24 9:37
 */

public class selenium_2_Test {
    //创建webdriver对象
    WebDriver driver;

    @BeforeEach
    public void initData(){
        driver = new ChromeDriver();
        //隐式等待
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
//    @Test
//    @DisplayName("login")
//    @Story("正确登录")
//    public void login(){
//        //访问网址
//        driver.get("https://ceshiren.com/");
//        //点击登录按钮
//        driver.findElement(By.xpath("//span[contains(text(),'登录')]")).click();
//        //输入用户名密码
//        driver.findElement(By.id("login-account-name")).sendKeys("380376212@qq.com");
//        driver.findElement(By.id("login-account-password")).sendKeys("hogwarts");
//        //点击登录
//        driver.findElement(By.id("login-button")).click();
//
//        //关闭浏览器
////        driver.quit();
//
//    }
//
    @Test
    @DisplayName("login")
    @Story("错误登录")
    @Severity(SeverityLevel.BLOCKER)
    @Link(name="selenium Documentation",url = "https://www.selenium" +
            ".dev/documentation/getting_started" +
            "/installing_selenium_libraries/")
    public void login1() throws IOException {
        //访问网址
        driver.get("https://ceshiren.com/");
        //点击登录按钮
        driver.findElement(By.xpath("//span[contains(text(),'登录')]")).click();
        //输入用户名密码
        ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
        ResultList resultList = objectMapper.readValue(new File("src\\main\\resources\\user.yml"),ResultList.class);
//        System.out.println("done");
        for(CaseResult caseResult: resultList.getResultList()){
            driver.findElement(By.id("login-account-name")).sendKeys(caseResult.getUsername());
            driver.findElement(By.id("login-account-password")).sendKeys(caseResult.getPwd());
            //点击登录
            driver.findElement(By.id("login-button")).click();

        }



    }
//    @Test
//    public void entityTest() throws IOException {
//        ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
//        ResultList resultList = objectMapper.readValue(new File("src\\main\\resources\\user.yml"),ResultList.class);
//        System.out.println("done");
//
//    }

//    @TestFactory
//    Collection<DynamicTest> dyTestDemo(){
//
//    }

    @AfterEach
    public void tearDown(){
        //关闭浏览器
        driver.quit();
    }


}
