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
	
	
	ArrayList<String> listaDeConta = new ArrayList<String>();
	
	
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

		
		
		listaDeConta.add(numero);
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
				
				
				
				
				Soma s;
				if(listaDeConta.get(1) == "+") {
					s = new Soma();
					
					double operando1 = Double.parseDouble(listaDeConta.get(0));
					double operando2 = Double.parseDouble(listaDeConta.get(2));
					
					s.addOperando(operando1);
					s.addOperando(operando2);
					Double resultado;
					resultado = controle.Calcular(s);
					String total2 = String.valueOf(resultado);
					campoDeTexto.setText(total2);
		
					
				}
				
	
			
				
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
		
		JButton button_10 = new JButton("+");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setFildAndAddListCount("+");
			}
		});
		button_10.setBounds(212, 90, 63, 29);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("-");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setFildAndAddListCount("-");
			}
		});
		button_11.setBounds(212, 163, 63, 29);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("sqrt");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button_12.setText("sqr()");
			}
		});
		button_12.setBounds(212, 129, 63, 29);
		frame.getContentPane().add(button_12);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(298, 94, 104, 20);
		
		Controle c = new Controle();
		ArrayList<Operacao> operacoes = c.operacoesSuportadas();
		
		for(int i=0; i< operacoes.size(); i++) {
			comboBox.addItem(operacoes.get(i).toString());
		}
		
		
		frame.getContentPane().add(comboBox);
		
	}
}
