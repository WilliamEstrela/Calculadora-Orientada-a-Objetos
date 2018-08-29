package modelo;

public class Soma extends Operacao {

	public double calcular() {
		return this.getOperando(1)+this.getOperando(2);
	}
	@Override
	public int getNumeroOperandos() {
		return 2;
	}
	@Override
	public String getOperador() {
		return "Soma";
	}

}
