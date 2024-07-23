package week1.HomeAssignments;

import java.util.Arrays;

public class FindMissingElement {
public static void main(String[] args) {
	 int[] arr = { 1, 4, 3, 2, 8, 6, 7 };
	 Arrays.sort(arr);
	 for (int i=0;i<arr.length;i++)
	 {
		 if(i+1!=arr[i])
			 {
			 System.out.println("Missing Number:"+(i+1));
			
			 break;
			 }
	 }
}
}