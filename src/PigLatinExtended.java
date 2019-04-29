import java.util.Scanner;

public class PigLatinExtended {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String yes = "y";
		int k;
		
		System.out.println(" Welcome to the Pig Latin translator ");
		do {
		System.out.println(" Please provide the word to be translated : ");
		String word = scan.next();
		word = word.toLowerCase();
		if (word.matches("[a-zA-Z.,' ]+")) {
			System.out.println("oracion correcta");
		
		char[] array = word.toCharArray();
		char firstLetter = array[0];
		
		if (vowelOrConsonant(firstLetter)) {
			System.out.println(word.concat("way"));
		} else {
			k = word.length();
			char [] arrayPig = new char[k+2];
			for ( int i = 0; i < k-1; i++) {
				arrayPig [i] = array [i+1];
			}
			arrayPig[k-1]= array[0];
			arrayPig[k] = 'a';
			arrayPig[k+1] = 'y';	
		    System.out.println(arrayPig);  
		}
		} else {
			System.out.println("Sentence can not be translated");
		}
		
		System.out.println("Translate another word (y/n) :?");
		yes = scan.next();
		} while (yes.equalsIgnoreCase("y"));
		
	   
		scan.close();
		
	}
	public static boolean vowelOrConsonant(char a) {
		switch (a) {
		case 'a': 
			return true;
		case 'e':
			return true;
		case 'i':
			return true;
		case 'o':
			return true;
		case 'u':
			return true;
		default :
			return false;
		}
		
	}
	
}
