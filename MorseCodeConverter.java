package MorseCode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MorseCodeConverter {

	@SuppressWarnings("rawtypes")
	private static MorseCodeTree mct = new MorseCodeTree();
	
	public MorseCodeConverter() {
		
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static String convertToEnglish(String code) {
		
		String[] word;
		String[] letter;
		String ret = "";
		
		word = code.split(" / ");
		
		
		for (int i = 0; i < word.length; i++) {
			letter = word[i].split(" ");
			
			for (int j = 0; j < letter.length; j++)
				ret += mct.fetch(letter[j]);
			
			ret += " ";
			
		}
		
		return ret.trim();
	}

	public static String convertToEnglish(File codeFile) throws FileNotFoundException{
		
		Scanner in = new Scanner(codeFile);
		String code = "";
		
		if (in.hasNext())
			code = in.nextLine();
		else {
			in.close();
			throw new FileNotFoundException();
		}
		return convertToEnglish(code);
	}
	
	public static String printTree() {
		
		ArrayList<String> tree = new ArrayList<String>();
		String print = "";
		
		tree = mct.toArrayList();
		
		for (int i = 0; i < tree.size(); i++)
			print += tree.get(i) + " ";
		
		return print;
	}
	
}
