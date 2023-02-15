package Exo2;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestAmi {

    @Test
    public void testAmi(){
        assertEquals("Bonjour, Arthur.", Ami.bonjour("Arthur"));
    }
}
