public class StringLab {
	public static void capitalize(String word) {
		String capitalWordFinal = word.substring(0, 1).toUpperCase()+word.substring(1).toLowerCase();
		System.out.println(capitalWordFinal);
	}
	public static void wheresWaldo(String phrase) {
		String foundWaldo = phrase.toLowerCase();
		System.out.println(foundWaldo.indexOf("waldo"));
	}
	public static void firstThingsFirst(String a, String b) {
		int aB = a.compareTo(b);
		if(aB < 0) {
			System.out.println(a + " " + b);
		}else if(aB > 0) {
			System.out.println(b + " " + a);
		}else {
			System.out.println("Both words start with the same letter.");
		}
	}
	public static void reverse(String s) {
		String reverseFinal = "";
		for(int i = s.length() - 1; i >=0; i--) {
			reverseFinal = reverseFinal + s.charAt(i);
		}
		System.out.println(reverseFinal);
	}
	public static void soLong(String a, String b) {
		int aBA = a.length();
		int aBB = b.length();
		if(aBA > aBB) {
			System.out.println(a);
		}else if(aBA < aBB) {
			System.out.println(b);
		}else {
			System.out.println(a + b);
		}
	}
	public static void afterMath(String phrase) {
		String lowerM = phrase.toLowerCase();
		if(lowerM.contains("math")) {
			System.out.println(lowerM.substring(lowerM.lastIndexOf(" math") + 1));
		}else {
			System.out.println("Dud");
		}
	}
	public static void letterize(String word) {
		for (int i = 0; i < word.length(); i++){
			System.out.println(word.charAt(i));
		}
	}
	public static void main(String[] args) {
		String capitalWord;
		String wheresWaldo;
		String aThen;
		String bThen;
		String reverseWord;
		String longA;
		String longB;
		String afterTheM;
		String letterDown;
		System.out.print("Please type any word: ");
		capitalize(capitalWord);
		System.out.print("Please type a phrase with the word \"Waldo\" in it: ");
		wheresWaldo(wheresWaldo);
		System.out.println("Please enter a word: ");
		System.out.println("Please enter another word: ");
		firstThingsFirst(aThen, bThen);
		System.out.println("Please enter a word: ");
		reverse(reverseWord);
		System.out.println("Please enter a word: ");
		System.out.println("Please enter another word: ");
		soLong(longA, longB);
		System.out.println("Please type out a phrase of any length: ");
		afterMath(afterTheM);
		System.out.println("Please enter a word: ");
		letterize(letterDown);
	}
	
}
