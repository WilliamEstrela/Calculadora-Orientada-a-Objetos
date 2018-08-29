package modelo;

import java.util.ArrayList;
import java.util.List;

public abstract class Operacao {
	private List<Double> operandos;
	
	
	public Operacao() {
		this.operandos = new ArrayList<>();
	}
	
	public abstract double calcular();
	public abstract int getNumeroOperandos();	

	public abstract String getOperador();
	
	public boolean addOperando(double valor) {
		if(this.operandos.size() < this.getNumeroOperandos()) {
			this.operandos.add(valor);
			return true;
		}
		return false;
	}
	public double getOperando(int num) {
		if(num < 1 || num> this.operandos.size()) {
			throw new RuntimeException("Operando não existe!");
		}
		return this.operandos.get(num-1);
	}
	public void limparOperandos() {
		this.operandos.clear();
	}
	
}
