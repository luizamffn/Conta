package testa;

import modelo.Conta;
import modelo.ContaPoupanca;
import modelo.ValorInvalidoException;

public class TestaDeposita {

	public static void main(String[] args){
		Conta cp = new ContaPoupanca();
		
		try {
		    cp.deposita(-100);
		  } catch (ValorInvalidoException e) {
		    System.out.println("Você tentou depositar um valor inválido");
		}

	}

}
