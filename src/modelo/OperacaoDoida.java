package modelo;

public class OperacaoDoida extends Operacao {

	@Override
	public double calcular() {
		double x = this.getOperando(1);
		return x * 2 + Math.sqrt(x);
	}

	@Override
	public int getNumeroOperandos() {
		return 1;
	}

	@Override
	public String getOperador() {
		return "Operação Doida";
	}

}
