package main; 

public class Teste {

	public static void main(String[] args) {
		Impressora imp = new Impressora();
		
		imp.exbir(10);
		imp.exbir(10, 8);
		imp.exbir(6, "Olá!");
		imp.exbir(3, 6, "Lola linda");
		imp.exbir(" Terceira Mensagem ", 7);
		imp.exbir("Ola", "Oi", "Hello");	
	}
}
