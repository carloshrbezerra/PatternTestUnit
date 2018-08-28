import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RetanguloTest2 {
	
	Retangulo retangulo;
	
	@Test(timeout = 200)
	public void testCalcularArea() {
		retangulo = new Retangulo(10,2);
		int resultadoEsperado = 20;
		int resultado = retangulo.calcularArea();
		
		assertTrue(resultado == resultadoEsperado);
	}

	@Test
	public void testCalcularPerimetro() {
		retangulo = new Retangulo(10,2);
		int resultadoEsperado = 24;
		int resultado = retangulo.calcularPerimetro();
		
		assertEquals(resultado,resultadoEsperado);
	}
	
	@Test
	public void testWithException(){
		retangulo = new Retangulo(0,2);
		try{
			retangulo.calcularArea();
			fail();
		}catch(Exception e){
			assertTrue(true);
		}
		
	}
	
	@Test(expected = NumberFormatException.class)
	public void testWithExceptionExpected(){
		retangulo = new Retangulo(0,2);
		retangulo.calcularArea();
	}

}
