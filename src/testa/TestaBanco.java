package testa;

import modelo.AtualizadorDeContas;
import modelo.Banco;
import modelo.Conta;
import modelo.ContaCorrente;
import modelo.ContaPoupanca;

public class TestaBanco {
	public static void main(String[] args) {
		Conta cc1 = new ContaCorrente();
		Conta cc2 = new ContaCorrente();
		Conta cc3 = new ContaCorrente();
		
		Conta cp1 = new ContaPoupanca();
		Conta cp2 = new ContaPoupanca();
		Conta cp3 = new ContaPoupanca();
		
		cc1.deposita(1000); 
		cc2.deposita(2000); 
		cc3.deposita(3000);
		
		cp1.deposita(1000); 
		cp2.deposita(2000); 
		cp3.deposita(3000);
		
		
		Banco banco = new Banco();
		banco.adiciona(cc1);
		banco.adiciona(cc2);
		banco.adiciona(cc3);
		banco.adiciona(cp1);
		banco.adiciona(cp2);
		banco.adiciona(cp3);
		
		int quantContas = banco.pegaTotalDeContas();
		AtualizadorDeContas atc = new AtualizadorDeContas(0.01);
		
		for (int j = 0; j < quantContas; j++) {
			if(banco.pegaConta(j) != null){
				atc.roda(banco.pegaConta(j));
			}else{
				break;
			}
		}
	}
}
