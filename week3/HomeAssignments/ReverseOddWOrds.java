package week3.HomeAssignments;

public class ReverseOddWOrds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Reverse the odd position words from a String
		String test = "I am a software tester";
		
		//Split the words and have it in an array
		String[] split = test.split(" ");
		
		//Traverse through each word using loop
		for(int i=0;i<split.length;i++)
		{
			//Find the odd index within the loop
			if(i%2!=0)
			{
				//Convert the String array into a character array
				char[] charArray = split[i].toCharArray();
				for(int j=charArray.length-1;j>=0;j--)
				{
					System.out.print(charArray[j]);
					
				}
			}
			else
				//Print the even position words
				System.out.print(" "+split[i]+" ");
		}
	}

}
