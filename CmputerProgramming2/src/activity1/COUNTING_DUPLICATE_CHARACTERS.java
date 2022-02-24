package activity1;

public class COUNTING_DUPLICATE_CHARACTERS {

	public static void main(String[] args) {
      String word = "regine l frencillo";
      int count;
      
      char stringword[] = word.toCharArray();
      
      System.out.println("Duplicate Characters in the given string : " + word);
      		
       for (int a = 0;a <stringword.length; a++) {
    	   count = 1;
    	   for (int b = a+1;b <stringword.length;b++) {
    		   if (stringword[a] == stringword[b] && stringword[a] != ' ') {
    			   count++;
    			   stringword[b] = 0;
    		   }
    	   } 
    	   
    	   if(count > 1 && stringword[a] != '0')
    		   System.out.println(stringword[a]);
       }
	}

}
