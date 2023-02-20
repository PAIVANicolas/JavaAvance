package Programmation_defensive.Exo2;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class TestAmi {

    @Test
    public void testAmiArthur(){
        assertEquals("Bonjour, Arthur.", Ami.bonjour("Arthur"));
    }

    @Test
    public void testAmiNicolas(){
        assertEquals("Bonjour, Nicolas.", Ami.bonjour("Nicolas"));
    }

    @Test
    public void testAmiNull(){
        assertEquals("Bonjour, Ami.", Ami.bonjour(null));
    }

    @Test
    public void testAmiARTHUR(){
        assertEquals("BONJOUR, ARTHUR.", Ami.bonjour("ARTHUR"));
    }

    @Test
    public void testAmiArThur(){
        assertEquals("Bonjour, ArThur.", Ami.bonjour("ArThur"));
    }

}
