import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class PessoaTest {
	
	PessoaDAO pessoaDAO = mock(PessoaDAO.class);
	
	@Test
	public void salvandoUmaPessoa(){
		Pessoa pessoa = new Pessoa(this.pessoaDAO);
		String resultado = pessoa.salvar();
		String esperado = "salvar";
		assertEquals(resultado, esperado);
	}
}
