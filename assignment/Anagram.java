package week3.assignment;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1="stops";
		String text2="posts";
		
		if(text1.length()==text2.length()) {
			char[] charArray1 = text1.toCharArray();
		    char[] charArray2 = text2.toCharArray();
		    Arrays.sort(charArray1);
		    Arrays.sort(charArray2);
		   boolean result = Arrays.equals(charArray1, charArray2);
		   if(result==true) {
			   System.out.println("The given strings are Anagram.");
		   }
		   else {
			   System.out.println("The given strings are not an Anagram.");
		   }
		}
	else {
		System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
		}
	}
}


