package week3.HomeAssignments;

import java.util.ArrayList;
import java.util.List;

public class IntersectionInArraysUsingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declare two arrays {3, 2, 11, 4, 6, 7} and {1, 2, 8, 4, 9, 7}
		int[] A1= {3, 2, 11, 4, 6, 7};
		int[] A2= {1, 2, 8, 4, 9, 7};
		
		//Add array elements to a list
		List <Integer> L1=new ArrayList<Integer>();
		List <Integer> L2=new ArrayList<Integer>();
		
		for(int i=0;i<A1.length;i++)
		{
			L1.add(A1[i]);
		}
		
		for(int j=0;j<A2.length;j++)
		{
			L2.add(A2[j]);
		}
		
		System.out.println("Intersecting Values");
		
		//Compare both the List for same values
		for(int x=0;x<L1.size();x++)
		{
			int L1item=L1.get(x);
			for(int y=0;y<L2.size();y++)
			{
				int L2item=L2.get(y);
				if(L1item==L2item)
				{
					System.out.println(L1item);
				}
				
			}
		}
	}

}
