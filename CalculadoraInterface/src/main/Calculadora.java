package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField valor1;
	private JTextField valor2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @return 
	 */

	public Calculadora() {
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel title = new JLabel("CALCULADORA SIMPLES");
		title.setFont(new Font("Arial", Font.PLAIN, 20));
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setBounds(10, 40, 314, 28);
		contentPane.add(title);
		
		valor1 = new JTextField();
		valor1.setBounds(76, 79, 186, 34);
		contentPane.add(valor1);
		valor1.setColumns(10);
		
		valor2 = new JTextField();
		valor2.setColumns(10);
		valor2.setBounds(76, 130, 186, 34);
		contentPane.add(valor2);
		
		JLabel lbl_resultado = new JLabel("Resultado:");
		lbl_resultado.setBounds(76, 302, 75, 28);
		contentPane.add(lbl_resultado);
		
		JLabel resultado = new JLabel("");
		resultado.setBounds(161, 302, 101, 28);
		contentPane.add(resultado);
		
		JButton soma = new JButton("+");
		soma.setFont(new Font("Tahoma", Font.PLAIN, 20));
		soma.setBounds(76, 190, 89, 34);
		contentPane.add(soma);
		
		JButton subtracao = new JButton("-");
		subtracao.setFont(new Font("Tahoma", Font.PLAIN, 20));
		subtracao.setBounds(175, 190, 89, 34);
		contentPane.add(subtracao);
		
		JButton multiplicacao = new JButton("*");
		multiplicacao.setFont(new Font("Tahoma", Font.PLAIN, 20));
		multiplicacao.setBounds(76, 240, 89, 34);
		contentPane.add(multiplicacao);
		
		JButton divisao = new JButton("/");
		divisao.setFont(new Font("Tahoma", Font.PLAIN, 20));
		divisao.setBounds(175, 240, 89, 34);
		contentPane.add(divisao);
		 
		soma.addActionListener((e) -> { 
			double n1 = Double.parseDouble(valor1.getText()); 
			double n2 = Double.parseDouble(valor2.getText());
			double total = n1 + n2;
			resultado.setText(String.format("%.2f", total));
		});
		
		subtracao.addActionListener((e)-> {
			double n1 = Double.parseDouble(valor1.getText()); 
			double n2 = Double.parseDouble(valor2.getText());
			double total = n1 - n2;
			resultado.setText(String.format("%.2f", total));
		});
		
		multiplicacao.addActionListener((e)-> { 
			double n1 = Double.parseDouble(valor1.getText()); 
			double n2 = Double.parseDouble(valor2.getText());
			double total = n1 * n2;
			resultado.setText(String.format("%.2f", total));
		});
		
		divisao.addActionListener((e)-> { 
			double n1 = Double.parseDouble(valor1.getText()); 
			double n2 = Double.parseDouble(valor2.getText());
			double total = n1 / n2;
			resultado.setText(String.format("%.2f", total));
		});
		
	}
}
