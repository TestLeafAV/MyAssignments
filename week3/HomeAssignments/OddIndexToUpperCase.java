package week3.HomeAssignments;

public class OddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String to be updated
		String test = "changeme";
		
		//Convert the given String to a character array
		char[] charArray = test.toCharArray();
		
		//Loop to iterate through each character of the String (from end to start).
		for(int i=0;i<charArray.length;i++)
		{
			//Find the odd index within the loop
			if(i%2!=0)
			
			//change the character to upper case only if the index is odd
			charArray[i]=Character.toUpperCase(charArray[i]);
		}
		System.out.println("Converted String is:");
		System.out.println(charArray);
			
	}

}
