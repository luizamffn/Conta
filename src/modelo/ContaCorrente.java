package modelo;

import interfaces.Tributavel;

public class ContaCorrente extends Conta implements Tributavel{
	
	public ContaCorrente() {

	}
	
	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 2;
	}
	
	@Override
	public void deposita(double valor) {
		this.saldo += valor - 0.10;
	}

	@Override
	public double calcularTributos() {
		return  this.getSaldo() * 0.01;
	}
	
	@Override
	public String toString() {
		return "" + this.calcularTributos();
	}
}
