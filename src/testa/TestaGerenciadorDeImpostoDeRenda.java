package testa;

import modelo.ContaCorrente;
import modelo.GerenciadorDeImpostoDeRenda;
import modelo.SeguroDeVida;

public class TestaGerenciadorDeImpostoDeRenda {

	public static void main(String[] args) {
		GerenciadorDeImpostoDeRenda gerenciador = 
		          new GerenciadorDeImpostoDeRenda();
		    
		SeguroDeVida sv = new SeguroDeVida();
		gerenciador.adiciona(sv);
		  
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(1000);
		gerenciador.adiciona(cc);
		  
		System.out.println("Total de tributos: " + gerenciador.getTotal());
		cc.saca(gerenciador.getTotal());
		System.out.printf("O saldo é: %.2f", cc.getSaldo());
	}

}
