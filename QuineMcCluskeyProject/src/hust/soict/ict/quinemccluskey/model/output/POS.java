package hust.soict.ict.quinemccluskey.model.output;

import java.util.List;

import hust.soict.ict.quinemccluskey.model.minterm.Implicant;
import hust.soict.ict.quinemccluskey.model.table.PITable;

public class POS extends OutputFunction{

	@Override
	public void generate(PITable table, List<Implicant> implicants) {
		takeEPI(table, implicants);
		DeMorgan();	
	}
	
}
