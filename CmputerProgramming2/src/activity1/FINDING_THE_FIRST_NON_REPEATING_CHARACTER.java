package activity1;

public class FINDING_THE_FIRST_NON_REPEATING_CHARACTER {

	public static void main(String[] args) {
	   
		String word = "PHILIPPINES";
		
		for(char a:word.toCharArray()) {
			if (word.indexOf(a) == word.lastIndexOf(a)) {
				System.out.println("First Non-repeating Charracter of the word : " + word);
				System.out.println(a);
				break;
			}
		}
		

	}

}
