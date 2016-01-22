package testa;

import interfaces.Tributavel;
import modelo.ContaCorrente;

public class TestaTributavel {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
	    cc.deposita(100);
	    System.out.println(cc.calcularTributos());

	    // testando polimorfismo:
	    Tributavel t = cc;
	    System.out.println(t.calcularTributos());
	    
	}

}
