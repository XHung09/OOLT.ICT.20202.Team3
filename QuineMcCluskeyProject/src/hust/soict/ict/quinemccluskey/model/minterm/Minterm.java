package hust.soict.ict.quinemccluskey.model.minterm;

import hust.soict.ict.quinemccluskey.model.Variable;

public class Minterm extends Implicant {

	// Getters and setters
	public Minterm(String minterm) {
		super(minterm);
	}

	// Methods
	public void toBinaryExpression() {
		String binEx[] = implicant.split("\\s");			// split by white space
		
		for (int i = 0; i < binEx.length; i++) {
			String temp = Integer.toBinaryString(Integer.parseInt(binEx[i]));
			
			switch (Variable.numberDigits) {
				case 4:
					if (temp.length() < 4) {
						while (temp.length() < 4) {
							temp = "0" + temp;
						}
					}
					
				case 3:
					if (temp.length() < 3) {
						while (temp.length() < 3) {
							temp = "0" + temp;
						}
					}
					
				default:
					binaryExpression = temp + " ";
			}
		}	
	}
	
}
