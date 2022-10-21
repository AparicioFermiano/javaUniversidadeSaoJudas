package main;

public class Calculadora {

	public int soma(int a, int b) {
		int resultado;
		resultado = a+b;
		return resultado;
	}
	
	
	public float soma(float a , float b) {
		return a+b;
	}

	public String soma (String a, String b) {
		Integer.parseInt(a);
		Integer.parseInt(b);
		return a+b;
	}
	
	public int soma (String a , int b) {
		return Integer.parseInt(a)+b;	
	}
	

	public int soma (int a, int b, int c) {
		return a+b+c;
	}
	
	public int subtracao(int a , int b) {
		int resultado;
		resultado = a-b;
		return resultado;
	}
	
	public int multiplicacao( int a , int b) {
		int resultado;
		resultado = a*b;
		return resultado;
	}
	
	public int divisao(int a, int b) {
		return a/b;
	}
	
	
	
	

}