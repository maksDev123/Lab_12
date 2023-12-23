


import org.junit.jupiter.api.Test;

import com.example.Task1.ATM;
import com.example.Task1.Track1;
import com.example.Task1.Tracker10;
import com.example.Task1.Tracker100;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestTask1 {

    @Test
    public void testNoReturn() {
        ATM atm = new ATM();
        assertTrue(atm instanceof ATM);

        Tracker100 tack100= new Tracker100();
        assertTrue(tack100 instanceof Tracker100);
        
        Tracker10 tack10= new Tracker10();
        assertTrue(tack10 instanceof Tracker10);

        
        Track1 tack1= new Track1();
        assertTrue(tack1 instanceof Track1);

    }

}
