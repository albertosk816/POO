package practicaJUnit;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class menormayor_primoTest {

	@Test
	void testDevuelveMenorMayor() {

		menormayor_primo a = new menormayor_primo();

		
		int[] prueba = a.devuelveMenorMayor(new int[] {123, 243, 37});
		int[] esperado= { 37,123, 243};
		assertArrayEquals(prueba, esperado);
	}

}
