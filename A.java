package teste;
 //criando a classe
public class A {
	private int a1; //atributos
	private float a2; 
	private String a3;
	private float soma;
	
	    public static void main(String[] args) {
	      
	    }
	    public int getA1() { 
	        return a1;
	    }

	    public void setA1(int a1) {
	        this.a1 = a1;
	    }
	    public float getA2() {
	        return a2;
	    }

	    public void setA2(float a2) {
	        this.a2 = a2;
	    }
	    public String getA3() {
	        return a3;
	    }

	    public void setA3(String a3) {
	        this.a3 = a3;
	    }
	    public float soma() {
	    	return soma;
	    }
	    public void soma(int a1, float a2) {//somando valores
	    	soma = a1 + a2;
	    }
}
