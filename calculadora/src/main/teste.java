package main;

import javax.swing.JOptionPane;

public class teste {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		
		int opcao;
		int operando1;
		int operando2;
		int resultado;
		opcao= Integer.parseInt(JOptionPane.showInputDialog("1-Soma \n2-Subtração \n3-Multiplicação \n4-Divisão"));
		operando1= Integer.parseInt(JOptionPane.showInputDialog("Entre com um valor inteiro a :"));
		operando2= Integer.parseInt(JOptionPane.showInputDialog("Entre com um valor inteiro b"));
		
		
		if(opcao==1) {
			resultado=calc.soma(operando1, operando2);
			JOptionPane.showMessageDialog(null, "O resultado foi : " + resultado);
			
		} else if(opcao ==2) {
			resultado=calc.subtracao(operando1, operando2);
			JOptionPane.showMessageDialog(null, "O resultado foi : " + resultado);
			
		} else if(opcao==3) {
			resultado= calc.multiplicacao(operando1, operando2);
			JOptionPane.showMessageDialog(null, "O resultado foi : " + resultado);
			
			
		}else if(opcao==4) {
			resultado = calc.divisao(operando1, operando2);
			JOptionPane.showMessageDialog(null, "O resultado foi : " + resultado);
			
		}else {
			
			JOptionPane.showMessageDialog(null, "Opcão inválida!!!");
			
		}
		
		
		
		
		
		
		
		
		
	}

}