package practicaJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class menormayor_primoTestAll {

	@Test
	void testGetTresUltimosPrimos() {
		
		menormayor_primo p = new menormayor_primo();
		int ultimos[] = p.getTresUltimosPrimos(50);
		
		int[] primosEsperados = {47 , 43 , 41};
	}

	@Test
	void testDevuelveMenorMayor() {
	
		menormayor_primo a = new menormayor_primo();

		
		int[] prueba = a.devuelveMenorMayor(352, 443, 317);
		int[] esperado= { 317, 352 , 443};
		assertArrayEquals(prueba, esperado);
	}

}
