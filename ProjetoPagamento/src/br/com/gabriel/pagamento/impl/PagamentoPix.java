package br.com.gabriel.pagamento.impl;

import br.com.gabriel.pagamento.Pagamento;

public class PagamentoPix implements Pagamento{

	@Override
	public void pagar(double valor) {
		// TODO Auto-generated method stub
		System.out.println("Pagamento com Pixo no valor:" +valor);
		
	}

}
