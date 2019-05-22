package poker.v03.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import poker.v03.Suite;

class SuiteTest {

	@Test
	void nextTest() {
		assertEquals(Suite.DIAMANTES.next(2), Suite.TREBOLES);
		assertEquals(Suite.CORAZONES.next(6), Suite.PICAS);
	}

}
