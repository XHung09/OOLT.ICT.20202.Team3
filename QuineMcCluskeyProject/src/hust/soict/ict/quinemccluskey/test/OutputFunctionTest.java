package hust.soict.ict.quinemccluskey.test;

import java.util.ArrayList;

import hust.soict.ict.quinemccluskey.model.minterm.CombinedImplicant;
import hust.soict.ict.quinemccluskey.model.minterm.Implicant;
import hust.soict.ict.quinemccluskey.model.output.OutputFunction;
public class OutputFunctionTest extends OutputFunction{
	public static void main(String[] args) {	// test case
		OutputFunctionTest out = new OutputFunctionTest();
		ArrayList<Implicant> buff = new ArrayList<Implicant>();
		Implicant a = new CombinedImplicant("1", "0001");
		Implicant b = new CombinedImplicant("3", "0101");
	
		buff.add(a);
		buff.add(b);
		
		String str = out.toCharacterEquation(buff);
		System.out.println("Before deMorgan: " + str);
		System.out.println("After deMorgan: " + out.DeMorgan(str));		
	}
}
