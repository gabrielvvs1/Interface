package br.com.gabriel.main;

import br.com.gabriel.pagamento.Pagamento;
import br.com.gabriel.pagamento.impl.PagamentoCartaoDeCredito;

public class Main {

	public static void main(String[] args) {
		Pagamento objPagCartao = new PagamentoCartaoDeCredito(004,"Gabriel");
		objPagCartao.pagar(300);
		
	}

}
