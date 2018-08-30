package controle;

import java.awt.List;
import java.util.ArrayList;

import modelo.Operacao;
import modelo.RaizQuadrada;
import modelo.Soma;
import modelo.Subtracao;

public class Controle {

	private ArrayList<Operacao> operacaoSuportadas = new ArrayList<Operacao>();
	
	public Controle() {
		this.initiControle();
	}
	
	public void initiControle() {
		operacaoSuportadas.add(new Soma());
		operacaoSuportadas.add(new Subtracao());
		operacaoSuportadas.add(new RaizQuadrada());
	}
	
	public ArrayList<Operacao> operacoesSuportadas() {
		return operacaoSuportadas;
	}
	public double Calcular(Operacao obj) {
		return obj.calcular();
	}
	

}
