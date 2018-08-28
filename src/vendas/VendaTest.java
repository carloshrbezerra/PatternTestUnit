package vendas;

import org.junit.Test;

public class VendaTest {

	@Test
	public void test() {
		Cliente cliente = new Cliente("carlos bezerra","03880469377");
		Venda venda = new Venda(200,cliente,null);
		
	}

}
