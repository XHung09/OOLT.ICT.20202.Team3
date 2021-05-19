package hust.soict.ict.quinemccluskey.test;

import java.util.ArrayList;

import hust.soict.ict.quinemccluskey.model.minterm.CombinedImplicant;
import hust.soict.ict.quinemccluskey.model.minterm.Implicant;
import hust.soict.ict.quinemccluskey.model.output.OutputFunction;
public class OutputFunctionTest extends OutputFunction{
	public static void main(String[] args) {	// test case
		OutputFunctionTest out = new OutputFunctionTest();
		ArrayList<Implicant> buff = new ArrayList<Implicant>();
		Implicant a = new CombinedImplicant("", "0---");
		Implicant b = new CombinedImplicant("", "-1--");
		Implicant c = new CombinedImplicant("", "-10-");
		Implicant d = new CombinedImplicant("", "01--");
		Implicant e = new CombinedImplicant("", "010-");

		buff.add(a);
		buff.add(b);
		buff.add(c);
		buff.add(d);
		buff.add(e);
		String str = out.toCharacterEquation(buff);
		System.out.println("Before deMorgan: " + str);
		System.out.println("After deMorgan: " + out.DeMorgan(str));		
	}
}
