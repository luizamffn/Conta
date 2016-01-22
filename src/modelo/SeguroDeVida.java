package modelo;

import interfaces.Tributavel;

public class SeguroDeVida implements Tributavel{

	@Override
	public double calcularTributos() {
		return 42;
	}
	
	@Override
	public String toString() {
		return ""+ this.calcularTributos();
	}
	
}
