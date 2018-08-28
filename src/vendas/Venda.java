package vendas;

public class Venda {
	private double valor;
	private Cliente cliente;
	private ICredito credioService;
	
	
	public Venda(double valor, Cliente cliente, ICredito credioService) {
		super();
		this.valor = valor;
		this.cliente = cliente;
		this.credioService = credioService;
	}
	
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public boolean checkout(){
		double limite;
		limite = credioService.getLimite(cliente.getCpf());
		if(valor > limite){
			return false;
		}
		return true;
	}
	
}
