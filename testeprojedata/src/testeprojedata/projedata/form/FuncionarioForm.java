package testeprojedata.projedata.form;

import java.math.BigDecimal;
import java.time.LocalDate;

public class FuncionarioForm extends PessoaForm{
	
	private BigDecimal salario;
	
	private String funcao;
	
	private PessoaForm pessoa;

	public FuncionarioForm(BigDecimal salario, String funcao, PessoaForm pessoa) {
		super();
		this.salario = salario;
		this.funcao = funcao;
		this.pessoa = pessoa;
	}

//	public FuncionarioForm() {
//		// TODO Auto-generated constructor stub
//	}
	
	

	public BigDecimal getSalario() {
		return salario;
	}


	public FuncionarioForm() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getFuncao() {
		return funcao;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public PessoaForm getPessoa() {
		return pessoa;
	}

	public void setPessoa(PessoaForm pessoa) {
		this.pessoa = pessoa;
	}

	@Override
	public String toString() {
		return "FuncionarioForm [salario=" + salario + ", funcao=" + funcao + ", pessoa=" + pessoa + "]";
	}
	

}
