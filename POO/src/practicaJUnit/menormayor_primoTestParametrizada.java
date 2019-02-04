package practicaJUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

	@RunWith (Parameterized.class)
public class menormayor_primoTestParametrizada {
		private int numeros[] = new int[3];
		private int numeros2[] = new int[3];
		
		
		public menormayor_primoTestParametrizada(int numeros[]) {
			
			this.numeros = numeros;
			this.numeros2=numeros2;
		}
		


		@Parameters
		public static Collection<Object[]> numeros(){
		return Arrays.asList(new Object[][] {
			

			menormayor_primo a = new menormayor_primo{24 ,15 , 49},
			
			
			menormayor_primo b = new menormayor_primo{46, 21, 78}
			
		});
	}

	@Test
	void testGetTresUltimosPrimos() {
		menormayor_primo a = new menormayor_primo();
		int[] esperado= { 37,123, 243};
		assertArrayEquals(a, esperado);


//		assertArrayEquals(prueba, esperado);
		
	}

	}
