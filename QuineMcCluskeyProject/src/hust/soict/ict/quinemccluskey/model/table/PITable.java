package hust.soict.ict.quinemccluskey.model.table;

import java.util.ArrayList;
import java.util.List;

import hust.soict.ict.quinemccluskey.model.minterm.Implicant;

public class PITable extends Table {
    private IntermediateTable table;

    public PITable(IntermediateTable table) {
        primeImplicants = new ArrayList<Implicant>();
        this.table = table;
    }
    
    public List<Implicant> getPrimeImplicants() {
    	return this.primeImplicants;
    }

    @Override
    public void generate() {
        primeImplicants = table.getPrimeImplicants();
    }

    @Override
    public void display() {
        for(Implicant i : primeImplicants) {
            System.out.println(i.getImplicant() + " " + i.getBinaryExpression());
        }
    }

}
