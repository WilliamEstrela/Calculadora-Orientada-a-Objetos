package teste;
import java.util.ArrayList;
import java.util.List;

import modelo.Operacao;
import modelo.OperacaoDoida;
import modelo.RaizQuadrada;
import modelo.Soma;
import modelo.Subtracao;

public class TesteOperacaoSoma {
	public static void main(String[] args) {
		/*Operacao s = new RaizQuadrada();
		System.out.println(s.addOperando(10));
		System.out.println(s.addOperando(20));
		System.out.println(s.getOperador()+":"+s.calcular());*/
		Operacao s = new RaizQuadrada();
		List<Operacao> ops = new ArrayList<>();
		ops.add(s);
		s = new Soma();
		ops.add(s);
		ops.add(new Subtracao());
		ops.add(new OperacaoDoida());
		for(int i = 0; i<ops.size(); i++) {
			Operacao op = ops.get(i);
			System.out.println("Operação: "+(i+1)+"-"+op.getOperador());
		}
		
		for(Operacao op: ops) {
			for(int i=1; i<=op.getNumeroOperandos();i++) {
				op.addOperando(i*Math.random());
			}
			System.out.println("Calculo:"+op.getOperador());
			
			for(int i=1; i<=op.getNumeroOperandos();i++) {
				System.out.printf("Operando(%d)=%2.2f %n",i,op.getOperando(i));
			}
			System.out.printf("Resultado=%2.2f %n%n",op.calcular());
			
		}
		
	}
}
