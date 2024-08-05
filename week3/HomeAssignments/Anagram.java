package week3.HomeAssignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Define two input strings - Anagram
		String text1="stops";
		String text2="potss";
		
		//Check if the lengths of the two strings are equal
		if(text1.length()==text2.length())
		{
			//Convert both the strings to character arrays
			char[] charArray1 = text1.toCharArray();
			char[] charArray2 = text2.toCharArray();
			
			//Sort of the character arrays
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			
			//Check if the sorted arrays are equal
			if(Arrays.equals(charArray1, charArray2))
				System.out.println("Anagram");
			else
				System.out.println("Not an Anagram");
			
		}
		//The lengths of the two strings are not equal
		else
		{
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
		}

}
}

