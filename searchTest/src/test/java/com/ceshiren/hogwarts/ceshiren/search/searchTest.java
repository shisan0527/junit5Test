package com.ceshiren.hogwarts.ceshiren.search;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


/**
 *
 * @author GaoYue
 * @create 2021-10-31 11:44
 */

public class searchTest {
    private ChromeDriver driver;

    @Test
    public void search(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://ceshiren.com/");
        driver.findElement(By.id("search-button")).click();
        driver.findElement(By.id("search-term")).sendKeys("selenium" + Keys.ENTER);
        final String real = driver.findElement(By.cssSelector(".topic-title")).getText();
        assertThat(real,containsString("selenium"));
    }

}
