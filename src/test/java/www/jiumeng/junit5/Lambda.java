package www.jiumeng.junit5;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Executable;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author GaoYue
 * @create 2021-10-23 14:52
 */
public class Lambda {
    ArrayList<Executable> arraylist = new ArrayList<>();
    @Test
    public void addTest(){
        for(int i=0;i<10;i++){
            int result = 1+i;
            System.out.println(result);
//            assertAll("hello",()->assertEquals(5,result));
//            int c = i;
//            arraylist.add(()->{assertEquals(5,result);});
        }
    }
}
