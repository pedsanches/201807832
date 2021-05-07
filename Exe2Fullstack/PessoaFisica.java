package Exe1Fullstack;

import java.util.Calendar;

public class PessoaFisica extends Pessoa {
	private int cpf;
	private Calendar datanasc;
	private String genero;
	
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int newcpf) {
		this.cpf=newcpf;
	}
	
	public Calendar getDtNascimento() {
		return datanasc;
	}
	public void setDtNascimento(Calendar newdatanasc) {
		this.datanasc=newdatanasc;
	}
	
	public String getGenero() {
		return genero;
	}
	public void setGenero(String newgenero) {
		this.genero=newgenero;
	}
	
	public int getIdade() {
        Calendar calendarioHoje = Calendar.getInstance();

        int DiaHoje = calendarioHoje.get(Calendar.DAY_OF_MONTH);
        int MesHoje = calendarioHoje.get(Calendar.MONTH);
        int AnoHoje = calendarioHoje.get(Calendar.YEAR);

        int DiaPessoa = this.datanasc.get(Calendar.DAY_OF_MONTH);
        int MesPessoa = this.datanasc.get(Calendar.MONTH);
        int AnoPessoa = this.datanasc.get(Calendar.YEAR);

        int idade = AnoHoje - AnoPessoa;
        if(MesHoje < MesPessoa) {
            idade -= 1;
        } else if(MesHoje == MesPessoa) {
            if(DiaHoje < DiaPessoa) {
                idade -= 1;
            }
        }

        return idade;
    }
	
	public PessoaFisica(int id, String nome, String endereco, int cpf, Calendar datanasc, String genero) {
		super(id, nome, endereco);
		this.cpf = cpf;
		this.datanasc = datanasc;
		this.genero = genero;
	}
	
	
	
}
