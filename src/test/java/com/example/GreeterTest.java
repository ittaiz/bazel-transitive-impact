package com.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GreeterTest {

	@Test
	public void greetingReturnsHi() {
	    assertEquals("Hi!" , Greeting.sayHi());
    }

}