import java.util.Scanner;

//Author: Flora Lopez

public class PigLatin {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String yes = "y";
		int k;
		
		System.out.println(" Welcome to the Pig Latin translator ");
		do {
		System.out.println(" Please provide the word to be translated : ");
		String word = scan.next();
		word = word.toLowerCase();
		
		char[] array = word.toCharArray();
		char firstLetter = array[0];
		
		if (vowelOrConsonant(firstLetter)) {
			System.out.println(word.concat("way"));
		} else {
		
			k = word.length();
			char [] arrayPig = new char[k+2];
			int j = 0;
			while (!vowelOrConsonant(array[j]) && j < k) {
				j ++;
			}
			int p = k + 1;
			for ( int i = 0; i < k-j; i++) {
				arrayPig [i] = array [i+j];
			}
			for (int i = 0; i< j; i++) {
				int m = k - j;
				p = (k-j) + i;
				arrayPig[p] =array[i];
			}
			 arrayPig[k] = 'a';
			 arrayPig[k+1] = 'y';	
		    System.out.println(arrayPig);  
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
