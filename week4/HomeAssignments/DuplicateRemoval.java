package week4.HomeAssignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateRemoval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="aishwarya";
		char[] charArray = name.toCharArray();
		Set<Character> uniq=new LinkedHashSet<Character>();
		for(Character i:charArray)
		{
			uniq.add(i);
		}

		String unique="";
		for(Character j:uniq)
		{
			unique+=j;
		}
		System.out.println(unique);
	}

}
