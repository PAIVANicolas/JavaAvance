package Programmation_defensive.Exo1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestFizzBuzz {
    @Test
    public void testFizzBuzz0(){
        assertEquals("0",FizzBuzz.fizzBuzz(0));
    }
    @Test
    public void testFizzBuzz1(){
        assertEquals("1",FizzBuzz.fizzBuzz(1));
    }

    @Test
    public void testFizzBuzz2(){
        assertEquals("2",FizzBuzz.fizzBuzz(2));
    }

    @Test
    public void testFizzBuzz3(){
        assertEquals("Fizz",FizzBuzz.fizzBuzz(3));
    }
    @Test
    public void testFizzBuzz5(){
        assertEquals("Buzz",FizzBuzz.fizzBuzz(5));
    }
    @Test
    public void testFizzBuzz6(){
        assertEquals("Fizz",FizzBuzz.fizzBuzz(6));
    }
    @Test
    public void testFizzBuzz7(){
        assertEquals("7",FizzBuzz.fizzBuzz(7));
    }

    @Test
    public void testFizzBuzz10(){
        assertEquals("Buzz",FizzBuzz.fizzBuzz(10));
    }
}

