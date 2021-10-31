package www.jiumeng.junit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
/**
 *
 * @author GaoYue
 * @create 2021-10-27 23:01
 */
public class ParameterizedTest1 {
    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4})
    void test1(int argrment){
        assertTrue(argrment >0 && argrment < 4);
    }
    @ParameterizedTest
    @MethodSource
    void testParamterMethod(String argument){
        assertNotNull(argument);
    }
    static Stream<String> testParamterMethod(){
        return Stream.of("apple","banana",null);
    }
    @Test
    void testType(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
//        JsonObject jsonObject = new JsonObject();
    }

}
