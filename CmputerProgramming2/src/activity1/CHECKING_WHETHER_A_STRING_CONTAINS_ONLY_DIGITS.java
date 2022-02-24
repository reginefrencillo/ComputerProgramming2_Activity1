package activity1;

public class CHECKING_WHETHER_A_STRING_CONTAINS_ONLY_DIGITS {

	public static void main(String[] args) {
	 String word = "123";
     System.out.println("String: "+ word);
     if(word.matches("[0-9]+") && word.length() >1) {
        System.out.println("String contains only digits!");
     
     }else
       System.out.println("String contains digits as well as other characters!");
     }
	}


