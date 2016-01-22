package modelo;

public class Banco {
	private Conta[] conta;
	private int i = 0;
	
	public Banco() {
		this.conta = new Conta[10];
	}
	
	public void adiciona(Conta c){
		this.conta[i] = c;
		i++;
	}
	
	public Conta pegaConta(int x){
		return this.conta[x];
	}
	
	public int pegaTotalDeContas(){
		return this.conta.length;
	}
	
}
