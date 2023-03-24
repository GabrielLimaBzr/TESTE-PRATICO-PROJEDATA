package testeprojedata.projedata.form;

import java.time.LocalDate;

public class PessoaForm {

	private String nome;

	private LocalDate dataNasc;

	public PessoaForm(String nome, LocalDate dataNasc) {
		super();
		this.nome = nome;
		this.dataNasc = dataNasc;
	}
	
	public PessoaForm() {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public LocalDate getDataNasc() {
		return dataNasc;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}

	@Override
	public String toString() {
		return "PessoaForm [nome=" + nome + ", dataNasc=" + dataNasc + "]";
	}

}
