package Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class calculadoraTest {

	@DisplayName("Calculamos la multiplicacion de 80 * 3")
	@Test
	void test() {
		
		Assertions.assertEquals(calculadora.multiplicar(80, 3), 240);
		Assertions.assertTrue(calculadora.dividir(calculadora.sumar(150, 180), 3)==110);
		Assertions.assertNotEquals(calculadora.multiplicar(calculadora.restar(90, 50), 15),605);
		Assertions.assertNotEquals(calculadora.multiplicar(calculadora.sumar(70,40), 25),2700);
	}

}
