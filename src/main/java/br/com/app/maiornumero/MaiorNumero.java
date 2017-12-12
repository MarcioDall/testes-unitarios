package br.com.app.maiornumero;

public class MaiorNumero {

	private int number1;
	private int number2;

	public void setNumero1(int number1) {
		this.number1 = number1;
	}

	public void setNumero2(int number2) {
		this.number2 = number2;
	}
	
	public int compareNumero() {
		int maior = number1 > number2 ? number1 : number2;
		return maior;
	}
}