package week3.HomeAssignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestValueInArrayUsingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declare an array {3, 2, 11, 4, 6, 7}.
		int[] A= {3, 2, 11, 4, 6, 7};
		
		//Convert Array to List
		List <Integer> LA=new ArrayList<Integer>();
		for(int i=0;i<A.length;i++)
		{
			LA.add(A[i]);
		}
		
		//Sort List
		Collections.sort(LA);
		
		//Display second largest
		System.out.println(LA.get(LA.size()-2));
	}

}
