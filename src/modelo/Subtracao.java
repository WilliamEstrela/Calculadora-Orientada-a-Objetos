package modelo;

public class Subtracao extends Operacao {


	@Override
	public double calcular() {
		return this.getOperando(1)-this.getOperando(2);
	}
	@Override
	public int getNumeroOperandos() {
		return 2;
	}
	@Override
	public String getOperador() {
		return "Subtração";
	}

}
