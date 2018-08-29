package modelo;

public class RaizQuadrada extends Operacao {
	@Override
	public double calcular() {
		return Math.sqrt(this.getOperando(1));
	}
	@Override
	public int getNumeroOperandos() {
		return 1;
	}
	@Override
	public String getOperador() {
		return "Raiz Quadrada";
	}

}
