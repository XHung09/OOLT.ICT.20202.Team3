package hust.soict.ict.quinemccluskey.model.output;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

import hust.soict.ict.quinemccluskey.model.minterm.Implicant;
import hust.soict.ict.quinemccluskey.model.table.PITable;

public abstract class OutputFunction {
	private String result;	// in SOP format
	public OutputFunction() {
		super();
	}
	public OutputFunction(String result) {
		super();
		this.result = result;
	}
	private String swap(String str, String one, String two){
	    return Arrays.stream(str.split(one, -1))
	        .map(s -> s.replaceAll(two, one))
	        .collect(Collectors.joining(two));
	}
	public String DeMorgan(String str) {
		str = swap(str, "D'", "D");
		str = swap(str, "C'", "C");
		str = swap(str,"B'", "B");
		str = swap(str, "A'", "A");
		StringBuilder newStr = new StringBuilder(str);
		int []index = new int[str.length()];
		int j = 0;
		for(int i = 0; i < str.length(); i++) {
			if(newStr.charAt(i) == '.') {
				newStr.setCharAt(i, '+');
				j ++;
				continue;
			}else if(newStr.charAt(i) == '+') {
				index[j] = i;
				newStr.setCharAt(i, '.');
				continue;
			}
		}
		newStr.insert(0, '(');
		for(int i = 0; i < newStr.length(); i++) {
			if(newStr.charAt(i) == '.') {
				newStr.insert(i, ')');
				newStr.insert(i + 2, '(');
				i ++;
			}
		}
		newStr.append(')');
		return newStr.toString();
	}

	public String toCharacterEquation(ArrayList<Implicant> a) {		 
		StringBuilder res = new StringBuilder();						
		String []buff = new String[a.size()];
		char apostrophe = "\u0027".charAt(0);	// apostrophe character: " ' "	
		int[] count = new int[a.size()];	// count number of consecutive character '-' from the end of the string
		for(int i = 0; i < a.size(); i ++) {
			count[i] = 1;
		}
		for(int i = 0; i < a.size(); i ++) {
			buff[i] = a.get(i).getBinaryExpression().toString();
			for(int j = 0; j < buff[i].length(); j ++) {
				if((buff[i].length() - (j + 2) > 0)
					&& buff[i].charAt(buff[i].length() - (j + 1)) == '-' 
					&& buff[i].charAt(buff[i].length() - (j + 2)) == '-' ) {	
					// count consecutive character '-' from the end of the string
					count[i] ++;
					
				}
			}
		}
		for(int i = 0; i < a.size(); i ++) {
			buff[i] = a.get(i).getBinaryExpression().toString();
			StringBuilder str = new StringBuilder();
			for(int j = 0; j < buff[i].length(); j ++) {
				if(buff[i].charAt(buff[i].length() - 1) == '-') {	// case when '-' is the ending char
					if(buff[i].charAt(j) != '-') {
						str.append((char)(j + 65));
						if(buff[i].charAt(j) == '0')
							str.append(apostrophe);		
						if((buff[i].length() != count[i] + 1)  && j != (buff[i].length() - (count[i] + 1)) && j >= 0 ) {
							str.append('.');
						}
					}
				}
				else {
					if(buff[i].charAt(j) != '-') {
						str.append((char)(j + 65));
						if(buff[i].charAt(j) == '0')
							str.append(apostrophe);		
						if(j != (buff[i].length() - 1)) {
							str.append('.');
						}
					}
				}
			}
			res.append(str);
			if(i != (a.size() - 1))
				res.append('+');
		}
		return res.toString();
	}
	public ArrayList<Implicant> takeEPI(PITable table){	// unfinished due to the lack of PITable method implementation
		ArrayList<Implicant> tMin = new ArrayList<Implicant>();
		return tMin;
	}
	public String getResult() {
		return result;
	}	
}
