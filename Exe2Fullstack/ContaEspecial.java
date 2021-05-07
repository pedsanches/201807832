package Exe1Fullstack;

public class ContaEspecial extends Conta{
	private double limite;

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	protected Boolean temSaldo(double valor) {
		if(valor > this.getSaldo() +limite) return false; 
		
		return true;
	}

	public ContaEspecial(Pessoa cliente, int nrConta, double saldo, double limite) {
		super(cliente, nrConta, saldo);
		this.limite = limite;
	}
	
}
