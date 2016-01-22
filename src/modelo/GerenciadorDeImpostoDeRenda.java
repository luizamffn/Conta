package modelo;

import interfaces.Tributavel;

public class GerenciadorDeImpostoDeRenda {
	private double total;

	public void adiciona(Tributavel t) { // para saber se a classe possui a interface do tipo tributavel
		System.out.println("Adicionando tributavel: " + t.toString());

	    this.total +=  t.calcularTributos();
	}

	public double getTotal() {
		return this.total;
	}
}
