package modelo;

public class ContaPoupanca extends Conta{
	
	public ContaPoupanca() {
		// TODO Auto-generated constructor stub
	}

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 3;
		
	}


	
//	@Override
//	public void atualiza(double taxa) {
//		super.atualiza(taxa *3);
//	}
	
	

}
