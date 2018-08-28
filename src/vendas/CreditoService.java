package vendas;

public class CreditoService implements ICredito{

	@Override
	public double getLimite(String cpf) {
		System.out.println("Consultando administradora de cartões");
		return 1500;
	}
	
}
