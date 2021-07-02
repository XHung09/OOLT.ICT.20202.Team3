package hust.soict.ict.quinemccluskey.model.minterm;

import hust.soict.ict.quinemccluskey.utils.Variable;

public class Minterm extends Implicant {

	// Getters and setters
	public Minterm(String implicant) {
		super(implicant);
		this.toBinaryExpression();
	}

	public Minterm(String implicant, String binaryExpression) {
		super(implicant, binaryExpression);
	}
	
	@Override
	public void setImplicant(String implicant) {
		this.implicant = implicant;
		this.toBinaryExpression();
	}
	
	// Methods
	public void toBinaryExpression() {
		binaryExpression = Integer.toBinaryString(Integer.parseInt(implicant));
		
		while (binaryExpression.length() < Variable.numberDigits) {
			binaryExpression = "0" + binaryExpression;
		}
	}	

}
	

