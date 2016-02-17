package modelo;

public abstract class Conta {
	protected Cliente cliente;
	protected int num= 0;
	protected double saldo = 0;
	
	public Conta() {
		// TODO Auto-generated constructor stub
	}
	
	public Conta(Cliente cliente) {
		this.num++;
		this.cliente = cliente;
	}
	
	public void deposita(double valor) {
		  if (valor < 0) {
		    throw new ValorInvalidoException(valor);
		  } else {
		    this.saldo += valor;    
		  }    
	}

	public boolean saca(double valor) {
		if(valor <= this.saldo){
			this.saldo -= valor;
			return true;
		}else{
			return false;
		}
	    
	}
	
	public abstract void  atualiza(double taxa);
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
