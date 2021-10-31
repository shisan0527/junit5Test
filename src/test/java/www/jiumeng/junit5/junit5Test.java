package www.jiumeng.junit5;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.SwingUtilities;

/**
 *
 * @author GaoYue
 * @create 2021-10-23 11:56
 */
public class junit5Test {
    @BeforeAll
    public static void ball(){
        System.out.println("beforeAll");
    }
    @BeforeEach
    public void be(){
        System.out.println("beforeeach");
    }

    @Test
    public void fun1(){
        System.out.println("fun1");
    }
    @Test
    public void fun2(){
        System.out.println("fun2");
    }
}
