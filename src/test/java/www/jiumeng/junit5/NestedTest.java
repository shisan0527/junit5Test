package www.jiumeng.junit5;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

/**
 *
 * @author GaoYue
 * @create 2021-10-27 22:49
 */
public class NestedTest {
    private static HashMap<String,String> dataMap = new HashMap<>();
    @Test
    void login(){
        dataMap.put("login","登录成功");
    }

    @Nested
    class PayTest{
        @Test
        void payTest(){
            if(null != dataMap.get("pay")){
                System.out.println("支付成功");
            }
        }
    }


    @Nested
    class BuyTest{
        @Test
        void buyTest(){
            if(dataMap.get("login").equals("登录成功")){
                System.out.println("登录成功，可以购买了");
                dataMap.put("pay","支付成功了");
            }
        }
    }

}
