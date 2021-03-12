package Exe1Fullstack;

public class Conta {
	private Pessoa cliente;
	private int nrConta;
	private double saldo;
	
	public Pessoa getCliente(){
		return cliente;
	}
	public void setCliente(Pessoa newcliente) {
		this.cliente=newcliente;
	}
	
	public int getNrConta() {
		return nrConta;
	}
	public void setNrConta(int newnrConta) {
		this.nrConta=newnrConta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double newsaldo) {
		this.saldo=newsaldo;
	}
	
	public void sacar(double valor) {
		if (temSaldo(valor)) this.debitar(valor);
		else System.out.println("--------------SEM SALDO!-------------");
	}
	
	private void debitar(double valor) {
		this.saldo-=valor;
	}
	
	protected Boolean temSaldo(double valor) {
		if(valor > saldo) return false; 
		
		return true;
	}
	
	public void depositar(double valor) {
		this.saldo+=valor;
	}
	
	public void transferir(double valor, Conta c) {
		if(temSaldo(valor)==true) {
			this.debitar(valor);
			c.setSaldo(c.getSaldo()+valor);
		}
		else System.out.println("--------------SEM SALDO!-------------");
	}
	
	public Conta(Pessoa cliente, int nrConta, double saldo) {
		super();
		this.cliente = cliente;
		this.nrConta = nrConta;
		this.saldo = saldo;
	}
}
