package Exe1Fullstack;

import java.util.ArrayList;
import java.util.List;
import java.util.Calendar;

public class main{
	
	public static void main(String[] args) {
		
		Calendar idades1 = Calendar.getInstance();
		idades1.set(2000,11,29);
		PessoaFisica Pedro = new PessoaFisica(1,"Pedro", "Presidente Venceslau", 1000, idades1, "Masculino");
		
		Calendar idades2 = Calendar.getInstance();
		idades2.set(2000,07,02);
		PessoaFisica Lucas = new PessoaFisica(2, "Lucas", "Goiania", 999, idades2, "Masculino");
	
		System.out.println("Pedro: "+Pedro.getIdade());
		System.out.println("Lucas: "+Lucas.getIdade());
		
		PessoaJuridica Mercado = new PessoaJuridica(3, "Ulian", "SantoAnastacio", 001, "Vendas");
		PessoaJuridica Padaria = new PessoaJuridica(4, "Pãozão", "Presidente Venceslau", 003, "Vendas");
		
		ContaEspecial PedroE = new ContaEspecial(Pedro, 1, 1000.0, 500.0);
		ContaPoupanca LucasP = new ContaPoupanca(Lucas, 2, 500.0, 0.02);
		ContaEspecial MercadoE = new ContaEspecial(Mercado, 3,  100000.0, 10000.0);
		ContaPoupanca PadariaP = new ContaPoupanca(Padaria, 4, 1500.0, 0.03);
	
		System.out.println("------------------------------------");
		System.out.println(PedroE.getSaldo());
		PedroE.sacar(100.0);
		System.out.println("------------------------------------");
		System.out.println(PedroE.getSaldo());
		LucasP.depositar(200.0);
		System.out.println("------------------------------------");
		System.out.println(LucasP.getSaldo());
		
		System.out.println("------------------------------------");
		System.out.println(MercadoE.getSaldo());
		MercadoE.transferir(1000.0, LucasP);
		System.out.println("------------------------------------");
		System.out.println("Mercado:  "+MercadoE.getSaldo());
		System.out.println("Lucas:	"+LucasP.getSaldo());
		
		List<Conta> listConta= new ArrayList<Conta>();
		listConta.add(PedroE);
		listConta.add(LucasP);
		listConta.add(MercadoE);
		listConta.add(PadariaP);
		
		Double total=0.0;
		for (Conta c: listConta) {
			System.out.println("Nome: "+c.getCliente().getNome()+ ", saldo: R$ "+c.getSaldo());
			total += c.getSaldo();
		}
		
		System.out.println("------------------------------------");
		System.out.println("Total: R$ "+total);
	} 

}
