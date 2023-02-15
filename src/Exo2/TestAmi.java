package Exo2;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class TestAmi {

    @Test
    public void testAmi0(){
        assertEquals("Bonjour, Arthur.", Ami.bonjour("Arthur"));
    }

    @Test
    public void testAmi1(){
        assertEquals("Bonjour, Nicolas.", Ami.bonjour("Nicolas"));
    }

    @Test
    public void testAmi2(){
        assertEquals("Bonjour, Ami.", Ami.bonjour(null));
    }

    @Test
    public void testAmi3(){
        assertEquals("BONJOUR, ARTHUR.", Ami.bonjour("ARTHUR"));
    }

}
