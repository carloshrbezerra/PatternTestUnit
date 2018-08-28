
public class Pessoa {
	
	private Integer codigo;
	private String nome;
	private PessoaDAO pessoaDAO;
	
	public Pessoa(PessoaDAO pessoaDAO){
		this.pessoaDAO = pessoaDAO;
	}
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String salvar(){
		return this.pessoaDAO.salvar();
	}
}
