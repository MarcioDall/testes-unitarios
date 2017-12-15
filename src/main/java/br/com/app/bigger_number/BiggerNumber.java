package br.com.app.bigger_number;

public class BiggerNumber {

	private int number1;
	private int number2;

	public void setNumberOne(int number1) {
		this.number1 = number1;
	}

	public void setNumberTwo(int number2) {
		this.number2 = number2;
	}
	
	public int compareNumber() {
		int greater = number1 > number2 ? number1 : number2;
		return greater;
	}
}