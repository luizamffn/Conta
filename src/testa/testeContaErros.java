package testa;

import modelo.Cliente;
import modelo.Conta;
import modelo.ContaCorrente;

public class testeContaErros {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("luiza");
		Conta c = new ContaCorrente(cliente);
		
		c.deposita(100);
		
		if (!c.saca(150)) {
			System.out.println("Saldo insulficiente, voce possui " + c.getSaldo());
		}else{
			System.out.println("Saque efetuado com sucesso!");
		}

	}

}
