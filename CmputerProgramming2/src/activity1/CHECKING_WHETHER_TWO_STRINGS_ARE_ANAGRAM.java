package activity1;

import java.util.Scanner;
import java.util.Arrays;

public class CHECKING_WHETHER_TWO_STRINGS_ARE_ANAGRAM {

	public static void main(String[] args) {

	    Scanner r = new Scanner(System.in);

	    System.out.print("Enter first String: ");
	    String a1 = r.nextLine();
	    System.out.print("Enter second String: ");
	    String a2 = r.nextLine();

	    if(a1.length() == a2.length()) {

	      char[] a1Array1 = a1.toCharArray();
	      char[] a2Array2 = a2.toCharArray();

	      Arrays.sort(a1Array1);
	      Arrays.sort(a2Array2);

	      boolean result = Arrays.equals(a1Array1, a2Array2);

	      if(result) {
	        System.out.println(a1 + " and " + a2 + " are anagram.");
	      }
	      else {
	        System.out.println(a1 + " and " + a2 + " are not anagram.");
	      }
	    }
	    else {
	      System.out.println(a1 + " and " + a2 + " are not anagram.");
	    }

	   
	  }
	}

