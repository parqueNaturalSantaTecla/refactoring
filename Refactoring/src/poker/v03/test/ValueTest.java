package poker.v03.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import poker.v03.Value;

class ValueTest {

	@Test
	void greaterTest() {
		for (int i = 0; i < Value.values().length; i++) {
			for (int j = 0; j < Value.values().length; j++) {
				if (j < i) {
					assertTrue(Value.values()[i].greater(Value.values()[j]));
				} else {
					assertFalse(Value.values()[i].greater(Value.values()[j]));
				}
			}
		}
	}
	
	@Test
	void nextTest() {
		assertEquals(Value.TRES.next(6), Value.NUEVE);
		assertEquals(Value.INFANTE.next(4), Value.DOS);
	}

}
