package week3.HomeAssignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declare a String array
		String[] comp={"HCL", "Wipro", "Aspire Systems", "CTS"};
		
		//Convert String Array to List
		List <String> LC=new ArrayList<String>();
		for(int i=0;i<comp.length;i++)
		{
			LC.add(comp[i]);
		}
		
		//Sort List
		Collections.sort(LC);
		
		//Print in Reverse Order
		System.out.println("After Sort:");
		for(int j=LC.size()-1;j>=0;j--)
		{
			System.out.println(LC.get(j));
		}
		
	}

}
