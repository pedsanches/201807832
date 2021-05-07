package Exe1Fullstack;

public class Pessoa {
	private int id;
	private String nome;
	private String  endereco;
	
	
	public int getId(){
		return id;
	}
	public void setId(int newid){
		this.id = newid;
	}
	
	public String getNome(){
		return nome;
	}
	public void setNome(String newNome){
		this.nome = newNome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String newEndereco){
		this.endereco = newEndereco;
	}
	
	public Pessoa(int id, String nome, String endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
	}
	
}
