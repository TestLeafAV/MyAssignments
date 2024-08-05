package week3.HomeAssignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementsUsingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare an array {1, 2, 3, 4, 10, 6, 8}.
		int[] A={1, 2, 3, 4, 10, 6, 8};
		
		List <Integer> LA=new ArrayList<Integer>();
		
		for(int i=0;i<A.length;i++)
		{
			LA.add(A[i]);
		}
		//Sort List to find missing item
		Collections.sort(LA);
		
		//initialize a counter count to keep track of the expected value
		int count=1;
		
		//to store current element during iteration and comparison check
		int item;
		
		//Comparison check if there is a gap in the sequence of numbers
		System.out.println("Missing Elements");
		for(int j=0;j<LA.size();j++)
		{
			item=LA.get(j);
			if(count!=item)
			{
				System.out.println(count);
				count++;
			}
			count++;
		}
		
	}

}
