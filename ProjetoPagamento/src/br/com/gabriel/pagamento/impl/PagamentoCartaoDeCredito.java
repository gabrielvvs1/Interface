package br.com.gabriel.pagamento.impl;

import br.com.gabriel.pagamento.Pagamento;

public class PagamentoCartaoDeCredito implements Pagamento {// classe concreta, pode colocar a implementaçao dentro dela

	
	private int numeroCartao;
	private String titular;
	
	public PagamentoCartaoDeCredito(int numeroCartao, String titular) {
		super();
		this.numeroCartao = numeroCartao;
		this.titular = titular;
	}

	public void exibirInforCartao() {
		System.out.println("Numero: "+ numeroCartao);
		System.out.println("Titular: "+ numeroCartao);
		
	}


	@Override
	public void pagar(double valor) {
		// TODO Auto-generated method stub
		System.out.println("Pagamento com cartão no valor:" + valor);
		
	}

}
