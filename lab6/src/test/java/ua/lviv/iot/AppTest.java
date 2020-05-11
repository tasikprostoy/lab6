package ua.lviv.iot;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	@Test
	public void testReplace() {
		String test1 = "xotlin number is 0 800 300 541";
		assertEquals("xotlin number is HOT_LINE", App.replace(test1));
		
		String test2 = "xotlin number is 0800300 541";
		assertEquals("xotlin number is HOT_LINE", App.replace(test2));
		
		String test3 = "xotlin number is 0 (800) 300 541";
		assertEquals("xotlin number is HOT_LINE", App.replace(test3));
		
		String test4 = "xotlin number is 0 800 30 541";
		assertEquals("xotlin number is 0 800 30 541", App.replace(test4));
	}
}
