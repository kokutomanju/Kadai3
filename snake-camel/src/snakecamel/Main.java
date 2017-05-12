package snakecamel;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		SnakeCamelUtil scu = new SnakeCamelUtil();
			
		String[] cap = {"", "a", "xyz"};
		String[] uncap = {"", "A", "Xyz"};
		String[] sToc = {"abc", "abc_def", "abc_def_gh", "abc_def__gh", "_abc_def__"};
		String[] cTos= {"Abc", "AbcDef", "AbcDefGh"};
		
		int i;
		for(i=0; i<cap.length; i++) {
			cap[i] = scu.capitalize(cap[i]);
		}
		
		for(i=0; i<uncap.length; i++) {
			uncap[i] = scu.uncapitalize(uncap[i]);
		}
		
		for(i=0; i<sToc.length; i++) {
			sToc[i] = scu.snakeToCamelcase(sToc[i]);
		}
		
		for(i=0; i<cTos.length; i++) {
			cTos[i] = scu.camelToSnakecase(cTos[i]);
		}
	}
}
