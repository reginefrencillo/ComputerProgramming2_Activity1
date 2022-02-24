package activity1;

public class REMOVING_WHITE_SPACES_FROM_A_STRING {

	public static void main(String[] args) {
		 String words="Life Are Indeed Beautiful";
		  System.out.println("Current String with White Spaces : " + words);        
		        
		  words = words.replaceAll("\\s", ""); 
		        System.out.println("The String Without White Spaces : "+words); 
		     }
		
	}

