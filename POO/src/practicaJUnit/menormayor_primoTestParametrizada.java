package practicaJUnit;

import static org.junit.Assert.assertArrayEquals;


import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

	@RunWith (Parameterized.class)
public class menormayor_primoTestParametrizada {
		private int[] numeros;
		private int[] resultado;


		public menormayor_primoTestParametrizada( int numeros[], int resultado[]) {
			
			this.numeros=numeros;
			this.resultado=resultado;

		}

		@Parameters
		public static Collection<Object[]> numeros(){
		return Arrays.asList(new Object[][] {
			{new int[] {43, 15, 49},new int[] {15, 43 , 49}
			},
			{
				new int[] {43, 15, 49},new int[] {15, 48 , 49}
			}
		});
	}
	

	@Test
	public void testGetTresUltimosPrimos() {

		menormayor_primo c = new menormayor_primo();
		assertArrayEquals(numeros, c.devuelveMenorMayor(resultado));

	}
}
