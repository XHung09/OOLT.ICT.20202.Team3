package hust.soict.ict.quinemccluskey.model.output;

import java.util.List;

import hust.soict.ict.quinemccluskey.model.minterm.Implicant;
import hust.soict.ict.quinemccluskey.model.table.PITable;

public class POS extends OutputFunction{

	@Override
	public void generate(PITable table, List<Implicant> minterms) {
		takeEPI(table, minterms);
		toCharacterEquation(EPI);
		result = DeMorgan();	
	}
}
