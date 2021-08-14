package entidades;

public class FormCadastro {
	private int id;
	private String convenio;
	private String nome;
	private int idade;
	private String tratamento;
	private String endereco;
	private String bairro;
	private String telefone;
	private String email;
	private String obs;
	
	public FormCadastro(int id, String convenio, String nome, int idade,
			String tratamento, String endereco, String bairro, String telefone,
			String email, String obs) {
		
		this.id = id;
		this.convenio = convenio;
		this.nome = nome;
		this.idade = idade;
		this.tratamento = tratamento;
		this.endereco = endereco;
		this.bairro = bairro;
		this.telefone = telefone;
		this.email = email;
		this.obs = obs;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getConvenio() {
		return convenio;
	}
	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getTratamento() {
		return tratamento;
	}
	public void setTratamento(String tratamento) {
		this.tratamento = tratamento;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getObs() {
		return obs;
	}
	public void setObs(String obs) {
		this.obs = obs;
	}
	
	
	
	
	
}
