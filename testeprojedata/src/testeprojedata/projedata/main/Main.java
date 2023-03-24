package testeprojedata.projedata.main;

import testeprojedata.projedata.action.ActionPrincipal;

public class Main {
	
//	1� Classe Pessoa com os atributos: nome (String) e data nascimento (LocalDate).
//
//	2 � Classe Funcion�rio que estenda a classe Pessoa, com os atributos: sal�rio (BigDecimal) e fun��o (String).
//
//	3 � Deve conter uma classe Principal para executar as seguintes a��es:
//	3.1 � Inserir todos os funcion�rios, na mesma ordem e informa��es da tabela acima.
//	3.2 � Remover o funcion�rio �Jo�o� da lista.
//	3.3 � Imprimir todos os funcion�rios com todas suas informa��es, sendo que:
//	    � informa��o de data deve ser exibido no formato dd/mm/aaaa;
//	    � informa��o de valor num�rico deve ser exibida no formatado com separador de milhar como ponto e decimal como v�rgula.
//	3.4 � Os funcion�rios receberam 10% de aumento de sal�rio, atualizar a lista de funcion�rios com novo valor.
//	3.5 � Agrupar os funcion�rios por fun��o em um MAP, sendo a chave a �fun��o� e o valor a �lista de funcion�rios�.
//	3.6 � Imprimir os funcion�rios, agrupados por fun��o.
//	3.8 � Imprimir os funcion�rios que fazem anivers�rio no m�s 10 e 12.
//	3.9 � Imprimir o funcion�rio com a maior idade, exibir os atributos: nome e idade.
//	3.10 � Imprimir a lista de funcion�rios por ordem alfab�tica.
//	3.11 � Imprimir o total dos sal�rios dos funcion�rios.
//	3.12 � Imprimir quantos sal�rios m�nimos ganha cada funcion�rio, considerando que o sal�rio m�nimo � R$1212.00.
	 

	public static void main(String[] args) {
		
		new ActionPrincipal().executa();

	}

}
