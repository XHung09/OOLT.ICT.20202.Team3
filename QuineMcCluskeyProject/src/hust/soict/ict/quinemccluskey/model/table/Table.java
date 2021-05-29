package hust.soict.ict.quinemccluskey.model.table;

import java.util.ArrayList;
import java.util.List;

import hust.soict.ict.quinemccluskey.model.minterm.Implicant;

public abstract class Table {
	protected List<Implicant> primeImplicants = new ArrayList<> ();
	
	public abstract void generate();
	public abstract void display();
	public abstract List<Implicant> getPrimeImplicants();
}
