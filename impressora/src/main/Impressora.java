package main;

public class Impressora {
	private float a,b,c;
	 
	public float exbir (float a) {
		Float.toString(a);
		System.out.println(" O valor escolhido foi " + a);
		return a;
	}
	
	public float exbir (float a, float b) {
	    Float.toString(a);
	    Float.toString(b);
	    System.out.println(" O valor escolhido foi " + a + "," + b);
	    return a + b;
	}
	
	public String exbir (float a, String b) {
	    Float.toString(a);
	    System.out.println(" O valor escolhido foi " + a + "," + b);
	    return a + b;
	}
	
	public String exbir ( String a, float b) {
	    Float.toString(b);
	    System.out.println(" O valor escolhido foi " + a + "," + b);
	    return a + b;
	}
	
	public String exbir (String a, String b, String c) {
	    System.out.println(" O valor escolhido foi " + a + "," + b + "," + c);
	    return a + b + c;
	}
	
	public String exbir (int a, int b, String c) {
	    Integer.toString(a);
	    Integer.toString(b);
	    System.out.println(" O valor escolhido foi " + a + "," + b + "," + c);
	    return a + b + c;
	}
	
	public float getA() {
		return a;
	}
	
	public void setA(float a) {
		this.a = a;
	}
	
	public float getB() {
		return b;
	}
	
	public void setB(float b) {
		this.b = b;
	}
	
	public float getC() {
		return c;
	}
	
	public void setC(float c) {
		this.c = c;
	}    
}