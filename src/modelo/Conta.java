package modelo;

public abstract class Conta {
	
	protected double saldo = 0;
	
	public void deposita(double valor) {
		this.saldo += valor;
	}

	public void saca(double valor) {
	    this.saldo -= valor;
	}
	
	public abstract void  atualiza(double taxa);
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
