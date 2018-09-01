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
	
	public void setFildAndAddListCount(String numero) {
		String numeros;
		
		numeros = campoDeTexto.getText()+numero;
		this.campoDeTexto.setText(numeros);
	
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
		
				Controle controle = new Controle();
					
					Operacao selecionado = (Operacao) comboBox.getSelectedItem();
					
					int numeroOperandos = selecionado.getNumeroOperandos();
					
					for(int i=0; i< numeroOperandos; i++) {
						
						
						Double operando = listaDeConta.get(i);
						
						selecionado.addOperando(operando);
						
					}
		
						
					Double resultado = selecionado.calcular();
					
					campoDeTexto.setText(String.valueOf(resultado));
					System.out.println(resultado);
	
	
			
				
			}
		});
		btnCalcular.setBounds(298, 199, 115, 29);
		frame.getContentPane().add(btnCalcular);
		
		campoDeTexto = new JTextField();
		campoDeTexto.setBounds(15, 16, 387, 58);
		frame.getContentPane().add(campoDeTexto);
		campoDeTexto.setColumns(10);
		
		JButton button1 = new JButton("1");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setFildAndAddListCount("1");
			}
		});
		button1.setBounds(15, 90, 41, 29);
		frame.getContentPane().add(button1);
		
		JButton button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setFildAndAddListCount("2");
			}
		});
		button2.setBounds(71, 90, 41, 29);
		frame.getContentPane().add(button2);
		
		JButton button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setFildAndAddListCount("3");
			}
		});
		button3.setBounds(127, 90, 41, 29);
		frame.getContentPane().add(button3);
		
		JButton button4 = new JButton("4");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setFildAndAddListCount("4");
			}
		});
		button4.setBounds(15, 129, 41, 29);
		frame.getContentPane().add(button4);
		
		JButton button5 = new JButton("5");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setFildAndAddListCount("5");
			}
		});
		button5.setBounds(71, 129, 41, 29);
		frame.getContentPane().add(button5);
		
		JButton button6 = new JButton("6");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setFildAndAddListCount("6");
			}
		});
		button6.setBounds(127, 129, 41, 29);
		frame.getContentPane().add(button6);
		
		JButton button7 = new JButton("7");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setFildAndAddListCount("7");
			}
			
		});
		button7.setBounds(15, 163, 41, 29);
		frame.getContentPane().add(button7);
		
		JButton button8 = new JButton("8");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setFildAndAddListCount("8");
			}
		});
		button8.setBounds(71, 163, 41, 29);
		frame.getContentPane().add(button8);
		
		JButton button9 = new JButton("9");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setFildAndAddListCount("9");
			}
		});
		button9.setBounds(127, 163, 41, 29);
		frame.getContentPane().add(button9);
		
		JButton button0 = new JButton("0");
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setFildAndAddListCount("0");
			}
		});
		button0.setBounds(71, 199, 41, 29);
		frame.getContentPane().add(button0);
		
		comboBox = new JComboBox();
		comboBox.setBounds(298, 94, 104, 20);
		
		Controle c = new Controle();
		ArrayList<Operacao> operacoes = c.operacoesSuportadas();
		
		for(int i=0; i< operacoes.size(); i++) {
			comboBox.addItem(operacoes.get(i));
		}
		
		
		frame.getContentPane().add(comboBox);
		
		JButton button = new JButton("Clear");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				campoDeTexto.setText("");
				listaDeConta.clear();
			}
		});
		button.setBounds(127, 199, 63, 29);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("add");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//TODO converter o texto digitado em string
				Double numero = Double.parseDouble(campoDeTexto.getText());
				listaDeConta.add(numero);
				
			}
		});
		button_1.setBounds(212, 202, 63, 29);
		frame.getContentPane().add(button_1);
		
	}
	
}
