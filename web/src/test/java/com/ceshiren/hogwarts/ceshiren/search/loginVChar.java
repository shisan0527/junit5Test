package com.ceshiren.hogwarts.ceshiren.search;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 *
 * @author GaoYue
 * @create 2021-10-30 14:19
 */
public class loginVChar {
    private ChromeDriver driver;



    @Test
    void getCookie() throws InterruptedException, IOException {
        driver = new ChromeDriver();
        driver.get("https://work.weixin.qq.com/wework_admin/loginpage_wx");
        Thread.sleep(15000);
        final Set<Cookie> cookies = driver.manage().getCookies();
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        mapper.writeValue(new File("cookies.yaml"),cookies);
    }
    @Test
    void login() throws InterruptedException, IOException {
        driver = new ChromeDriver();
        driver.get("https://work.weixin.qq.com/wework_admin/loginpage_wx");
        final ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        TypeReference typeReference = new TypeReference<List<HashMap<String,Object>>>(){};
        List<HashMap<String,Object>> cookies = (List<HashMap<String, Object>>) mapper.readValue(new File("cookies.yaml"), typeReference);
        System.out.println(cookies);
        cookies.forEach(cookieMap ->{
            driver.manage().addCookie(new Cookie(cookieMap.get("name").toString(),cookieMap.get(
                    "value").toString()));
        });
//        driver.get("https://work.weixin.qq.com/wework_admin/loginpage_wx");
        driver.navigate().refresh();
    }
}
