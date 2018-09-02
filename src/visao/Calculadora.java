package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controle.Controle;
import modelo.Operacao;
import modelo.Soma;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class Calculadora {

	private JFrame frame;
	private JTextField campoDeTexto;
	private String operadorSelecionado;
	private JComboBox comboBox;
	
	ArrayList<Double> listaDeConta = new ArrayList<Double>();
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculadora() {
		initialize();
	}
	
	public void getLitaDeConta() {
		
		campoDeTexto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = campoDeTexto.getText();
				System.out.println(s);
			}
		});
	}

	
	private void calcAndSetText(Operacao operacao) {
		String result = String.valueOf(operacao.calcular());
		campoDeTexto.setText(result);
	}
	
	private void cutAndAddOperando(String campoDeTexto, Operacao operacao, int max) {
		String cortado[] = campoDeTexto.split(";");
		
		
		for (int i=0; i< max; i++) {
				String split = cortado[i];
				Double doublee = Double.parseDouble(split);
				
				operacao.addOperando(doublee);
				
		}
	}
	
	
	private Operacao getOpracao() {
		Operacao operacao = (Operacao) comboBox.getSelectedItem();
		return operacao;
	}
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnCalcular = new JButton("Calcular");
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String texto = campoDeTexto.getText();
				
				Operacao operacao = getOpracao();
				int max = operacao.getNumeroOperandos();
				
				cutAndAddOperando(texto, operacao, max);
				calcAndSetText(operacao);
		
			}


		});
		btnCalcular.setBounds(15, 87, 173, 29);
		frame.getContentPane().add(btnCalcular);
		
		campoDeTexto = new JTextField();
		campoDeTexto.setBounds(15, 16, 173, 29);
		frame.getContentPane().add(campoDeTexto);
		campoDeTexto.setColumns(10);
		
		comboBox = new JComboBox();
		comboBox.setBounds(15, 56, 173, 20);
		
		Controle c = new Controle();
		ArrayList<Operacao> operacoes = c.operacoesSuportadas();
		
		for(int i=0; i< operacoes.size(); i++) {
			comboBox.addItem(operacoes.get(i));
		}
		
		
		frame.getContentPane().add(comboBox);
		
	}
}
