import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class RetanguloTestParameters {
	
	Retangulo retangulo;
	private int base;
	private int altura;
	private int area;
	
	
	@Parameters
	public static Collection<Object[]> parametros(){
		return Arrays.asList(new Object[][]{
			{10,20,200},
			{10,30,300}
		});
	}
	
	public RetanguloTestParameters(int base, int altura, int area){
		this.base = base;
		this.altura = altura;
		this.area = area;
	}
	
	@Test()
	public void testCalcularArea() {
		retangulo = new Retangulo(base,altura);
		int resultado = retangulo.calcularArea();
		assertEquals(area, resultado);
	}

	@Test
	public void testCalcularPerimetro() {
		retangulo = new Retangulo(base,altura);
		int resultado = retangulo.calcularPerimetro();
		assertEquals(area,resultado);
	}
}
