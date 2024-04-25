package jUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FirstCase {

	@Test
	void test() {
		assertTrue(true);
	}
	@Test
	void test2() {
		assertFalse(true);
	}

}
