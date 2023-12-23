


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.function.Consumer;

import org.junit.jupiter.api.Test;

import com.example.Task2.Group;
import com.example.Task2.Signature;

public class TestTask2 {
    static int test = 5; 
    public static int inc(int number){
        return test += 1;
    }
    @Test
    public void testNoReturn() {

        Consumer<Integer> lambdaExpression = (param) -> inc(param);
        Signature s = new Signature<>(lambdaExpression);       
        s.apply(test);
        assertEquals(test, 6);


                
        Group<Integer> group = new Group<>();
        group.addTask(s).addTask(s);
        group.apply(123);
        assertEquals(test, 8);


        
        Group<Integer> group_general = new Group<>();
        group_general.addTask(group).addTask(group);
        group_general.apply(123);
        assertEquals(test, 12);


        
    }

}
