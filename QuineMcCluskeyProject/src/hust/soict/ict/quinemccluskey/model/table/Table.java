package hust.soict.ict.quinemccluskey.model.table;

import java.util.List;

import hust.soict.ict.quinemccluskey.model.minterm.Implicant;

public interface Table {
    void generate();
    void display();
    List<Implicant> getPrimeImplicants();
}
