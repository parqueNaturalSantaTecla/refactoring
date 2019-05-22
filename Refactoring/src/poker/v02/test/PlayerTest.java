package poker.v02.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import poker.v02.Player;
import poker.v02.Value;
import poker.v02.builders.CartaAltaBuilder;
import poker.v02.builders.DobleParejaBuilder;
import poker.v02.builders.ParejaBuilder;

class PlayerTest {

	@Test
	void whoIsWinnerCartaAltaTest() {
		Player first = new CartaAltaBuilder().setMinValue(Value.INFANTE).build();
		Player second = new CartaAltaBuilder().setMinValue(Value.DOS).build();
		assertEquals(first.whoIsWinner(second), first);
		first = new CartaAltaBuilder().setMinValue(Value.DOS).build();
		second = new CartaAltaBuilder().setMinValue(Value.INFANTE).build();
		assertEquals(first.whoIsWinner(second), second);
		first = new CartaAltaBuilder().setMinValue(Value.CINCO).build();
		second = new CartaAltaBuilder().setMinValue(Value.CINCO).build();
		assertEquals(first.whoIsWinner(second), null);
	}

	@Test
	void whoIsWinnerParejaTest() {
		Player first = new ParejaBuilder().setValuePareja(Value.INFANTE).setMinValue(Value.CUATRO).build();
		Player second = new ParejaBuilder().setValuePareja(Value.INFANTE).setMinValue(Value.TRES).build();
		assertEquals(first.whoIsWinner(second), first);
		first = new ParejaBuilder().setValuePareja(Value.DOS).setMinValue(Value.SIETE).build();
		second = new ParejaBuilder().setValuePareja(Value.DOS).setMinValue(Value.REINA).build();
		assertEquals(first.whoIsWinner(second), second);
		first = new ParejaBuilder().setValuePareja(Value.INFANTE).setMinValue(Value.REINA).build();
		second = new ParejaBuilder().setValuePareja(Value.INFANTE).setMinValue(Value.REINA).build();
		assertEquals(first.whoIsWinner(second), null); 
		first = new ParejaBuilder().setValuePareja(Value.REINA).setMinValue(Value.DOS).build();
		second = new ParejaBuilder().setValuePareja(Value.AS).setMinValue(Value.SIETE).build();
		assertEquals(first.whoIsWinner(second), second); 
		first = new ParejaBuilder().setValuePareja(Value.AS).setMinValue(Value.SIETE).build();
		second = new ParejaBuilder().setValuePareja(Value.REINA).setMinValue(Value.DOS).build();
		assertEquals(first.whoIsWinner(second), first); 
	}
	
	@Test
	void whoIsWinnerDobleParejaTest() {
		Player first = new DobleParejaBuilder().setValueFirstPareja(Value.DOS).setValueSecondPareja(Value.INFANTE).setMinValue(Value.SIETE).build();
		Player second = new DobleParejaBuilder().setValueFirstPareja(Value.TRES).setValueSecondPareja(Value.DIEZ).setMinValue(Value.CUATRO).build();
		assertEquals(first.whoIsWinner(second), first);
		first = new DobleParejaBuilder().setValueFirstPareja(Value.TRES).setValueSecondPareja(Value.DIEZ).setMinValue(Value.CUATRO).build();
		second = new DobleParejaBuilder().setValueFirstPareja(Value.DOS).setValueSecondPareja(Value.INFANTE).setMinValue(Value.SIETE).build();
		assertEquals(first.whoIsWinner(second), second);
		first = new DobleParejaBuilder().setValueFirstPareja(Value.CUATRO).setValueSecondPareja(Value.INFANTE).setMinValue(Value.REINA).build();
		second = new DobleParejaBuilder().setValueFirstPareja(Value.INFANTE).setValueSecondPareja(Value.CUATRO).setMinValue(Value.OCHO).build();
		assertEquals(first.whoIsWinner(second), first); 
		first = new DobleParejaBuilder().setValueFirstPareja(Value.CUATRO).setValueSecondPareja(Value.INFANTE).setMinValue(Value.DIEZ).build();
		second = new DobleParejaBuilder().setValueFirstPareja(Value.INFANTE).setValueSecondPareja(Value.CUATRO).setMinValue(Value.REY).build();
		assertEquals(first.whoIsWinner(second), second); 
		first = new DobleParejaBuilder().setValueFirstPareja(Value.CUATRO).setValueSecondPareja(Value.INFANTE).setMinValue(Value.AS).build();
		second = new DobleParejaBuilder().setValueFirstPareja(Value.INFANTE).setValueSecondPareja(Value.CUATRO).setMinValue(Value.AS).build();
		assertEquals(first.whoIsWinner(second), null); 
		
	}
	
	@Test
	public void mixWhoIsWinnerTest() {
		Player first = new CartaAltaBuilder().setMinValue(Value.INFANTE).build();
		Player second = new ParejaBuilder().setValuePareja(Value.INFANTE).setMinValue(Value.TRES).build();
		assertEquals(first.whoIsWinner(second), second);
		first = new CartaAltaBuilder().setMinValue(Value.AS).build();
		second = new DobleParejaBuilder().setValueFirstPareja(Value.DOS).setValueSecondPareja(Value.INFANTE).setMinValue(Value.SIETE).build();
		assertEquals(first.whoIsWinner(second), second);
		first = new ParejaBuilder().setValuePareja(Value.INFANTE).setMinValue(Value.REINA).build();
		second = new DobleParejaBuilder().setValueFirstPareja(Value.INFANTE).setValueSecondPareja(Value.CUATRO).setMinValue(Value.REY).build();
		assertEquals(first.whoIsWinner(second), second);
	}
}
