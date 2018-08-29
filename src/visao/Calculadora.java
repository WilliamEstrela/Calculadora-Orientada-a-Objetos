package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controle.Controle;
import modelo.Soma;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora {

	private JFrame frame;
	private JTextField campoDeTexto;

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
	
	public void setTextFild(String numero) {
		this.campoDeTexto.setText(numero.toString());
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
				
				Soma s = new Soma();
				
				s.addOperando(1);
				s.addOperando(2);
				
				System.out.println(controle.Calcular(s));
				
			}
		});
		btnCalcular.setBounds(298, 199, 115, 29);
		frame.getContentPane().add(btnCalcular);
		
		campoDeTexto = new JTextField();
		campoDeTexto.setBounds(15, 16, 387, 58);
		frame.getContentPane().add(campoDeTexto);
		campoDeTexto.setColumns(10);
		
		JButton button = new JButton("1");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTextFild("1");
			}
		});
		button.setBounds(15, 90, 41, 29);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("2");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setTextFild("2");
			}
		});
		button_1.setBounds(71, 90, 41, 29);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("3");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTextFild("3");
			}
		});
		button_2.setBounds(127, 90, 41, 29);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("4");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTextFild("4");
			}
		});
		button_3.setBounds(15, 129, 41, 29);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("5");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTextFild("5");
			}
		});
		button_4.setBounds(71, 129, 41, 29);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("6");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTextFild("6");
			}
		});
		button_5.setBounds(127, 129, 41, 29);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("7");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTextFild("7");
			}
			
		});
		button_6.setBounds(15, 163, 41, 29);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("8");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTextFild("8");
			}
		});
		button_7.setBounds(71, 163, 41, 29);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("9");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTextFild("9");
			}
		});
		button_8.setBounds(127, 163, 41, 29);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("0");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTextFild("0");
			}
		});
		button_9.setBounds(71, 199, 41, 29);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("+");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTextFild("+");
			}
		});
		button_10.setBounds(212, 90, 63, 29);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("-");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTextFild("-");
			}
		});
		button_11.setBounds(212, 163, 63, 29);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("sqrt");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_12.setBounds(212, 129, 63, 29);
		frame.getContentPane().add(button_12);
	}
}
